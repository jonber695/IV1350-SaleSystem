package model;
import java.time.*;
class Receipt {
    private SaleInformation saleInformation;
    private String storeName;
    private String storeAddress;
    private float totalPrice;
    private float totalVAT;
    private int amountPaid;
    LocalDateTime timeAndDayOfSale;

    Receipt(LocalDateTime _salTime)
    {
        timeAndDayOfSale = _salTime;
        storeName = "Ica";
        storeAddress = "Stångholmsbacken 38";
        saleInformation = new SaleInformation();
    }

    public void updateTotalPrice(float itemPrice)
    {
        totalPrice += itemPrice;
    }

    public void updatetotalVAT(int itemVAT)
    {
        totalVAT += itemVAT;
    }
}