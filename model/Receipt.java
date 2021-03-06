package model;
import java.time.*;
import java.util.ArrayList;
import java.util.List;
import dto.Item;

/**
 * This class represents the receipt given to the customer
 */
class Receipt {
    private SaleInformation saleInformation;
    private String storeName;
    private String storeAddress;
    private float totalPrice;
    private float totalVAT;
    private int amountPaid;
    LocalDateTime timeAndDayOfSale;
    List<Item> items;

    /**
     * creates an instance of a receipt
     * 
     * @param _salTime the current time when the receipt is started
     */
    Receipt(LocalDateTime _salTime)
    {
        timeAndDayOfSale = _salTime;
        storeName = "Ica";
        storeAddress = "Stångholmsbacken 38";
        saleInformation = new SaleInformation();
        items = new ArrayList<>();
    }

    /**
     * updates the total price onto the receipt
     * 
     * @param itemPrice this is the price for the item that is added
     */
    public void updateTotalPrice(float itemPrice)
    {
        totalPrice += itemPrice;
    }


    /**
     * updates the total tax rate on the receipt
     * 
     * @param itemVAT the VATE rate 6,12 or 25 % 
     * @param price The price of the item
     */
    public void updatetotalVAT(float itemVAT, float price)
    {
        totalVAT += price*itemVAT;
    }

    /**
     * returns the total price of one sale
     * 
     * @return returns the total price of the sale
     */
    public float getTotalPrice()
    {
        return totalPrice;
    }

    /**
     * Sets the amount paid by the customer
     * 
     * @param _amountPaid the amount paid by the customer
     */
    public void setAmountPaid(int _amountPaid)
    {
        amountPaid = _amountPaid;
    }

    public float getTotalVAT()
    {
        return totalVAT;
    }

    /**
     * adds one item to the list of items
     * 
     * @param item the item that is suppose to be added
     */
    public void addItemToList(Item item)
    {
        items.add(item);
    }
}