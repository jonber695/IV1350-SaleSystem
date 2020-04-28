package integration;
import java.util.ArrayList;
import java.util.List;
import model.Sale;

/**
 * Represents the external sale log
 */
public class SaleLog {
    List<Sale> saleLog;

    /**
     * Creates the sale log in the program
     */
    public SaleLog()
    {
        saleLog = new ArrayList<>();
    }

    /**
     * Adds the sale to the log
     * 
     * @param sale the sale to be added to the log
     */
    public void addSaleToSaleLog(Sale sale)
    {
        saleLog.add(sale);
    }
}