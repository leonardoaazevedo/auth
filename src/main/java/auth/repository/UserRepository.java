package auth.repository;

import auth.model.UserEntity;
import jakarta.inject.Singleton;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.model.PutItemEnhancedRequest;

@Singleton
public class UserRepository {

    private final DynamoDbTable<UserEntity> dynamoDbTable;

    public UserRepository(DynamoDbTable<UserEntity> dynamoDbTable) {
        this.dynamoDbTable = dynamoDbTable;
    }

    public void putItem(UserEntity item) {
        dynamoDbTable.putItem(PutItemEnhancedRequest.builder(UserEntity.class)
                        .item(item)
                        .build());
    }

}
