
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
    /**
     * Constructor that accepts a list parameter
     * @param clist
     */
    public Fries(List<Condiment> clist) {
        this.clist = clist;
    }
    
    
    /**
     * gets the cost of a object
     * @return
     */
    @Override
    public double getCost() {
        return cost;
    }


    /**
     * sets the cost, not supported
     * @param cost
     */
    @Override
    public void setCost() {
        
    }


    /**
     * gets the type of food
     * @return
     */
    @Override
    public String getFoodType() {
        return TYPE;
    }
    /**
     * gets a list of condiments a food object has
     * @return
     */
    @Override
    public List<Condiment> getCondiments() {
        return Collections.unmodifiableList( clist );
    }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + ( this.clist != null ? this.clist.hashCode() : 0 );
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
        final Fries other = ( Fries ) obj;
        if ( this.clist != other.clist &&
             ( this.clist == null || !this.clist.equals( other.clist ) ) ) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Fries{" + "clist=" + clist + '}';
    }
    
}
