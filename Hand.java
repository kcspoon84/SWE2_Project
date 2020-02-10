
package SWE2_Project;
import java.util.*;


public class Hand {
    
    Card[] Delt = new Card[10];
    
   
    
    // Deals two cards out to the player or dealer
   public void DealHand(Deck A){
       for(int i = 0; i < 2; i++){
       
      Delt[i]= A.pop();
      
       
       
   }
   }
    // testing to see if i moved cards from deck to hand correctly
    public void PrintHand(){
       
          int count = 1;
          for(int j = 0; j < 2; j++){
              
              System.out.println("Card " + count + ":");
              System.out.println(Delt[j].getSuit());
              count++;
              
          }
            
        }
    
    
    
}
