package com.pa.spring.dependencyinjection;

import com.pa.spring.dependencyinjection.consumable.Chocolate;
import com.pa.spring.dependencyinjection.consumable.Consumable;
import com.pa.spring.dependencyinjection.consumable.SodaPop;
import com.pa.spring.dependencyinjection.vending.VendingMachine;

public class DependencyInjectionExample {

    public static void main(String[] args) {
        // Component (singleton bean)
        Consumable drink = SodaPop.getInstance();
        Consumable chocolate = Chocolate.getInstance();
        // Dependency injection allows us to configure class composition at runtime
        // For example the below configures two vending machines,
        // one dispenses drinks, the other chocolate.
        // This is especially useful for testing, as we can pass mocks into our classes,
        // allowing us to test them in isolation.
        VendingMachine drinksMachine = new VendingMachine(drink);
        VendingMachine chocolateMachine = new VendingMachine(chocolate);

        drinksMachine.vend();
        chocolateMachine.vend();
    }
}