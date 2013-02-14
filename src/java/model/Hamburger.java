
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
    
    /**
     *
     * @param clist
     */
    public Hamburger(List<Condiment> clist) {
        this.clist = clist;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return hamburgerCost;
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
     */
    @Override
    public void setCost() {
        throw new UnsupportedOperationException( "Not supported yet." );
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
        hash = 83 * hash + ( this.clist != null ? this.clist.hashCode() : 0 );
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
        final Hamburger other = ( Hamburger ) obj;
        if ( this.clist != other.clist &&
             ( this.clist == null || !this.clist.equals( other.clist ) ) ) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "Hamburger{" + "clist=" + clist + '}';
    }
    
}
