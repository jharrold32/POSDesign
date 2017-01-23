/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gallagherspos;

/**
 *
 * @author TrollOutpost
 */
public class OrderItem {
    int quantity;
    double price;
    String name;
    String message;
    
    public OrderItem() {
        quantity = 1;
        price = 0.0;
        name = "";
        message = "";
    }
    void setPrice(double price) {
        this.price = price;
    }
    void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        String theString = "";
            theString = "" + quantity + "   " + name + "   " + message + "   " + this.price;
        
        
        return theString;
    }
    void setMessage(String message) {
        if(message == null) {
            this.message = "";
        } else {
            this.message = message;
        }
    }
   
    
}

