package com.wiredbraincoffee.reward.clip04;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class IllegalArgumentExceptionHandlerExtension implements TestExecutionExceptionHandler {
    @Override
    public void handleTestExecutionException(
            ExtensionContext context, Throwable throwable)
              throws Throwable
    {
        if (throwable instanceof IllegalArgumentException) {
            System.out.println(
                    "Exception of type IllegalArgumentException thrown by "
                    +
                    context.getRequiredTestClass().getName()
                    +
                    "#"
                    +
                    context.getRequiredTestMethod().getName()
            );
            return;
        }
        throw throwable;
    }
}
