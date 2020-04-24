package model;

class Receipt {
    private SaleInformation saleInformation;
    private String storeName;
    private String storeAddress;

    Receipt()
    {
        storeName = "Ica";
        storeAddress = "Stångholmsbacken 38";
        saleInformation = new SaleInformation();
    }

}