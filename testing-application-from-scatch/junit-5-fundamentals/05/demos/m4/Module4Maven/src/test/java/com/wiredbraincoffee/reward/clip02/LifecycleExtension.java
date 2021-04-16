package com.wiredbraincoffee.reward.clip02;

import org.junit.jupiter.api.extension.*;

public class LifecycleExtension implements
        BeforeAllCallback,
        AfterAllCallback,
        BeforeEachCallback,
        AfterEachCallback,
        BeforeTestExecutionCallback,
        AfterTestExecutionCallback
{
    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        System.out.println("beforeAllCallback");
    }

    @Override
    public void afterAll(ExtensionContext context) throws Exception {
        System.out.println("afterAllCallback");
    }

    @Override
    public void beforeEach(ExtensionContext context) throws Exception {
        System.out.println("beforeEachCallback");
    }

    @Override
    public void afterEach(ExtensionContext context) throws Exception {
        System.out.println("afterEachCallback");
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        System.out.println("beforeTestExecutionCallback");
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        System.out.println("afterTestExecutionCallback");
    }
}
