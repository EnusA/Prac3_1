package com.enusA.Prac3_1;

import java.util.ArrayList;
import java.util.*;
import java.util.HashSet;
import java.util.HashMap;


//214018318 - Abdullah Enus - AE
// 213037513 - Greyam Moorcroft - GM


/**
 * Hello world!
 *
 */
public class Prac3_1_main
{
    //AE
    Products menuItem;
    Set<String> itemId = new HashSet<String>();
    ArrayList<Products> order = new ArrayList();
    public void addMenuItem(String nm, String pI, double pric, String desc)
    {
        menuItem = new Products(nm, pI, pric, desc);
    }
    public void addId(){
        itemId.add("cb108");
        itemId.add("bb102");
        itemId.add("rb103");
        itemId.add("wp104");
        itemId.add("sk105");
        itemId.add("pi107");
    }
    public void placeOrder() {
        String enterId = "";
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("Please enter a product ID");
            enterId = scan.nextLine();

            if (enterId.equals("end") )
                break;
            System.out.println(enterId);


            Products item1 = (Products) menuList.get(enterId);
            if(item1 == null)
                System.out.println("Invalid product code");
            else
                order.add(item1);


        }while (enterId != "end");
        for(int i = 0; i < order.size();i++)
            System.out.println(order.get(i).myOrder());
        System.out.println("System Terminated.");
    }

   //GM
    Map menuList = new HashMap();
    public void constructMenu()
    {
        addMenuItem("Chicken Burger", "cb108", 30, "Saucy chicken burger with cheese");
        menuList.put(menuItem.getProdID(), menuItem);
        addMenuItem("Beef Burger", "bb102", 32, "Saucy beef burger with cheese and tomato");
        menuList.put(menuItem.getProdID(), menuItem);
        addMenuItem("Ribs", "rb103" , 80, "800g Ribs with bbq sause");
        menuList.put(menuItem.getProdID(), menuItem);
        addMenuItem("Wrap", "wp104", 40, "Chicken Wraps with chicken, lettuce, tomato, mayo");
        menuList.put(menuItem.getProdID(), menuItem);
        addMenuItem("Steak", "sk105", 65, "500g Rump steak with pepper/cheese sauce");
        menuList.put(menuItem.getProdID(), menuItem);
        addMenuItem("Pie", "pi107", 30, "Steak/burger/pepper steak/chicken");
        menuList.put(menuItem.getProdID(), menuItem);
    }

    public static void main (String []args){
        //AE
        Prac3_1_main newPrac31main = new Prac3_1_main();
        newPrac31main.addId();
        TreeSet sortedId = new TreeSet<String>(newPrac31main.itemId);
         System.out.println(sortedId);

        //GM
        newPrac31main.constructMenu();
        Products item1 = (Products) newPrac31main.menuList.get("cb108");
        Products item2 = (Products) newPrac31main.menuList.get("bb102");
        Products item3 = (Products) newPrac31main.menuList.get("rb103");
        Products item4 = (Products) newPrac31main.menuList.get("wp104");
        Products item5 = (Products) newPrac31main.menuList.get("sk105");
        Products item6 = (Products) newPrac31main.menuList.get("pi107");

        System.out.println(item1.myString());
        System.out.println(item2.myString());
        System.out.println(item3.myString());
        System.out.println(item4.myString());
        System.out.println(item5.myString());
        System.out.println(item6.myString());

        //AE
        newPrac31main.placeOrder();



    }

}
