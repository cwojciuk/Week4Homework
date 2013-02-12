/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.List;
import javax.ejb.Stateless;


/**
 *
 * @author Chuck Wojciuk
 */
@Stateless
public class FoodListStore {
    List<Food> foods;
    public void foodBusinessMethod(List<Food> foods){
        this.foods = foods;
    }
    public Object getFood() {
        return foods.toArray();
    }
    
}

