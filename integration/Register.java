package integration;

public class Register {
    private float moneyInRegister;

    public void increaseAmountInRegister(float amountPaid)
    {
        moneyInRegister += amountPaid;
    }
}