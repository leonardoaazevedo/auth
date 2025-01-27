package auth.configuration;

import io.micronaut.context.ApplicationContext;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class Config {

    private final ApplicationContext applicationContext;

    @Inject
    public Config(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public String getValue(String key) {
        return applicationContext.getEnvironment().getProperty(key, String.class).orElseThrow();
    }
}
