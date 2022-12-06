package com.uam.ecomerce.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;


public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {


    @Override
    public Authentication attemptAuthentication(HttpServletRequest request
            , HttpServletResponse response) throws AuthenticationException {

        AuthCredential authCredential = new AuthCredential();
        try {
            authCredential = new ObjectMapper().readValue(request.getReader(), AuthCredential.class);
        }
        catch (IOException e) {}

        UsernamePasswordAuthenticationToken userToken = new UsernamePasswordAuthenticationToken(
                authCredential.getEmail()
                ,authCredential.getPassword()
                , Collections.emptyList());

        return getAuthenticationManager().authenticate(userToken);
    }


    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {

        UserDetailsImp userDetailsImp = (UserDetailsImp) authResult.getPrincipal();
        String token = TokenUtils.createToken(userDetailsImp.getName(),userDetailsImp.getUsername());
        response.addHeader("Authorization","Bearer " + token);
        response.getWriter().flush();

        super.successfulAuthentication(request, response, chain, authResult);
    }
}
