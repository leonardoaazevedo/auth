package auth.flow;

import auth.mapper.UserMapper;
import auth.model.UserEntity;
import auth.service.CreateUserService;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;
import micronaut.example.model.CreateUserRequest;

@Singleton
@RequiredArgsConstructor
public class CreateUserFlow {

    private final UserMapper userMapper;
    private final CreateUserService createUserService;

    public void create(CreateUserRequest createUserRequest) {
        UserEntity userEntity = userMapper.fromRequestToEntity(createUserRequest);
        createUserService.create(userEntity);
    }
}
