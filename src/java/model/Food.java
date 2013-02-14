/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;

/**
 *
 * @author Chuck Wojciuk
 */
public interface Food {
    /**
     * gets the cost of a object
     * @return
     */
    public double getCost();
    /**
     * sets the cost, not supported
     * @param cost
     */
    public void setCost();
    /**
     * gets the type of food
     * @return
     */
    public String getFoodType();
    /**
     * gets a list of condiments a food object has
     * @return
     */
    public List<Condiment> getCondiments();
}

