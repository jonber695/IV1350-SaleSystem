package model;
import java.time.LocalDateTime;
import java.util.*;
import integration.*;
import dto.*;
public class Sale {
    Receipt receipt;
    LocalDateTime saleTime;
    List<Item> items;

    public Sale()
    {
        receipt = new Receipt(saleTime);
        saleTime = LocalDateTime.now();
    }

    public void registerItems(int itemID, ExternalInventorySystem externalInventorySystem)
    {
        boolean itemAlreadyRegistered = items.contains(externalInventorySystem.getItem(itemID));
        if(itemAlreadyRegistered == false)
            items.add(externalInventorySystem.getItem(itemID));
        else
        {
            for (Item item : items) {
                if(item.equals(externalInventorySystem.getItem(itemID)))
                    item.updateQuantity();
            }
        }
    }
}