package com.uam.ecomerce.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Data
public class TokenUtils {

    //@Value("${token.secret}")
    private static String TOKEN_SECRET = "KkdJ9BWxcsdfkrNXhfl7NczX4Clhh1sLrNhXZu7yXg";

    //@Value("${token.long.time}")
    private static Long TOKEN_LONG_TIME = 2_592_000L;

    public static String createToken(String name, String email) {
        Date expirationTime = new Date(System.currentTimeMillis() + (TOKEN_LONG_TIME * 1000 ));
        Map<String, Object> valueMap = new HashMap<>();
        valueMap.put("name",name);
        return Jwts.builder()
                .setSubject(email)
                .setExpiration(expirationTime)
                .addClaims(valueMap)
                .signWith(Keys.hmacShaKeyFor(TOKEN_SECRET.getBytes()))
                .compact();
    }

    public static UsernamePasswordAuthenticationToken getAuthentication(String token){
        try {
            Claims claims = Jwts.parserBuilder()
                    .setSigningKey(TOKEN_SECRET.getBytes())
                    .build()
                    .parseClaimsJws(token)
                    .getBody();
            String email = claims.getSubject();
            return new UsernamePasswordAuthenticationToken(email, null, Collections.emptyList());
        }
        catch (JwtException e) {
            return null;
        }
    }
}
