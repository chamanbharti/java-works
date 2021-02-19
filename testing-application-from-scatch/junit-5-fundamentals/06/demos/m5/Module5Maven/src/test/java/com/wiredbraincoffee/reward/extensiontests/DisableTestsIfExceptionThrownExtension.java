package com.wiredbraincoffee.reward.extensiontests;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import static com.wiredbraincoffee.reward.extensiontests.ExtensionUtils.*;

public class DisableTestsIfExceptionThrownExtension implements ExecutionCondition {
    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        ConditionEvaluationResult result =
                ConditionEvaluationResult.enabled("No exception thrown so far");

        System.out.println(context);
        Throwable t = (Throwable) context.getStore(NAMESPACE).get(EXCEPTION_KEY);
        if(t != null) {
            result = ConditionEvaluationResult.disabled("An exception was thrown: " + t.getMessage());
        }

        return result;
    }
}
