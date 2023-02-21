import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();
        //user cards
        int userCard1 = drawRandomCard();
        int userCard2 = drawRandomCard();
        int userHandValue = userCard1 + userCard2;

        System.out.println("\n You get a \n" + cardString(userCard1) + "\n and a \n " + cardString(userCard2));
        System.out.println("Your hand total is: " + userHandValue);
        
        //dealer cards
        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();
        int dealerHandValue = dealerCard1 + dealerCard2;

        System.out.println("The dealer shows \n " + cardString(dealerCard1) + "\n and has a card facing down \n" + faceDown());
        System.out.println("The dealer's total is hidden.");


       
        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 
        
        System.out.println("Would you like to hit or stay?");
        //find out if user wants to hit or stay
        String choice = hitOrStay();
        //assign variable to allow them to choose again
        int currentCardValue = drawRandomCard();
        while (choice.equalsIgnoreCase("hit")){
            currentCardValue = drawRandomCard();
            userHandValue += currentCardValue;
            System.out.println("\n You get a \n" + cardString(currentCardValue) + "\n ");
            System.out.println("Your new total is: " + userHandValue);
           choice = hitOrStay();
            
        }//w
        
        //For tasks 9 to 13, see the article: Blackjack Part II. 
         scan.close();

    }//main

    /** 
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard() {
        return (int) (Math.random() * 13) + 1;
    }//drc
    

    /** 
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString (int cardNumber) {
        switch(cardNumber) {
            case 1: return
                
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
            

            case 2: return 

                "   _____\n"+              
                "  |2    |\n"+ 
                "  |  o  |\n"+
                "  |     |\n"+
                "  |  o  |\n"+
                "  |____Z|\n";
            
            
            case 3: return 
            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";
            

            case 4: return
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";
            

            case 5: return 
                "   _____ \n" +
                "  |5    |\n" +
                "  | o o |\n" +
                "  |  o  |\n" +
                "  | o o |\n" +
                "  |____S|\n";
                

            case 6: return 
                "   _____ \n" +
                "  |6    |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  | o o |\n" +
                "  |____6|\n";
                

            case 7: return
        
                "   _____ \n" +
                "  |7    |\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |____7|\n";
                

            case 8: return
        
                "   _____ \n" +
                "  |8    |\n" +
                "  |o o o|\n" +
                "  | o o |\n" +
                "  |o o o|\n" +
                "  |____8|\n";
                
        
            case 9: return
                "   _____ \n" +
                "  |9    |\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |____9|\n";
                

            case 10: return 
                "   _____ \n" +
                "  |10  o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |o o o|\n" +
                "  |___10|\n";
                
        
            case 11: return 

                "   _____\n" +
                "  |J  ww|\n"+ 
                "  | o {)|\n"+ 
                "  |o o% |\n"+ 
                "  | | % |\n"+ 
                "  |__%%[|\n";
                
        
            case 12: return 

                "   _____\n" +
                "  |Q  ww|\n"+ 
                "  | o {(|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%O|\n";
                
        
            case 13: return
                "   _____\n" +
                "  |K  WW|\n"+ 
                "  | o {)|\n"+ 
                "  |o o%%|\n"+ 
                "  | |%%%|\n"+ 
                "  |_%%%>|\n";
                

                default: return "Something went horribly wrong.";
            }//switch
    }//cardString

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }//fD
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    public static String hitOrStay() {
        System.out.println("Please enter 'hit' or 'stay'");
        String choice = scan.nextLine();
        if (choice.equalsIgnoreCase("hit")) {
            return "hit";
        } else if (choice.equalsIgnoreCase("stay")) {
            return "stay";
        }
        while (!choice.equalsIgnoreCase("hit") && !choice.equalsIgnoreCase("stay")){
            System.out.println("Please choose hit or stay.");
            choice = scan.nextLine();
            
        } 
        
       return choice;

    }//hos

    switch (cardCorrectValues) {
        case 1: 
    }
}//class 

