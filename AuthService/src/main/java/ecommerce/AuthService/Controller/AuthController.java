package ecommerce.AuthService.Controller;

import ecommerce.AuthService.Entity.User;
import ecommerce.AuthService.Model.RegisterRequest;
import ecommerce.AuthService.Service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@Valid @RequestBody RegisterRequest request) {
        User savedUser = authService.register(request);
        return ResponseEntity.ok(savedUser);
    }
}
