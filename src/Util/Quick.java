/**
 * The purpose of this class is to shorten code in a customized fashion.
 * The functions are already possible in the current version of Java; however, we just want to shorten the code to allow for faster typing.
 **/
package Util;

public class Quick {
    public static void print(String str){
        System.out.println(str);
    }
    /*
    description: Prints a string; Shorter to type than System.out.println()
    precondition: none
    postcondition: none
    return: none
    */
    
    public static String toPrice(String currency, double price){
        return String.format(currency + "%.2f", price);
    }
    /*
    description: Formats double into a price string
    precondition: none
    postcondition: none
    return: String
    */
}
