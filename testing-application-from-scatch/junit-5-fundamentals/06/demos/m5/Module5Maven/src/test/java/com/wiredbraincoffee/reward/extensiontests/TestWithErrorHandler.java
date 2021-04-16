package com.wiredbraincoffee.reward.extensiontests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Test
@ExtendWith({
        IllegalArgumentExceptionHandlerExtension.class,
        RewardByConversionParameterResolver.class,
        DisableTestsIfExceptionThrownExtension.class
    }
)
public @interface TestWithErrorHandler {
}
