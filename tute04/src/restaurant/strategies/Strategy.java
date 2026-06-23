package restaurant.strategies;

import java.util.List;

import restaurant.Meal;

public interface Strategy {
    public double cost(List<Meal> order, boolean member);
    
    public double modifier();
}
