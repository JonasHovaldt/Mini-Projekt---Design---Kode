package model;
import java.time.LocalDate;
import controller.FriendController;
import controller.LPController;

/**
 * Write a description of class Loan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loan
{
    // instance variables - replace the example below with your own
    private int loanNumber;
    private String borrowDate;
    private int period;
    private String state;
    
    private LPController lpController;
    private FriendContainer friendContainer;
    private FriendController friendController;
    private Friend friend;
    private Copy copy;

    /**
     * Constructor for objects of class Loan
     */
    public Loan(int loanNumber, String borrowDate, int period, String state, String phone, int serialNumber) {
        this.loanNumber = loanNumber;
        this.borrowDate = borrowDate;
        this.period = period;
        this.state = state;
        this.friend = friendController.findFriendByPhone(phone);
        this.copy = lpController.findCopyBySerialNo(serialNumber);
    }

    // Getters og Setters for loanNumber
    public int getLoanNumber() {
        return loanNumber;
    }

    public void setLoanNumber(int loanNumber) {
        this.loanNumber = loanNumber;
    }

    // Getters og Setters for borrowDate
    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    // Getters og Setters for period
    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    // Getters og Setters for state
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public void setCopy(Copy copy){
        this.copy = copy;
    }
    
    public Copy getCopy(){
        return copy;
    }
}
