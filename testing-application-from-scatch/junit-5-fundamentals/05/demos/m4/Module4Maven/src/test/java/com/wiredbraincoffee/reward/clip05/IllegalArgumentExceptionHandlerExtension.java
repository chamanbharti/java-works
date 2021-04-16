package com.wiredbraincoffee.reward.clip05;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

import static com.wiredbraincoffee.reward.clip05.ExtensionUtils.*;

public class IllegalArgumentExceptionHandlerExtension implements TestExecutionExceptionHandler {

    @Override
    public void handleTestExecutionException(
            ExtensionContext context, Throwable throwable)
              throws Throwable
    {
        if (throwable instanceof IllegalArgumentException) {
            getEngineContext(context).getStore(NAMESPACE).put(EXCEPTION_KEY, throwable);
            return;
        }

        throw throwable;
    }
}
