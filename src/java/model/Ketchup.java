
package model;

/**
 * modelCheese.java
 * 
 * Feb 13, 2013
 * 
 * @author Chuck Wojciuk
 */
public class Ketchup implements Condiment{
    private static double cost = 0.00;
    private static final String TYPE = "Ketchup";
    @Override
    public double getCost() {
        return cost;
    }


    @Override
    public void setCost( double cost ) {
        throw new UnsupportedOperationException( "Not supported yet." );
    }


    @Override
    public String getCondimentType() {
        return TYPE;
    }

}
