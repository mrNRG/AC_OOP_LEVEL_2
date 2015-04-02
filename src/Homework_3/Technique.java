package Homework_3;

import java.util.Date;

public class Technique implements IGoods {
    private int techID;
    private boolean status;
    private int price;
    private Date purchaseDate;

    public Technique() {
    }

    public Technique(int techID, boolean status, int price, Date purchaseDate) {
        this.techID = techID;
        this.status = status;
        this.price = price;
        this.purchaseDate = purchaseDate;
    }

    public long getTechID() {
        return techID;
    }
    @Override
    public int getID() {
        return techID;
    }

    public void setTechID(int techID) {
        this.techID = techID;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Date getDate() {
        return purchaseDate;
    }

    public void setDate() {
        this.purchaseDate = new Date();
    }


}
