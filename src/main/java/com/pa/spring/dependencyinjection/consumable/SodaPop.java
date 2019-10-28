package com.pa.spring.dependencyinjection.consumable;

/**
 * This class acts similarly to a Spring Bean annotated with @Component
 */
public class SodaPop implements Consumable {
    private static SodaPop instance;

    private SodaPop() {
    }

    /**
     * This method simulates how Spring generates a Singleton Bean for each Component
     * When this Component is autowired inside another class, this method is called to get
     * the current instance which is assigned to the variable
     */
    public static SodaPop getInstance() {
        if (instance == null) {
            instance = new SodaPop();
        }
        return instance;
    }

    @Override
    public String dispense() {
        return "Soda Pop";
    }

}
