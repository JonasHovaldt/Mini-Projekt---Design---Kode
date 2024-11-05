package model;
import java.time.LocalDate;

/**
 * Write a description of class Copy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Copy {
    private int serialNumber;
    private String purchaseDate;
    private double purchasePrice;
    private LP lp;

    // Constructor
    public Copy(int serialNumber, String purchaseDate, double purchasePrice) {
        this.serialNumber = serialNumber;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
    }

    // Getter og setter for serialNumber
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Getter og setter for purchaseDate
    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    // Getter og setter for purchasePrice
    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    
    public LP getLp(){
        return lp;
    }
    
    public void setLp(LP lp){
        this.lp = lp;
    }
}
