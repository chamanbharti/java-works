package com.wiredbraincoffee.reward.clip04;

import com.wiredbraincoffee.reward.clip03.RewardByConversionParameterResolver;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Test
@ExtendWith({IllegalArgumentExceptionHandlerExtension.class, RewardByConversionParameterResolver.class})
public @interface TestWithErrorHandler {
}
