
package services;


import java.util.ArrayList;
import java.util.List;
import model.*;


/**
 * servicesToArrayListService.java
 * 
 * Feb 13, 2013
 * 
 * @author Chuck Wojciuk
 */
public class ToCondimentListService {
    /**
     * converts a string array to a List
     * @param s
     * @return
     */
    public List stringsToList(String[] s){
        List<Condiment> condList = new ArrayList<Condiment>();
        if(s == null){
            condList.add( new Plain());
        }else{
            for(String con: s){
                if(con.equals("Cheese")){
                    condList.add( new Cheese());
                }else if(con.equals( "Ketchup") ){
                    condList.add( new Ketchup());
                }else if(con.equals( "Mustard" ) ){
                    condList.add( new Mustard());
                }else if(con.equals( "Onions") ){
                    condList.add( new Onion());
                }else if(con.equals( "Pickles") ){
                    condList.add( new Pickle());
                }
            }
        }
        return condList;
    }
}
