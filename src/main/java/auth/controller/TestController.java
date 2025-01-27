package auth.controller;

import auth.configuration.AppConfiguration;
import io.micronaut.http.annotation.Controller;
import lombok.RequiredArgsConstructor;
import micronaut.example.api.UsersApi;
import micronaut.example.model.LoginRequest;
import micronaut.example.model.User;


@Controller
@RequiredArgsConstructor
public class TestController implements UsersApi {

    private final AppConfiguration appConfiguration;

    public User login(String userQuery, LoginRequest loginRequest) {
        User user = new User();
        user.setName(appConfiguration.getDataBaseUri());
        return user;
    }
}
