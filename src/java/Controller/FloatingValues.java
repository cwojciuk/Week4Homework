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
     *
     */
    FOODS ("foods"),
    /**
     *
     */
    TOTAL ("totalCost"),
    /**
     *
     */
    ACTION ("action"),
    /**
     *
     */
    HAM ("addHam"),
    /**
     *
     */
    CHICSAND ("addChicSand"),
    /**
     *
     */
    FRIES ("addFries"),
    /**
     *
     */
    SALAD ("addSalad");
    
    private final String value;
    private FloatingValues(String value) {
        this.value = value;
    }
    /**
     *
     * @return
     */
    public String getValue(){
        return value;
    }
    
}

