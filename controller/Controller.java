package controller;
import model.*;
import integration.*;
public class Controller {
    private ExternalAccountingSystem externalAccountingSystem;
    private ExternalInventorySystem externalInventorySystem;
    private Register register;
    private Printer printer;
    private Sale sale;

    public Controller(ExternalAccountingSystem _AccountingSystem, ExternalInventorySystem _InventorySystem, Printer _Printer, Register _Register)
    {
        externalAccountingSystem = _AccountingSystem;
        externalInventorySystem = _InventorySystem;
        printer = _Printer;
        register = _Register;
    }

    public void startSale()
    {
        sale = new Sale();
    }

    public void scanItems(int itemID)
    {
        sale.registerItems(itemID, externalInventorySystem);
    }
}