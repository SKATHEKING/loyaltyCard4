import java.util.ArrayList;

public class HW4LoyaltyCardList
{
    private ArrayList < HW4LoyaltyCard> cards;

    /**
     * Create a HW4LoyaltyCard. 
     */
    public HW4LoyaltyCardList()
    {
        cards = new ArrayList < HW4LoyaltyCard>();
    }

    /**
     * Add a member to this member list.
     * @param member the member to be added
     */
    public void addLoyaltyCard(HW4LoyaltyCard card)
    {
        cards.add(card);
    }

    /**
     * Return the number of cards currently held.
     * 
     * @return the number of cards
     */
    public int getNumberOfLoyaltyCards()
    {
        return cards.size();
    }
    
    /**
     * Provides a list of cards. 
     * 
     * @return a list of cards
     */
    public String toString()
    {
        String myString = "HW4LoyaltyCardship List " ;
        myString = myString + "\nNumber of cards: " 
                            + getNumberOfLoyaltyCards() +"\n";
        
        if (getNumberOfLoyaltyCards() > 0 )
        {
            for (HW4LoyaltyCard card : cards)
            {
                myString = myString + card.toString() + "\n";
            }
        }      
        return myString;
    }   
}