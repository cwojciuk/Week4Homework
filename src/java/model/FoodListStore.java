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
    /**
     *
     * @param foods
     */
    public void foodBusinessMethod(List<Food> foods){
        this.foods = foods;
    }
    /**
     *
     * @return
     */
    public Object getFood() {
        return foods.toArray();
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + ( this.foods != null ? this.foods.hashCode() : 0 );
        return hash;
    }


    @Override
    public boolean equals( Object obj ) {
        if ( obj == null ) {
            return false;
        }
        if ( getClass() != obj.getClass() ) {
            return false;
        }
        final FoodListStore other = ( FoodListStore ) obj;
        if ( this.foods != other.foods &&
             ( this.foods == null || !this.foods.equals( other.foods ) ) ) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "FoodListStore{" + "foods=" + foods + '}';
    }
    
    
    
}

