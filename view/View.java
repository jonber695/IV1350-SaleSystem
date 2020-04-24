package view;
import controller.Controller;
public class View {
    Controller contr;
    public View(Controller _contr)
    {
        contr = _contr;
    }

    public void userInterface()
    {
        contr.startSale();
    }
}