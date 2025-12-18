package com.amazonaws.serverless.proxy.jersey;

import org.glassfish.jersey.innate.inject.BlindBinder;

import jakarta.inject.Singleton;

public class ResourceBinder extends BlindBinder {
    @Override
    protected void configure() {
        bind(new JerseyDependency()).to(JerseyDependency.class).in(Singleton.class);
    }
}
