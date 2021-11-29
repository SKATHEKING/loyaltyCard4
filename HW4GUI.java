import javax.swing.*;

import java.awt.FlowLayout ; 

import java.awt.*;

import java.awt.event.*;

import java.util.EventObject;

/**
 * Write a description of class HW4GUI here.
 *
 * @author (Mateus Goncalves De Ouro)
 * @version (1.1, 01/05/2019 )
 */

public class HW4GUI extends JFrame implements ActionListener
{
    // sets all variables to be used

    private JPanel buttonPanel ;

    private HW4LoyaltyCardList cards; 

    private JButton jbtAdd ;

    private JButton jbtQuit;

    private JButton jbtNumber;

    private JLabel jlbCardNumber ;

    private JLabel jlbFName ;

    private JLabel jlbLName ;

    private JTextField jtfCardNumber ;

    private JTextField jtfFName ;

    private JTextField jtfLName ;

    private int nextCardNumber ;

    private JPanel textPanel ;

    /**
     * Constructor for objects of class HW4GUI
     */
    public HW4GUI() 
    {  

        super("Loyalty_Cards");

        cards = new HW4LoyaltyCardList() ;

        makeFrame();
        showFrame();

    }

    /**
     * Allows events to occur depending on which button 
     * clicked/used
     *
     * @param  e for event this carries on the events that were
     * transmitted via event listenners
     * 
     */
    public void actionPerformed(ActionEvent e)
    {

        nextCardNumber = 1000 ;

        if (e.getSource() == jbtQuit)
        {
            System.exit(0);
        }

        else if (e.getSource() == jbtAdd)
        {
            if(jbtAdd.getText().equals("Add Loyalty Card")) 
            {

                jbtAdd.setText("Confirm");

                jbtNumber.setText("Clear");

                String fName = jtfFName.getText();

                String lName = jtfLName.getText();

                nextCardNumber++;

                String newCards = Integer.toString(nextCardNumber);

                String cardNumber = newCards ;
                if(jbtAdd.getText().equals("Confirm") &&
                jtfFName.getText().equals("") ||
                jtfFName.getText().equals("   " ))
                {
                    jbtAdd.setText("Add Loyalty Card");
                    jbtNumber.setText("No. of Loyalty Cards");
                    jtfFName.setText("NOTHING INSERTED BOI");
                }
                else if(jbtAdd.getText().equals("Confirm") &&
                jtfLName.getText().equals("" ) ||
                jtfLName.getText().equals("   " ))
                {
                    jbtAdd.setText("Add Loyalty Card");
                    jbtNumber.setText("No. of Loyalty Cards");
                    jtfLName.setText("NOTHING INSERTED BOI");
                }
                else if(jbtAdd.getText().equals("Confirm"))
                {

                    cards.addLoyaltyCard(new HW4LoyaltyCard( fName, lName, cardNumber));
                    jtfCardNumber.setText( newCards) ;
                    
                }
                else if (e.getSource() == jbtNumber)
                {
                    if(jbtNumber.getText().equals("Clear"))
                    {
                        jtfFName.setText(null);
                        jtfLName.setText(null);
                        jtfCardNumber.setText(null);
                        dispose();   
                    }

                }

            }

                

        } 

        else if(e.getSource() == jbtNumber)
        {

            if(jbtNumber.getText().equals("No. of Loyalty Cards"))
            {

                jbtNumber.setText("Clear");
                
                jlbCardNumber.setText("Number of Cards");
                
                if (cards.getNumberOfLoyaltyCards() == 0)
                {

                    jtfCardNumber.setText("0")  ; 

                }
                else {

                    String numberOfCards = Integer.toString(cards.getNumberOfLoyaltyCards());

                    jtfCardNumber.setText( numberOfCards );
                }
            }
            else if(jbtNumber.getText().equals("Clear"))
            {
                jbtAdd.disable();
                        jtfFName.setText(null);
                        jtfLName.setText(null);
                        jtfCardNumber.setText(null);
                dispose();   
            }

        }
    }

    /**
     *
     *  creates buttons and their labels
     * 
     */
    public void createButtonPanel()
    {
       

        jbtAdd = new JButton("Add Loyalty Card");
        jbtQuit = new JButton("Quit");
        jbtNumber = new JButton("No. of Loyalty Cards");
        
        
        buttonPanel = new JPanel() ;
        buttonPanel.setLayout( new FlowLayout());
        
        buttonPanel.add(jbtAdd);
        buttonPanel.add(jbtNumber) ;
        buttonPanel.add(jbtQuit);

        add(buttonPanel,BorderLayout.SOUTH);
    }

    /**
     * adds all text panels and their respective labels
     */
    public void createTextPanel()
    {
       

        jlbFName = new JLabel("First Name:");
        jlbLName = new JLabel("Last Name:");
        jlbCardNumber = new JLabel("Card number:");
        jtfFName= new JTextField(20);
        jtfLName= new JTextField(20);
        jtfCardNumber= new JTextField(20);
        
         textPanel = new JPanel();
        textPanel.setLayout( new FlowLayout());
        
        
        
        
        textPanel.add(jlbFName);
        jlbFName.setToolTipText("This is the first name insertion");
        textPanel.add(jtfFName);
        jlbFName.setHorizontalAlignment(JLabel.RIGHT);  
        jtfFName.setHorizontalAlignment(JLabel.RIGHT);
        
        textPanel.add(jlbLName);
        jlbLName.setToolTipText("This is the last name insertion");
        textPanel.add(jtfLName);
        jlbLName.setHorizontalAlignment(JLabel.RIGHT);  
        jtfLName.setHorizontalAlignment(JLabel.RIGHT);
        
        
        textPanel.add(jlbCardNumber);
        jlbCardNumber.setToolTipText("This is the card number");
        textPanel.add(jtfCardNumber);
        jtfCardNumber.setEditable(false);
        jlbCardNumber.setHorizontalAlignment(JLabel.RIGHT);  
        jtfCardNumber.setHorizontalAlignment(JLabel.RIGHT);
        
        add(textPanel,BorderLayout.WEST);

    }

    /**
     * builds frame 
     */
    public void makeFrame()
    {

        

        

        createTextPanel();
        
        
        createButtonPanel();
        
        
        
        jbtAdd.addActionListener(this);
        jbtQuit.addActionListener(this);
        jbtNumber.addActionListener(this);
        jtfFName.addActionListener(this);
        jtfLName.addActionListener(this);

    }

    /**
     * sets frame to be visible and states what to do in event
     * of closing 
     */
    public void showFrame()
    {

        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        pack();

        setLocationRelativeTo( null);

        setResizable(true);

        setVisible(true) ;

        setSize(500,200);
    }
}
