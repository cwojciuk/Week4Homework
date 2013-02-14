/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author Chuck Wojciuk
 */
public interface Condiment {
    /**
     * gets the cost of a object
     * @return
     */
    public double getCost();
    /**
     * sets the cost, not supported
     * @param cost
     */
    public void setCost(double cost);
    /**
     * gets the type of condiment
     * @return
     */
    public String getCondimentType();
    
}

