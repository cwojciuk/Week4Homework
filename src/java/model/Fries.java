
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
     *
     * @param clist
     */
    public Fries(List<Condiment> clist) {
        this.clist = clist;
    }
    
    
    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return cost;
    }


    /**
     *
     */
    @Override
    public void setCost() {
        
    }


    /**
     *
     * @return
     */
    @Override
    public String getFoodType() {
        return TYPE;
    }
    /**
     *
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
