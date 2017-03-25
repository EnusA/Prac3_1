package com.enusA.Prac3_1;

/**
 * Created by enusa on 2017/03/25.
 */
public class Products {
    private String name;
    private String prodID;
    private double price;
    private String prodDescription;

    public Products(){}
    public Products(String nm, String pI, double pric, String desc)
    {
        name = nm;
        prodID = pI;
        price = pric;
        prodDescription = desc;
    }

    public String getName()
    {return name;}
    public String getProdID()
    {return prodID;}
    public double getPrice()
    {return price;}
    public String getProdDescription()
    {return prodDescription;}

    public void setName(String nm)
    {name = nm;}
    public void setProdID(String pI)
    {prodID = pI;}
    public void setPrice(double pric)
    {price = pric;}
    public void setProdDescription(String desc)
    { prodDescription = desc;}

    public String myOrder()
    {return ("Product Name: " + name + "\nProduct ID: " + prodID + "\nPrice: " + price);}

    public String myString()
    {return ("Product Name: " + name + "\nProduct ID: " + prodID + "\nPrice: " + price +
            "\nDescription: " + prodDescription);}
}
