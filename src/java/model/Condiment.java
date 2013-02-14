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
     *
     * @return
     */
    public double getCost();
    /**
     *
     * @param cost
     */
    public void setCost(double cost);
    /**
     *
     * @return
     */
    public String getCondimentType();
    
}

