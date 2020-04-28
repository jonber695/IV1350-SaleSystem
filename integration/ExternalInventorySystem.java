package integration;
import dto.*;
import model.Sale;
/**
 * This class will play the role of the external inventory system in this program
 */
public class ExternalInventorySystem 
{

    public Item getItem(int itemID)
    {
        Item itemToReturn;
        switch(itemID)
        {
            case 1: itemToReturn = new Item(1, "Milk", (float )10.5, "1 L of milk", (float) .125, 1);
            break;
            case 2: itemToReturn = new Item(2, "Chips", (float) 22.5, "One bag of Chips", (float) .125, 1);
            break;
            case 3: itemToReturn = new Item(3, "Flour", (float) 10, "1 Kg of flour", (float) .25, 1);
            break;
            default: itemToReturn = null;
            break;
        }
        return itemToReturn;
    }

    /**
     * Updates the inventory system
     * 
     * @param sale Uses the information from the sale to update the inventory system
     */
    public void updateInventorySystem(Sale sale)
    {

    }
}