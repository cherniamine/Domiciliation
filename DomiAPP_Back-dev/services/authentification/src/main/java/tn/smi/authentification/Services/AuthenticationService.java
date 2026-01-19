package tn.smi.authentification.Services;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tn.smi.authentification.DTO.AuthenticationRequest;
import tn.smi.authentification.DTO.AuthenticationResponse;
import tn.smi.authentification.DTO.RegisterRequest;


import java.io.IOException;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request) ;
    AuthenticationResponse authenticate(AuthenticationRequest request) ;
    void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException;
}
