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
     *
     * @return
     */
    public double getCost();
    /**
     *
     */
    public void setCost();
    /**
     *
     * @return
     */
    public String getFoodType();
    /**
     *
     * @return
     */
    public List<Condiment> getCondiments();
}

