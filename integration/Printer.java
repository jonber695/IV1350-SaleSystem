package integration;
import model.Sale;

/**
 * Represents the external system printer in the program
 */
public class Printer {

    /**
     * prints the receipt from the current sale
     * 
     * @param sale the sale from which the receipt is printed
     */
    public void printsReceipt(Sale sale)
    {
        sale.getReceipt();
    }
}