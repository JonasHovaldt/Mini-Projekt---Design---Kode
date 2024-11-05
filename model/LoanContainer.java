package model;
import java.util.ArrayList;
import java.time.LocalDate;

/**
 * Write a description of class LoanContainer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanContainer
{
    // instance variables - replace the example below with your own
    private static LoanContainer instance;
    private ArrayList<Loan> loans;

    /**
     * Constructor for objects of class LoanContainer
     */
    public LoanContainer()
    {
        // initialise instance variables
        loans = new ArrayList<>();
    }
    
    public static LoanContainer getInstance(){
        if(instance == null){
            instance = new LoanContainer();
        }
        return instance;
    }
    
    public void addLoan(Loan loan){
        loans.add(loan);
    }
    
    public void removeLoan(Loan loan){
        loans.remove(loan);
    }
    
    public ArrayList<Loan> getAllLoans(){
        return new ArrayList<>(loans);
    }
}
