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
    public double getCost();
    public void setCost();
    public String getFoodType();
    public List<Condiment> getCondiments();
}

