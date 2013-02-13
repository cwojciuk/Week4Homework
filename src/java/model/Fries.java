
package model;


import java.util.Collections;
import java.util.List;


/**
 * modelFries.java
 * 
 * Feb 13, 2013
 * 
 * @author Chuck Wojciuk
 */
public class Fries implements Food{
    private static double cost = 1.50;
    private static final String TYPE = "Fries";
    private List<Condiment> clist;
    public Fries(List<Condiment> clist) {
        this.clist = clist;
    }
    
    
    @Override
    public double getCost() {
        return cost;
    }


    @Override
    public void setCost() {
        
    }


    @Override
    public String getFoodType() {
        return TYPE;
    }
    @Override
    public List<Condiment> getCondiments() {
        return Collections.unmodifiableList( clist );
    }

}
