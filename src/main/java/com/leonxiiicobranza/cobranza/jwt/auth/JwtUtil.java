package com.leonxiiicobranza.cobranza.jwt.auth;


import io.jsonwebtoken.*;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.crypto.SecretKey;

import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import com.leonxiiicobranza.cobranza.modelo.app_usuarios;



@Component
public class JwtUtil {


    private final String secretkey = "MTIzNDU2Nzg5MDEyMzQ1Njc4OTAxMjM0NTY3ODkwMTI=";
    private long accessTokenValidity = 1*60*1000; //10 min
    //minutes * 60 * 1000;
    //60 * 60 * 1000; // 1 hour
    //24 * 60 * 60 * 1000; // 24 hour
    //DAYS.toMillis(1) + HOURS.toMillis(1) + MINUTES.toMillis(1) + SECONDS.toMillis(1)))

  //  private final JwtParser jwtParser;

    private final String TOKEN_HEADER = "Authorization";
    private final String TOKEN_PREFIX = "Bearer ";

   
    
    public String createToken(app_usuarios per) {
    	
    	System.out.print("cor"+per.getCorreo());
    	SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
    	Map map = new HashMap<String,Object>();
        map.put("persona",per.getPersona());
        map.put("correo",per.getCorreo());
        map.put("login",per.getLogin());
        map.put("cargo",per.getCargo());
        map.put("password","");
        map.put("iduser",per.getIduser());
        map.put("habilitado",per.getHabilitado());
        map.put("idpersona",per.getIdpersona());
        
        
        Claims claims = Jwts.claims(map).setSubject(per.getLogin());
        
    
        Date tokenCreateTime = new Date();
        Date tokenValidity = new Date(tokenCreateTime.getTime() + TimeUnit.MINUTES.toMillis(300));//TimeUnit.SECONDS.toMillis(30));
        return Jwts.builder().claim("correo",per.getCorreo())
                .setClaims(claims)
                
                .setExpiration(tokenValidity)
                //.signWith(SignatureAlgorithm.HS256,secret_key) obsoleto
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }
 
    private Key getSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretkey);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    private Claims parseJwtClaims(String token) {
        return Jwts.parserBuilder().setSigningKey(getSigningKey()).build().parseClaimsJws(token).getBody();
    }

    public Claims resolveClaims(HttpServletRequest req) {
        try {
            String token = resolveToken(req);
            if (token != null) {
                return parseJwtClaims(token);
            }
            return null;
        } catch (ExpiredJwtException ex) {
            req.setAttribute("expiro", ex.getMessage());
            throw ex;
        } catch (Exception ex) {
            req.setAttribute("invalido", ex.getMessage());
            throw ex;
        }
    }

    public String resolveToken(HttpServletRequest request) {

        String bearerToken = request.getHeader(TOKEN_HEADER);
        if (bearerToken != null && bearerToken.startsWith(TOKEN_PREFIX)) {
            return bearerToken.substring(TOKEN_PREFIX.length());
        }
        return null;
    }

    public boolean validateClaims(Claims claims) throws AuthenticationException {
        try {
            return claims.getExpiration().after(new Date());
        } catch (Exception e) {
            throw e;
        }
    }

    public String getEmail(Claims claims) {
        return claims.getSubject();
    }

    private List<String> getRoles(Claims claims) {
        return (List<String>) claims.get("roles");
    }


}
