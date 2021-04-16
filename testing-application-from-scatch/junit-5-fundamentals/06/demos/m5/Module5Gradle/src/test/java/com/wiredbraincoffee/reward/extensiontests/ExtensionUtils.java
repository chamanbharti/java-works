package com.wiredbraincoffee.reward.extensiontests;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.engine.descriptor.JupiterEngineExtensionContext;

import java.util.Optional;

public class ExtensionUtils {

    public static final ExtensionContext.Namespace NAMESPACE =
            ExtensionContext.Namespace.create(
                    "A", "custom", "namespace", "for", "my", "extension");

    public static final String EXCEPTION_KEY = "EXCEPTION";

    public static ExtensionContext getEngineContext(ExtensionContext contextParam) {
        Optional<ExtensionContext> context = Optional.of(contextParam);

        while (context.isPresent()
                && !(context.get() instanceof JupiterEngineExtensionContext))
            context = context.get().getParent();

        return context.get();
    }
}
