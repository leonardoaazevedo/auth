package auth.configuration;

import io.micronaut.context.annotation.Factory;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import lombok.Getter;

@Getter
@Factory
@Singleton
public class AppConfiguration {

    private final String dataBaseUri;

    @Inject
    public AppConfiguration(Config config) {
        dataBaseUri = config.getValue(ConfigConstants.DATABASE_URI);
    }
}
