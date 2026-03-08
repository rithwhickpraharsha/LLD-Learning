package DecoratorDesignPattern;

public class VegDelightPizaa extends BasePizza {
    int cost;

    public VegDelightPizaa(int _cost) {
        this.cost = _cost;
    }
    
    public int getCost() {
        return this.cost;
    }
    
}
