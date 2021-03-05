package org.bacon;

import org.bacon.animal.LionCatImpl;
import org.bacon.zoo.Zoo;

import javax.inject.Inject;

public class Manager {
    @Inject
    private Zoo zoo;

    public void run() {
        zoo.welcome();

        zoo.catchInhouseCats();
        zoo.whatKindOfCatsAreYou();
        zoo.releaseThemAll();

        zoo.catchWildOne(new LionCatImpl());
        zoo.whatKindOfCatsAreYou();
    }
}
