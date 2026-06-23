package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public class HappyHour implements Strategy {
    private final double mod = 0.7;
    @Override
    public double cost(List<Meal> order, boolean member) {
        if (member) {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.6).sum();
        } else {
            return order.stream().mapToDouble(meal -> meal.getCost() * 0.7).sum();
        }
    }

    @Override
    public double modifier() {
        return mod;
    }
}
