package dto;

public class Item {
    private int itemID;
    private String name;
    private float price;
    private String itemDiscription;
    private int vatRate;
    private int quantity;

    public Item(int _itemID, String _name, float _price, String _itemDiscription, int _VARrate, int _quantity)
    {
        itemID = _itemID;
        name = _name;
        price = _price;
        itemDiscription = _itemDiscription;
        vatRate = _VARrate;
        quantity = _quantity;
    }
    public int getItemID()
    {
        return itemID;
    }

    public String getName()
    {
        return name;
    }

    public float getPrice()
    {
        return price;
    }

    public String getItemDiscription()
    {
        return itemDiscription;
    }

    public int getVATrate()
    {
        return vatRate;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void updateQuantity()
    {
        quantity++;
    }
}