package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class HolidayStrategy implements Strategy {
    private final double mod = 1.15;
    @Override
    public double cost(List<Meal> order, boolean member) {
        return order.stream().mapToDouble(meal -> meal.getCost() * 1.15).sum();
    }

    @Override
    public double modifier() {
        return mod;
    }
    
}
