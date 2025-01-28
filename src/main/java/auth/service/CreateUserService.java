package auth.service;

import auth.model.UserEntity;
import auth.repository.UserRepository;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor
public class CreateUserService {

    private final UserRepository userRepository;

    public void create(UserEntity userEntity) {
        userRepository.putItem(userEntity);
    }
}
