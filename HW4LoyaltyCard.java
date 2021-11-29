/**
 * The HW4LoyaltyCard class holding 
 * basic functionality for KV4001, HW4.
 * @author Alan Maughan
 * @version 1.0
 */
public class HW4LoyaltyCard
{
    private HW4Name name;
    private String cardNumber;
    
    /**
     * Constructor for objects of class HW4LoyaltyCard.
     * 
     * @param fName The cardholder's first name 
     * @param lName The cardholder's last name
     * @param cardNumber The loyaltyCard number
     */
    public HW4LoyaltyCard(String fName, String lName, String cardNumber)
    {
  
        name = new HW4Name (fName, lName);
        this.cardNumber = cardNumber; 
    }
    
   /**
     * Get the cardholder's first name
     * 
     * @return the cardholder's first name
     */
    public String getFirstName()
    {
        return name.getFirst();
    }
    
    /**
     * Get the cardholder's last name
     * 
     * @return the cardholder's last name
     */
    public String getLastName()
    {
        return name.getLast();
    }
    
    /**
     * Get the cardholder's account Number
     * 
     * @return the cardholder's account number
     */
    public String getcardNumber()
    {
        return cardNumber;
    }
    
 
    public void printAccountDetails()
    {
        System.out.println( toString());
    }     
       
    /**
     * Return details of an member as a formated string
     * 
     * @return the cardholder's details 
     */
    
    public String toString()    
    {
        String output = cardNumber + " ";
        output = output + name.toString() + "\n";      
        return output;
    }
    
    // mutators         
    /**
     * Change the firstname
     * 
     * @param fName the new firstname
     * 
     */
    public void setFirstName(String fName)
    {
        name.setFirst (fName);
    }
    
    /**
     * Change the lastname
     * 
     * @param lName the new lastname
     * 
     */
    public void setLastName(String lName)
    {
        name.setLast(lName);
    }   
} // end class