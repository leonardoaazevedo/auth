package auth.configuration;

import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import lombok.Getter;

@Getter
@Factory
@Singleton
public class AppConfiguration {

    private final String awsRegion;
    private final String userDynamoDbTableName;

    @Inject
    public AppConfiguration(Config config) {
        awsRegion = config.getValue(ConfigConstants.AWS_REGION);
        userDynamoDbTableName = config.getValue(ConfigConstants.USERS_TABLE_NAME);
    }
}
