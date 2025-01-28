package auth.mapper;

import auth.model.UserEntity;
import micronaut.example.model.CreateUserRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "jakarta")
public interface UserMapper {
    UserEntity fromRequestToEntity(CreateUserRequest createUserRequest);
}
