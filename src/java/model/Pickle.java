
package model;

/**
 * modelCheese.java
 * 
 * Feb 13, 2013
 * 
 * @author Chuck Wojciuk
 */
public class Pickle implements Condiment{
    private static double cost = 0.00;
    private static final String TYPE = "Pickles";
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
     * @param cost
     */
    @Override
    public void setCost( double cost ) {
        throw new UnsupportedOperationException( "Not supported yet." );
    }


    /**
     *
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
