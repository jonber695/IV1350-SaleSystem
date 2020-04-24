package model;
import java.time.LocalTime;
import java.util.*;
public class Sale {
    Receipt receipt;
    LocalTime saleTime;
    List<Item> items;

    public Sale(Receipt _Receipt)
    {
        receipt = _Receipt;
        saleTime = LocalTime.now();
    }
}