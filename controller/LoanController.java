package controller;
import model.*;
import java.time.LocalDate;
import java.util.ArrayList;


/**
 * Write a description of class LoanController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanController
{
    // instance variables - replace the example below with your own
    // private LoanContainer loanContainer;
    private LoanContainer loanContainer;
    private FriendController friendController;
    private LPController lpController;

    /**
     * Constructor for objects of class LoanController
     */
    public LoanController()
    {
        // initialise instance variables
        // loanContainer = LoanContainer.getInstance();
        this.friendController = new FriendController();
        this.lpController = new LPController();
        this.loanContainer = LoanContainer.getInstance();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Loan createLoan(int loanNumber, String borrowDate, int period, String state, String phone, int serialNumber){
        // loan = new Loan(newLoanNumber, newBorrowDate, newPeriod, newState);
        // loanContainer.addLoan(loan);
        // return loan;
        // Friend friend = friendController.findFriendByPhone(phone);
        // Copy copy = lpController.findCopyBySerialNo(serialNumber);
        
        Loan loan = new Loan(loanNumber, borrowDate, period, state, phone, serialNumber);
        loanContainer.addLoan(loan);
        return loan;
    }
}
