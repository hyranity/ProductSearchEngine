/*
 * The purpose of this class is to shorten code in a customized fashion
 */
package Util;

public class Quick {
    public static void print(String str){
        System.out.println(str);
    }
    
    public static String toPrice(String prefix, double price){
        return String.format(prefix + "%.2f", price);
    }
}
