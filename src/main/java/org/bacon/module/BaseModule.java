package org.bacon.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import org.bacon.animal.Cat;
import org.bacon.animal.LionCatImpl;
import org.bacon.animal.MegantereonCatImpl;
import org.bacon.zoo.Zoo;

public class BaseModule extends AbstractModule {
    protected void configure() {
        // There is no alternative
        bind(Zoo.class).toInstance(new Zoo());

        // Named binding
        bind(Cat.class).annotatedWith(Names.named("Lion")).to(LionCatImpl.class);
        bind(Cat.class).annotatedWith(Names.named("Megantereon")).to(MegantereonCatImpl.class);
    }
}
