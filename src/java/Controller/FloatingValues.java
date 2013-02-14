/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


/**
 *
 * @author Chuck Wojciuk
 */
public enum FloatingValues {
    /**
     * Represents the value foods
     */
    FOODS ("foods"),
    /**
     * Represents the value totalCost
     */
    TOTAL ("totalCost"),
    /**
     * Represents the value action
     */
    ACTION ("action"),
     /**
     * Represents the value checkout
     */
    COUT ("checkout"),
     /*
     * Represents the value cond
     */
    COND ("cond"), 
    /**
     * Represents the value i
     */
    I ("i"),
    /**
     * Represents the value addHam
     */
    HAM ("addHam"),
    /**
     * Represents the value addChicSand
     */
    CHICSAND ("addChicSand"),
    /**
     * Represents the value addFries
     */
    FRIES ("addFries"),
    /**
     * Represents the value addSalad
     */
    SALAD ("addSalad");
    
    private final String value;
    private FloatingValues(String value) {
        this.value = value;
    }
    /**
     * gets the value of the object
     * @return
     */
    public String getValue(){
        return value;
    }
    
}

