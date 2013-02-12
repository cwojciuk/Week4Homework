
package model;


import services.SplitFoodService;


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
}
