package com.leonxiiicobranza.cobranza.jwt.auth;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fasterxml.jackson.databind.ObjectMapper;



@Component
public class JwtAuthorizationFilter extends OncePerRequestFilter {

    private final JwtUtil jwtUtil;
    private final ObjectMapper mapper;

    public JwtAuthorizationFilter(JwtUtil jwtUtil, ObjectMapper mapper) {
        this.jwtUtil = jwtUtil;
        this.mapper = mapper;
    }
    /*
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        Map<String, Object> errorDetails = new HashMap<>();

        try {
            String accessToken = jwtUtil.resolveToken(request);
            if (accessToken == null ) {
                filterChain.doFilter(request, response);
                return;
            }
            System.out.println("token : "+accessToken);
            Claims claims = jwtUtil.resolveClaims(request);

            if(claims != null & jwtUtil.validateClaims(claims)){
                String email = claims.getSubject();
                System.out.println("email : "+email);
                Authentication authentication =
                        new UsernamePasswordAuthenticationToken(email,"",new ArrayList<>());
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }

        }catch (Exception e){
            errorDetails.put("message", "Authentication Error");
            errorDetails.put("details",e.getMessage());
            errorDetails.put("code", HttpStatus.UNAUTHORIZED);
            response.setStatus(HttpStatus.FORBIDDEN.value());
            response.setContentType(MediaType.APPLICATION_JSON_VALUE);
            
           // mapBodyException.put("status", "error");
          //  mapBodyException.put("code", HttpStatus.UNAUTHORIZED);
           // mapBodyException.put("page",null);
           // mapBodyException.put("message"  , "Authentication Error") ;
          //  response.setContentType("application/json") ;
           // response.setStatus(HttpServletResponse.SC_UNAUTHORIZED) 

            mapper.writeValue(response.getWriter(), errorDetails);

        }
        filterChain.doFilter(request, response);
    }
    */
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws IOException, ServletException, java.io.IOException
	{
	 Map<String, Object> errorDetails = new HashMap<>();

    try {
        String accessToken = jwtUtil.resolveToken(request);
        if (accessToken == null ) {
            filterChain.doFilter(request, response);
            return;
        }
        System.out.println("token : "+accessToken);
        Claims claims = jwtUtil.resolveClaims(request);

        if(claims != null & jwtUtil.validateClaims(claims)){
            String email = claims.getSubject();
            System.out.println("email : "+email);
            Authentication authentication =
                    new UsernamePasswordAuthenticationToken(email,"",new ArrayList<>());
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }

    }catch (Exception e){
        errorDetails.put("message", "Authentication Error");
        errorDetails.put("details",e.getMessage());
        errorDetails.put("code", HttpStatus.UNAUTHORIZED);
        response.setStatus(HttpStatus.FORBIDDEN.value());
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        
       // mapBodyException.put("status", "error");
      //  mapBodyException.put("code", HttpStatus.UNAUTHORIZED);
       // mapBodyException.put("page",null);
       // mapBodyException.put("message"  , "Authentication Error") ;
      //  response.setContentType("application/json") ;
       // response.setStatus(HttpServletResponse.SC_UNAUTHORIZED) 

        mapper.writeValue(response.getWriter(), errorDetails);

    }
    filterChain.doFilter(request, response);
}
}
