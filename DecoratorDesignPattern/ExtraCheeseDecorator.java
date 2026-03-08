package DecoratorDesignPattern;

public class ExtraCheeseDecorator extends BasePizza{
    BasePizza pizza;

    public ExtraCheeseDecorator(BasePizza _pizza) {
        this.pizza = _pizza;
    }

    public int getCost() {
        return this.pizza.getCost() + 20;
    }
}
