
package model;

/**
 * modelCheese.java
 * 
 * Feb 13, 2013
 * 
 * @author Chuck Wojciuk
 */
public class Plain implements Condiment{
    private static double cost = .00;
    private static final String TYPE = "Plain";
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
    public void setCost( double cost ) {
        throw new UnsupportedOperationException( "Not supported yet." );
    }


    /**
     * gets the type of condiment
     * @return
     */
    @Override
    public String getCondimentType() {
        return TYPE;
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public boolean equals( Object obj ) {
        return super.equals( obj );
    }


    @Override
    public String toString() {
        return super.toString();
    }
    
}
