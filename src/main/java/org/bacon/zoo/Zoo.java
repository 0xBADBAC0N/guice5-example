package org.bacon.zoo;

import com.google.inject.name.Named;
import org.bacon.animal.Cat;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class Zoo {

    // Field injections
    @Inject
    @Named("Lion")
    private Cat hairyCat;

    @Inject
    @Named("Megantereon")
    private Cat megaCat;

    private List<Cat> cats;

    public Zoo() {
        cats = new ArrayList<>();
    }

    // Method injection
    // Will get called after construction
    @Inject
    public void catchWildOne(@Named("Megantereon") Cat wildCat) {
        cats.add(wildCat);
    }

    public void welcome() {
        System.out.println("It's the Zoo. There is just one for all the animals!\n");
    }

    public void catchInhouseCats() {
        cats.add(hairyCat);
        cats.add(megaCat);
        System.out.println("Caught some cats which are running around...\n");
    }

    public void whatKindOfCatsAreYou() {
        cats.forEach(Cat::whoIAm);
        System.out.println("Interviewed cats..weird...\n");
    }

    public void releaseThemAll() {
        cats = new ArrayList<>();
        System.out.println("Released them all...\n");
    }
}