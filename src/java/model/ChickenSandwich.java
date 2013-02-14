
package model;


import com.sun.xml.ws.transport.tcp.policy.TCPTransportPolicyMapConfigurator;
import java.util.Collections;
import java.util.List;


/**
 * modelChickenSandwich.java
 * 
 * Feb 7, 2013
 * 
 * @author Chuck Wojciuk
 */
public class ChickenSandwich implements Food{
    private static double chickenSandwichBaseCost = 1.99;
    private static final String TYPE = "Chicken Sandwich";
    private List<Condiment> clist;
    /**
     *
     * @param clist
     */
    public ChickenSandwich(List<Condiment> clist) {
        this.clist = clist;
    }
    /**
     *
     * @return
     */
    @Override
    public double getCost() {
        return chickenSandwichBaseCost;
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
        hash = 29 * hash + ( this.clist != null ? this.clist.hashCode() : 0 );
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
        final ChickenSandwich other = ( ChickenSandwich ) obj;
        if ( this.clist != other.clist &&
             ( this.clist == null || !this.clist.equals( other.clist ) ) ) {
            return false;
        }
        return true;
    }
    @Override
    public String toString() {
        return "ChickenSandwich{" + "clist=" + clist + '}';
    }
    
}
