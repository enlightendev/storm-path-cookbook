package io.enlightendev.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Roles {
    public final String ADMIN;

    @Autowired
    public Roles(Environment env) {
        String property = env.getProperty("stormpath.authorized.group.admin");
        ADMIN = property;
    }
}