
package model;

/**
 * modelChickenSandwich.java
 * 
 * Feb 7, 2013
 * 
 * @author Chuck Wojciuk
 */
public class ChickenSandwich implements Food{
    private static double chickenSandwichBaseCost = 1.99;
    @Override
    public double getCost() {
        return chickenSandwichBaseCost;
    }
    @Override
    public String getFoodType() {
        throw new UnsupportedOperationException( "Not supported yet." );
    }
    @Override
    public void setCost() {
        throw new UnsupportedOperationException( "Not supported yet." );
    }
    
}
