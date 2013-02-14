
package services;


import java.util.*;
import model.Food;


/**
 * servicestotalCostService.java
 * 
 * Feb 7, 2013
 * 
 * @author Chuck Wojciuk
 */
public class TotalCostService {
    
    /**
     * gets the total cost of the bill.
     * @param foods
     * @return
     */
    public double getTotal(List<Food> foods){
        double total = 0;
        for ( Food food : foods ) {
            total += food.getCost();
        }
        
        return total;
    }
    
}
