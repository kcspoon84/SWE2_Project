package SWE2_Project;
import java.util.*;


public class Hand {
    
    Card[] Delt = new Card[10];
    int Hc = 2; // starting hand count;
    int Dc = 1; // starting hand shown for dealer;
    int Pc = 1; //starting hand shown for Player2;
    int CallCount = 0; // keeps track how many times handcount function has been called
   int count = 0;
    
    // Deals two cards out to the player or dealer
   public void DealHand(Deck A){
       for(int i = count; i < Hc; i++){
       
      Delt[i]= A.pop();
      
       
       
   }
   }
    // testing to see if i moved cards from deck to hand correctly
    public void PrintHand(){
       
        int count = 1;
          for(int j = 0; j < Hc; j++){
              
              System.out.println("Card " + count + ":");
              System.out.println(Delt[j].getSuit());
              count++;
              
              
          }
    }
          
          
           public void PrintHandDealer(){
       
        int count2 = 1;
          for(int j = 0; j < Dc; j++){
              
              System.out.println("Card " + count2 + ":");
              System.out.println(Delt[j].getSuit());
              count2++;
              
              
          }
            
   
}
    public void PrintHandPlayer2(){
       
        int count2 = 1;
          for(int j = 0; j < Pc; j++){
              
              System.out.println("Card " + count2 + ":");
              System.out.println(Delt[j].getSuit());
              count2++;
              
              
          }
    
}
           public int getValue(int i){
               return Delt[i].getNumber();
           }
           
           public int HandCount(){
               if(CallCount > 0){
               
               Hc++;
               
               if(count < 2){
               count++;
               count++;
               }
               else{
               count++;
                       }
               }
               CallCount++;
               return Hc;
               
           }
}
