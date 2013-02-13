
package model;


import java.util.Collections;
import java.util.List;


/**
 * modelHamburger.java
 * 
 * Feb 7, 2013
 * 
 * @author Chuck Wojciuk
 */
public class Hamburger implements Food{
    private static double hamburgerCost = 2.99;
    private static final String TYPE = "Hamburger";
    private List<Condiment> clist;
    
    public Hamburger(List<Condiment> clist) {
        this.clist = clist;
    }
    
    @Override
    public double getCost() {
        return hamburgerCost;
    }
    @Override
    public String getFoodType() {
        return TYPE;
    }
    @Override
    public void setCost() {
        throw new UnsupportedOperationException( "Not supported yet." );
    }
    @Override
    public List<Condiment> getCondiments() {
        return Collections.unmodifiableList( clist );
    }
}
