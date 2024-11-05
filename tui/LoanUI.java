package tui;
import java.util.Scanner;
import controller.LoanController;
import model.Loan;
import java.util.ArrayList;
import model.LoanContainer;


/**
 * Write a description of class LoanUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoanUI
{
    // instance variables - replace the example below with your own
    private LoanController loanController;
    private Scanner scanner;
    private LoanContainer loanContainer;

    /**
     * Constructor for objects of class LoanUI
     */
    public LoanUI()
    {
        // initialise instance variables
        this.loanController = new LoanController();
        this.scanner = new Scanner(System.in);
        this.loanContainer = LoanContainer.getInstance();
    }
    
    public void start(){
        startMenu();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void startMenu(){
        boolean exit = false;
        while(!exit){
            System.out.println("Welcome To The Loan Menu");
            System.out.println("1. Want To Create A Loan?");
            System.out.println("2. Want To View All Loans?");
            System.out.println("3. Want To Exit The Program?");
            System.out.println("Choose An Option From Above");
            
            int choice = scanner.nextInt();
            
            switch(choice){
                case 1:
                    createLoanMenu();
                    break;
                case 2:
                    viewAllLoans();
                    break;
                case 3:
                    exit = true;
                    System.out.println("Exiting The Program. Thank You For Visiting");
                    break;
                default:
                    System.out.println("Please Type A Valid Option");
            }
        }
    }
    
    private void createLoanMenu(){
        System.out.println("Create A New Loan");
        scanner.nextLine();
        System.out.print("Please Enter Friend's Phonenumber");
        String phone = scanner.nextLine();
        scanner.nextLine();
        
        System.out.print("Please Enter LP Serial Number");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Please Enter A Loan Number");
        int loanNumber = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Please Enter Borrow Date (YYYY-MM-DD):");
        String borrowDate = scanner.nextLine();
        scanner.nextLine();
        
        System.out.print("Please Enter Loan Period");
        int period = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Please Enter Loan State (Rented or Avaliable)");
        String state = scanner.nextLine();
        scanner.nextLine();
        
        Loan loan = loanController.createLoan(loanNumber, borrowDate, period, state, phone, serialNumber);
        
        if(loan !=null){
            System.out.println("You Have Successfully Made A Loan" + loan);
        }
        else{
            System.out.println("You Failed To Create A Loan. Please Check The Details In The Loan");
        }
    }
    
    private void viewAllLoans(){
        System.out.println("All Loans Created");
        
        ArrayList<Loan> loans = LoanContainer.getInstance().getAllLoans();
        if(loans.isEmpty()){
            System.out.println("No Loans Has Been Found");
        }
        else{
            for(Loan loan : loans){
                System.out.println(loan);
            }
        }
    }
}
