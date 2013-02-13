
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
    public ChickenSandwich(List<Condiment> clist) {
        this.clist = clist;
    }
    @Override
    public double getCost() {
        return chickenSandwichBaseCost;
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
