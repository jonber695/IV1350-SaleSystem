package view;
import controller.Controller;
import java.util.*;

public class View 
{
    Controller contr;
    Scanner scanner = new Scanner(System.in);
    public View(Controller _contr)
    {
        contr = _contr;
    }

    public void userInterface()
    {
        int itemID;
        contr.startSale();
        System.out.println("Sale started");
        System.out.println("Enter itemID for scanning:");
        itemID = scanner.nextInt();
        while(itemID != 0)
        {
            contr.scanItems(itemID);
            System.out.println("Enter next itemID:");
            System.out.println("If there are no more items enter zero");
            itemID = scanner.nextInt();
        }
        
    }
}