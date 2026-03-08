package DecoratorDesignPattern;

public class MargaretPizza extends BasePizza {
    int cost;

    public MargaretPizza(int _cost) {
        this.cost = _cost;
    }
    
    public int getCost() {
        return this.cost;
    }
    
}
