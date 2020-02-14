import java.util.Scanner;
public class AddPlayer  {
    static Scanner scan = new Scanner(System.in);
     int value = 0;
     int dealerValue = 0;
     int player2Value=0;
    public void PlayGame(Hand Player, Hand Dealer,Hand Player2, Deck A){
        Player.DealHand(A);
        Dealer.DealHand(A);
        Player2.DealHand(A);
        dealerValue = Dealer.getValue(0)+Dealer.getValue(1);
        player2Value = Player2.getValue(0)+Player2.getValue(1);
        int k = Dealer.HandCount();
        int p2 = Player2.HandCount();
      
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
        
        System.out.println("The one card you can see from the Player2 is: ");
        Player2.PrintHandPlayer2();
            
        
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
            }
            
            if(player2Value <= 16){
            System.out.println("The Player2 will now hit to match or beat your score");
            
            //the dealer will hit until he beats the player, busts or goes over the value of 17 without busting
            while(choice == 1 && player2Value <= 17 && player2Value < value ){
                 
                 p2 = Player2.HandCount();
                Player2.DealHand(A);
                System.out.println("The Player2's Full hand after hitting is :");
                Player2.PrintHand();
                for (i = 2; i < p2; i++){ 
         player2Value= player2Value + Player2.getValue(i);
         System.out.println("The Player2's current score is " + player2Value);
         if(player2Value >= 17){
             if(player2Value > 21){
                 System.out.println("THE Player2 BUSTS");
             }
             
         break;}
       System.out.println("The Player2 will hit again");
                
            }
                
        }
            }
            //if neather the player or the dealer busts we will compair the scores.
            if(dealerValue <= 21 && value <= 21 && player2Value <= 21){
                if(dealerValue >= value && dealerValue >= player2Value) {
                    
                    System.out.println("THE DEALER WINS");
                    System.out.println( "Dealer's Score:" +dealerValue);
                    System.out.println( "Your Score:" +value);
                    System.out.println( "Player2's Score:" +player2Value);
                }
               else if(player2Value > value && player2Value > dealerValue){
                    
                    System.out.println("THE Player2 WINS");
                    System.out.println( "Player2's Score:" +player2Value);
                    System.out.println( "Dealer's Score:" +dealerValue);
                    System.out.println( "Your Score:" +value);
                }
                else{
                   
                    System.out.println("YOU WIN");
                    System.out.println( "Your Score:" +value);
                    System.out.println( "Dealer's Score:" +dealerValue);
                    System.out.println( "Player2's Score:" +player2Value);
                    
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
