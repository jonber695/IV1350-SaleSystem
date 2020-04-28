package startup;
import controller.Controller;
import integration.*;
import view.View;
/**
 * The is the startup sequence, with the main method
 */
public class Start {

    /**
     * This is the main method, where the program starts and initiates some of the external systems
     * that are used thoughout the program and does not have to be reset during the course of the program
     * @param args
     */
    public static void main(String[] args) {
        ExternalAccountingSystem externalAccountingSystem = new ExternalAccountingSystem();
        ExternalInventorySystem externalInventorySystem = new ExternalInventorySystem();
        Register register = new Register();
        Printer printer = new Printer();
        Controller contr = new Controller(externalAccountingSystem, externalInventorySystem, register, printer);
        View view = new View(contr);
        view.userInterface();
    }
}