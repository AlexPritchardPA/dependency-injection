package com.pa.spring.dependencyinjection.consumable;

/**
 * This class acts similarly to a Spring Bean annotated with @Component
 */
public class Chocolate implements Consumable {
    private static Chocolate instance;

    private Chocolate() {
    }

    /**
     * This method simulates how Spring generates a Singleton Bean for each Component
     * When this Component is autowired inside another class, this method is called to get
     * the current instance which is assigned to the variable
     */
    public static Chocolate getInstance() {
        if (instance == null) {
            instance = new Chocolate();
        }
        return instance;
    }

    @Override
    public String dispense() {
        return "Chocolate";
    }
}
