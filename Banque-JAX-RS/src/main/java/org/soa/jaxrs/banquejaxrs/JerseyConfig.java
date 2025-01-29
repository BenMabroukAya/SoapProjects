package org.soa.jaxrs.banquejaxrs;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("org.soa.jaxrs.banquejaxrs");
// Set the base URI to "/api"
        property("jersey.config.server.application.path", "/api");
    }
}