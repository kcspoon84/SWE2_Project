
package SWE2_Project;

import java.util.Scanner;
public class Game {
    static Scanner scan = new Scanner(System.in);
     int value = 0;
     int dealerValue = 0;
    public void PlayGame(Hand Player, Hand Dealer, Deck A){
        Player.DealHand(A);
        Dealer.DealHand(A);
        dealerValue = Dealer.getValue(0)+Dealer.getValue(1);
        int k = Dealer.HandCount();
      
        int choice;
        Boolean WinOrLose = true;
       
        
        
        
        System.out.println("Your hand is :");
        Player.PrintHand();
        int i;
        int gameCount = Player.HandCount();    // I tried putting this loop in his own method, but i was getting an error for some reason
         for (i = 0; i < gameCount; i++){ 
         value = value + Player.getValue(i);
         }
        
        System.out.println("Your current score is " + value );
        
            
        
        //Shows the player 1 card from the dealer
        System.out.println("The one card you can see from the dealer is: ");
        Dealer.PrintHandDealer();
        // the player picks if they want to stay or hit
        System.out.println("Would you like to keep your current hand or add another card? Stay(1) Hit(2)" );
        choice = scan.nextInt();
        
        while(choice != 1 && choice != 2){
            System.out.println("Please choose 1 or 2");
            choice = scan.nextInt();
        }
        // loop to keep adding cards to the player hand as long as they choose hit.
        //if they bust the loop ends and the player loses
            while(choice == 2 && WinOrLose == true){
                value = 0;
                int j = Player.HandCount();
                Player.DealHand(A);
                Player.PrintHand();
                for (i = 0; i < j; i++){ 
         value = value + Player.getValue(i);
         }
        // a WinOrLose method is called to check if the player is going over 21
        System.out.println("Your current score is " + value );
        WinOrLose = CheckScore(value);
        if(WinOrLose == false){
            System.out.println("YOU LOSE");
            break;
        }
        
       
        
        
        
             
            System.out.println("Would you like to Stay(1) or Hit(2)?");
            choice = scan.nextInt();
             
            }
            //if the dealer's score is less then 17 he will hit to try and beat the player
            if(dealerValue <= 17){
            System.out.println("The Dealer will now hit to match or beat your score");
            }
            //the dealer will hit until he beats the player, busts or goes over the value of 17 without busting
            while(choice == 1 && dealerValue <= 17 && dealerValue < value ){
                
            
                 
                 k = Dealer.HandCount();
                Dealer.DealHand(A);
                System.out.println("The Dealers Full hand after hitting is :");
                Dealer.PrintHand();
                for (i = 2; i < k; i++){ 
         dealerValue= dealerValue + Dealer.getValue(i);
         System.out.println("The dealer current score is " + dealerValue);
         if(dealerValue >= 17){
             if(dealerValue > 21){
                 System.out.println("THE DEALER BUSTS");
             }
             
         break;}
       System.out.println("The Dealer will hit again");
         
                
                
            }
        
            
            
            
            
                
            
                
        }
            //if neather the player or the dealer busts we will compair the scores.
            if(dealerValue <= 21 && value <= 21){
                if(dealerValue >= value) {
                    System.out.println("THE DEALER'S SCORE IS HIGHER OR TIED");
                    System.out.println("THE DEALER WINS");
                    
                }
                else{
                    System.out.println("THE PLAYER'S SCORE IS HIGHER");
                    System.out.println("THE PLAYER WINS");
                }
                
            }
    
    }
        
        
        
        
    
    
    public boolean CheckScore(int value){
        if(value > 21){
            return false;
        }
        else{
            return true;
        }
        

        }
    

    

}





    
   

