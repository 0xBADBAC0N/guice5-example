package org.bacon;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.bacon.module.BaseModule;

public class App {
    public static void main(String[] args) {
        Manager manager = new Manager();

        BaseModule baseModule = new BaseModule();
        Injector injector = Guice.createInjector(baseModule);
        injector.injectMembers(manager);

        manager.run();
    }
}
