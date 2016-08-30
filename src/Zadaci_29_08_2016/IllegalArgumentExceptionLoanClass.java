package Zadaci_29_08_2016;
/*
 *  (IllegalArgumentException) 
 *  Modify the Loan class in Listing 10.2 to throw IllegalArgumentException if the loan amount, 
 *  interest rate, or number of years is less than or equal to zero. 
 */
public class IllegalArgumentExceptionLoanClass {
	
	public static void main(String[] args) {
		
		// try blok za unos elemenata
        try {
            Loan loan = new Loan();
            loan.setAnnualInterestRate(0);
            loan.setNumberOfYears(0);
            loan.setLoanAmount(100);
            
        } 
        //ukoliko se uhvati exception
        catch (IllegalArgumentException ex) {
        	//printa se poruka
            System.out.println("Illegal Argument Exception. ");
        }
    }

}

 
