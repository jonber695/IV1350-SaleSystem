package model;
import java.time.LocalTime;
import java.util.*;
public class Sale {
    Receipt receipt;
    LocalTime saleTime;
    List<Item> items;

    public Sale()
    {
        receipt = new Receipt();
        saleTime = LocalTime.now();
    }
}