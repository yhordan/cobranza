package com.leonxiiicobranza.cobranza.jwt.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.leonxiiicobranza.cobranza.DAO.personalDao;
import com.leonxiiicobranza.cobranza.jwt.auth.JwtUtil;
import com.leonxiiicobranza.cobranza.jwt.model.ErrorRes;
import com.leonxiiicobranza.cobranza.jwt.model.LoginReq;
import com.leonxiiicobranza.cobranza.jwt.model.LoginRes;
import com.leonxiiicobranza.cobranza.jwt.repositori.UserRepository;
import com.leonxiiicobranza.cobranza.modelo.app_usuarios;



@Controller
@RequestMapping("/rest/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    @Autowired
	private UserRepository usuarioDao;
    
    @Autowired
   	private  personalDao perdao;

    private JwtUtil jwtUtil;
    public AuthController(AuthenticationManager authenticationManager, JwtUtil jwtUtil) {
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;

    }

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResponseEntity login(@RequestBody LoginReq loginReq)  {

    	
    	
    	/*
    	 Esta línea autentica al usuario con correo electrónico y contraseña. El método authenticManager.authenticate() 
    	 llamará internamente al método loadUserByUsername() desde nuestra clase CustomUserDetailsService . 
    	 Luego hará coincidir la contraseña de userDetailsService con la contraseña encontrada en LoginReq . 
    	 Este método generará una excepción si la autenticación no se realiza correctamente.
    	  
    	  */
    	
        try {
        	//personal per=usuarioDao.findByCodigo(loginReq.getCodigo());
       	    //System.out.println("email : "+per);
            Authentication authentication =authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginReq.getCodigo(), loginReq.getUsuario()));
            String email = authentication.getName();  
            
            
            System.out.println("codigo : "+email);
            app_usuarios per=perdao.findByLogin(email);
            System.out.println("user : "+per);
           // per.setCodigo(email);
           // per.setUsuario("");
           // User user = new User(email,"");
            String token = jwtUtil.createToken(per);
            LoginRes loginRes = new LoginRes(email,token);

            return ResponseEntity.ok(loginRes);

        }catch (BadCredentialsException e){
        	
        	//400 Bad Request
        	//El servidor no procesará la solicitud, porque no puede, o no debe, debido a algo que es percibido como un error del cliente (ej: solicitud malformada, sintaxis errónea, etc). La solicitud contiene sintaxis errónea y no debería repetirse.
            ErrorRes errorResponse = new ErrorRes(HttpStatus.BAD_REQUEST,"incorrectos nombre usuario o contraseña");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }catch (Exception e){
            ErrorRes errorResponse = new ErrorRes(HttpStatus.BAD_REQUEST, e.getMessage());
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }
}