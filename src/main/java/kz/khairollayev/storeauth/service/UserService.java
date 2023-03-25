package kz.khairollayev.storeauth.service;

import kz.khairollayev.storeauth.dto.UserDto;
import kz.khairollayev.storeauth.model.User;

import java.util.Optional;

public interface UserService {
    User registration(UserDto dto);
    Optional<User> findByUsername(String username);
    String login(UserDto dto);
}
