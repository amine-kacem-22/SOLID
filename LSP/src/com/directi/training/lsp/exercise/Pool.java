// Pool class to demonstrate LSP
package com.directi.training.lsp.exercise;

public class Pool {
    public void run() {
        Duck donaldDuck = new RealDuck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        electricDuck.turnOn(); // Turn on electronic duck to show its capabilities

        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.quack();
        }
    }

    private void swim(Duck... ducks) {
        for (Duck duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}
