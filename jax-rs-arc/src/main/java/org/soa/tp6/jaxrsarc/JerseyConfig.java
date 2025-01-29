package org.soa.tp6.jaxrsarc;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("org.soa.tp6.jaxrsarc");
    }
}