package com.pa.spring.dependencyinjection.vending;

import com.pa.spring.dependencyinjection.consumable.Consumable;

/**
 * Using Dependency injection, we enable this class to adhere to the single responsibility principle (SRP).
 * This means that this class only has one reason to change.
 * The single responsibility of this class is to dispense consumables. It doesn't need to change if the items
 * it dispenses change, only if the method for vending changes (for example requiring a payment)
 */
public class VendingMachine {
    private final Consumable consumable;

    /**
     * This simulates how Spring 'Autowires' Components (Constructor Injection is best practice)
     * To call this constructor and initialise the VendingMachine bean, Spring will get the
     * singleton bean for the parameter.
     * In our case we have two potential beans (Chocolate and SodaPop), however in most cases there
     * will be only one potential candidate. In our example we would need to use "named beans" and
     * specify which we required using the @Qualifier annotation.
     */
    public VendingMachine(Consumable consumable) {
        this.consumable = consumable;
    }

    public void vend() {
        // This method represents Inversion of Control. The consumable doesn't control when it is
        // dispensed, the VendingMachine does.
        System.out.println(consumable.dispense() + " popped out!");
    }
}