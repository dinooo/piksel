package com.discount.config;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * Created by dino on 8/30/16.
 */
public class JerseyInitialization extends ResourceConfig {
    /**
     * Register JAX-RS application components.
     */
    public JerseyInitialization(){
        this.packages("com.discount.resources");
    }
}