package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class StandardStrategy implements Strategy {
    private final double mod = 1;
    @Override
    public double cost(List<Meal> order, boolean member) {
        return order.stream().mapToDouble(meal -> meal.getCost()).sum();
    }

    @Override
    public double modifier() {
        
        return mod;
    }
        
}
