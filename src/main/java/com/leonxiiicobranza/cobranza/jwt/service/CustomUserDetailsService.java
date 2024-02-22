package com.leonxiiicobranza.cobranza.jwt.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.leonxiiicobranza.cobranza.jwt.repositori.UserRepository;
import com.leonxiiicobranza.cobranza.modelo.app_usuarios;


@Service
public class CustomUserDetailsService implements UserDetailsService {
    //private final UserRepository userRepository;
    @Autowired
	private UserRepository usuarioDao;
    public CustomUserDetailsService(UserRepository userRepository) {
        this.usuarioDao = userRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    	app_usuarios per=usuarioDao.findByLogin(email);
    	// System.out.println("email : "+per.getNombre());
        //User user = userRepository.findUserByEmail(email);
        List<String> roles = new ArrayList<>();
        roles.add("USER");
        UserDetails userDetails =
                org.springframework.security.core.userdetails.User.builder()
                        .username(per.getLogin())
                        .password(per.getPassword())
                        .roles(roles.toArray(new String[0]))
                        .build();
        return userDetails;
    }
}
