package DecoratorDesignPattern;

import DecoratorDesignPattern.BasePizza;
import DecoratorDesignPattern.BrocolliTopping;
import DecoratorDesignPattern.ExtraCheeseDecorator;
import DecoratorDesignPattern.MargaretPizza;

public class Main {
    
    public static void main(String[] args) {
        BasePizza pizza = new MargaretPizza(20);
        System.out.println("We are building Margaret Pizza with brocolli and cheese");
        BasePizza BrocolliChesseMargert = new BrocolliTopping(new ExtraCheeseDecorator(pizza));
        System.out.println("Cost of the pizza is: " + BrocolliChesseMargert.getCost());

    }
}
