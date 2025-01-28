package auth.configuration;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConfigConstants {

    public static final String AWS_REGION = "dynamodb-region";
    public static final String USERS_TABLE_NAME = "dynamodb-table-name-users";
}
