package org.example.abtractandinterface.andimalandinterface;

public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound(){
        return "Checken: cluck-cluck";
    }
    @Override
    public String howToEat(){
        return "Could be fried";
    }
}
