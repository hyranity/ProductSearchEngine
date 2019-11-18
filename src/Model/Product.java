package Model;

import Util.Quick;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mast3
 */
public class Product {
    private String name;
    private double price;
    private int stocks;

    public Product(String name, double price, int stocks) {
        this.name = name;
        this.price = price;
        this.stocks = stocks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStocks() {
        return stocks;
    }

    public void setStocks(int stocks) {
        this.stocks = stocks;
    }
    
    public String toString(){
        return name + " | " + Quick.toPrice("RM", price) + " | " + stocks + " stocks";
    }
    
    
}
