
package services;


import java.util.ArrayList;
import java.util.List;
import model.Food;
import model.Hamburger;


/**
 * servicesSplitOrderService.java
 * 
 * Feb 8, 2013
 * 
 * @author Chuck Wojciuk
 */
public class SplitFoodService {
    public SplitFoodService() {
    }
    
    public int burgerCount(List<Food> foods){
        int count = 0;
        Hamburger h = new Hamburger();
        for(Food food:foods){
            if(food.getClass() == h.getClass()){
                count++;
            }
        }
        
        return count;
    }
    
}
