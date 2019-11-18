import Model.*;
import Classes.*;

public class Main {
    public static void main(String[] args){
        //Testing ground
        
        List<Product> list = new List();
        
        list.add(new Product("iPhone", 4999, 5));
        list.add(new Product("Galaxy Fold", 8392, 15));
        list.add(new Product("Huawei mate 30", 3567, 21));
        list.add(new Product("Vivo V21", 2578, 8));
        
        System.out.println(list.toString());
    }
}
