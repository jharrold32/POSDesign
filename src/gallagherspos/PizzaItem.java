/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gallagherspos;

import java.util.Scanner;

/**
 *
 * @author TrollOutpost
 */
public class PizzaItem extends OrderItem implements PizzaValues, Prices {
    String toppings = "";
    String size = "";
    String crust = "";
    String message = "";
    Scanner scanToppings;
    void setToppings(String pizzaToppings) {
        
    }
    void setSize(String pizzaSize) {
        size = pizzaSize;
    }
    void setCrust(String pizzaCrust) {
        crust = pizzaCrust;
    }
    void setName() {
        
    }
    void getPrice() {
        scanToppings = new Scanner(toppings);
        if(toppings.equals("") || size.equals("") || crust.equals("")) {
            System.out.println("Something's not right");
        } else {
            if(size.equals("Sall")) {
                if(crust.equals("Thin")) {
                    price = Prices.THIN_SMALL;
                } else if(crust.equals("Hand")) {
                    price = Prices.HAND_SMALL;
                } else if(crust.equals("Pan")) {
                    price = Prices.PAN_SMALL;
                } else if(crust.equals("Deep")) {
                    price = Prices.DEEP_SMALL;
                } else if(crust.equals("Calzone")) {
                    price = Prices.CALZONE_SMALL;
                }
            } else if(size.equals("Medium")) {
                if(crust.equals("Thin")) {
                    price = Prices.THIN_MEDIUM;
                } else if(crust.equals("Hand")) {
                    price = Prices.HAND_MEDIUM;
                }
                
            } else if(size.equals("Large")) {
                if(crust.equals("Thin")) {
                    price = Prices.THIN_LARGE;
                } else if(crust.equals("Hand")) {
                    price = Prices.HAND_LARGE;
                } else if(crust.equals("Pan")) {
                    price = Prices.PAN_LARGE;
                } else if(crust.equals("Deep")) {
                    price = Prices.DEEP_LARGE;
                } else if(crust.equals("Calzone")) {
                    price = Prices.CALZONE_LARGE;
                }
                
            } else if(size.equals("ExtraLarge")) {
                if(crust.equals("Thin")) {
                    price = Prices.THIN_XLARGE;
                } else if(crust.equals("Hand")) {
                    price = Prices.HAND_XLARGE;
                } else if(crust.equals("Calzone")) {
                    price = Prices.CALZONE_TOP_LARGE;
                }
                
            } else if(size.equals("Family")) {
                if(crust.equals("Thin")) {
                    price = Prices.THIN_FAMILY;
                } else if(crust.equals("Hand")) {
                    price = Prices.HAND_FAMILY;
                }
                
            }
        }
        if(size.equals("Small")) {
            while(scanToppings.hasNext()) {
                price+=1.25;
                scanToppings.next();
            }
        } else if(size.equals("Medium")) {
            while(scanToppings.hasNext()) {
                price+=1.5;
                scanToppings.next();
            }
        } else if(size.equals("Large")) {
            while(scanToppings.hasNext()) {
                price+=1.75;
                scanToppings.next();
            }
        } else if(size.equals("ExtraLarge")) {
            while(scanToppings.hasNext()) {
                price+=2.0;
                scanToppings.next();
            }
        } else if(size.equals("Family")) {
            while(scanToppings.hasNext()) {
                price+=2.25;
                scanToppings.next();
            }
        }
    }
    @Override
    public String toString() {
       String theString = "";
       
       return theString;
    }
    public void addToMenu() {
        
    }
}

