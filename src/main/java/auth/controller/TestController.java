package auth.controller;

import auth.configuration.AppConfiguration;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;


@Controller("/test")
@RequiredArgsConstructor
public class TestController {

    private final AppConfiguration appConfiguration;

    @Get("/get-config")
    public String test() {
        String uri = appConfiguration.getDataBaseUri();
        return "Database URI: " + uri;
    }
}
