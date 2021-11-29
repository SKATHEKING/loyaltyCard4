
/**
 * Represents a name to be used in HW4
 * first [second] last name.
 * 
 * @author A Maughan
 * @version 1.0
 */
public class HW4Name
{
    private String first;    
    private String last;

    /**
     *  Constructor for objects of class Name
     *  @param first    the first name
     *  @param last     the last name
     */
    public HW4Name(String first, String last)
    {
        this.first = first;
        this.last = last;
    }
    
    /**
     * Returns the firstname
     * 
     * @return     the firstname 
     */
    public String getFirst()
    {
        return first;
    }
    
    /**
     * Returns the lastname
     * 
     * @return     the lastname 
     */
    public String getLast()
    {
        return last;
    }
    
    /**
     * Returns the full name name. Allows for any element being null.
     * 
     * @return     the full name 
     */
    public String toString()
    {
        String name = first + " " + last;
        return name;
    }
    
    /**
     * Set the first name
     * 
     * @param  first   the new firstname
     */
    public void setFirst( String first )
    {
       this.first = first;
    }
    
    /**
     * Set the last name
     * 
     * @param  last   the new lastname
     */
    public void setLast( String last )
    {
       this.last = last;
    }
    
    /**
     * Set the full name
     * 
     * @param first     the firstname
     * @param last      the lastname
     */
    public void setFullName(String first, String last)
    {
       setFirst(first);
       setLast(last);        
    }
            
    /**
     * Compares two names based on the toString method
     * 
     * @return true if names are equal, false otherwise
     */
    public boolean equals( Object o) 
    {     
        if ( o == null)  
        {
            return false;      
        }
        
        if ( this == o)
        {
            return true;   
        }
         
        HW4Name other = (HW4Name) o;        
         
        if (other.toString().equals( toString()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
  } // end HW4Name class