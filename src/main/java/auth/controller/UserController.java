package auth.controller;

import auth.flow.CreateUserFlow;
import io.micronaut.http.annotation.Controller;
import lombok.RequiredArgsConstructor;
import micronaut.example.api.UsersApi;
import micronaut.example.model.CreateUserRequest;


@Controller
@RequiredArgsConstructor
public class UserController implements UsersApi {

    private final CreateUserFlow createUserFlow;

    @Override
    public void createUser(CreateUserRequest createUserRequest) {
        createUserFlow.create(createUserRequest);
    }
}
