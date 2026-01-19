package tn.smi.authentification.Jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import tn.smi.authentification.entities.User;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtServiceImp implements JwtService {
    private static final String SECRET_KEY="JcIdM7U+Q3Bp1L+BBlUmg3nQh+v60jKejqr1H64EyakcW6TzFeOrIa4is8AcHeaQC4R5TglzKiEQtsVAoYPKmdot9EgxBugTxhYBrEf2qfMZupXCMG8Rb4BLvr8hyiX7YrjJoN/ZhJACGoyqF1HquBWTTHmqFSmMWPmuqatVCzA+knyWsUdXkzR1FS3SFjNmFpAp4VgInet1NKb+MU1wdE9Bpd1r67EZwWSGilD3N3bZBF2tteUVqeC+X5uRQttAqlsqxFEu0/CL0qggISaUJTz/g7pz/fXYvEpQTJI+XMcOxSeJPLpdv+4ax+jW7qCW35wrrledqN/cZ6E1XwyNOyYdFu5+jrT6y7zxvFSu1qo=\n";
    private static final long jwtExpiration = 86400000; //a day
    private static final long refreshExpiration=604800000; //7 days
    @Override
    public boolean isTokenValid(String token, UserDetails userDetails) {
        final String username =extractUsername(token);
        return (username.equals(userDetails.getUsername())) && !isTokenExpired(token);
    }

    @Override
    public boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    @Override
    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    @Override
    public String extractUsername(String token) {
        return extractClaim(token, Claims ::getSubject);
    }

    @Override
    public String generateRefreshToken(UserDetails userDetails) {
        return buildToken(new HashMap<>(),userDetails,refreshExpiration);
    }

    @Override
    public String generateToken(UserDetails userDetails) {
        return generateToken(new HashMap<>(), userDetails);
    }

    @Override
    public String generateToken(Map<String, Object> extraClaims, UserDetails userDetails) {
        return buildToken(extraClaims,userDetails,jwtExpiration);

    }
    @Override
    public String buildToken (Map<String, Object> extraClaims, UserDetails userDetails,long expiration){
        return Jwts
                .builder()
                .setClaims(extraClaims)
                .setSubject(userDetails.getUsername())
                .claim("role", ((User) userDetails).getRole().toString()) // Ajoute le rôle de l'utilisateur comme une claim personnalisée
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expiration))
                .signWith(getSignInkey(), SignatureAlgorithm.HS256)
                .compact();
    }



    @Override
    public Claims extractAllClaims(String token) {
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignInkey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    @Override
    public Key getSignInkey() {
        byte[] keyBytes= Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
