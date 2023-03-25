package kz.khairollayev.storeauth.controller;

import kz.khairollayev.storeauth.dto.UserDto;
import kz.khairollayev.storeauth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/registration")
    public ResponseEntity<?> registration(@RequestBody @Validated UserDto dto) {
        if(userService.findByUsername(dto.getUsername()).isPresent()) {
            return ResponseEntity.badRequest().body("User already exists");
        }

        userService.registration(dto);
        return ResponseEntity.ok("User registered");
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserDto dto) {
        return ResponseEntity.ok(userService.login(dto));
    }
}
