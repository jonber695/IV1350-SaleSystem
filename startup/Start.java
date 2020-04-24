package startup;
import controller.Controller;
import integration.*;
import view.View;
/**
 * The is the startup sequence, with the main method
 */
public class Start {

    public static void main(String[] args) {
        Printer printer = new Printer();
        Register register = new Register();
        ExternalAccountingSystem externalAccountingSystem = new ExternalAccountingSystem();
        ExternalInventorySystem externalInventorySystem = new ExternalInventorySystem();
        Controller contr = new Controller(externalAccountingSystem, externalInventorySystem, printer, register);
        View view = new View(contr);
        view.userInterface();
    }
}