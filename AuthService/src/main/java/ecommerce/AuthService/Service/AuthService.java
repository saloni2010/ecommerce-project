package ecommerce.AuthService.Service;

import ecommerce.AuthService.Entity.User;
import ecommerce.AuthService.Model.RegisterRequest;
import jakarta.validation.Valid;


public interface AuthService {
    User register(@Valid RegisterRequest request);
}
