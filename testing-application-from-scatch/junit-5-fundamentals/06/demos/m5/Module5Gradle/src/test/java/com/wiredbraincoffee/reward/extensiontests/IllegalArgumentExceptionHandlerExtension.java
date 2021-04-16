package com.wiredbraincoffee.reward.extensiontests;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

import static com.wiredbraincoffee.reward.extensiontests.ExtensionUtils.*;

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
            getEngineContext(context).getStore(NAMESPACE).put(EXCEPTION_KEY, throwable);
            return;
        }
        throw throwable;
    }
}
