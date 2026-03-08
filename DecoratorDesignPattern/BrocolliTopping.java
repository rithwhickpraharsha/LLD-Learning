package DecoratorDesignPattern;

public class BrocolliTopping extends BasePizza {
    BasePizza basePizza;

    public BrocolliTopping(BasePizza _basePizza) {
        this.basePizza = _basePizza;
    }

    public int getCost() {
        return this.basePizza.getCost() + 20;
    }
    
}
