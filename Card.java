package SWE2_Project;
public class Card {
    //this is the card class that will make up the cards in our deck. 
    
    private String suit;
    private int number;
    
    public Card(String suit,int number){
        this.suit = suit;
        this.number = number;
        
    }
    //used to get the suit of the card
     public String getSuit(){
            return suit;
    }
    

   // used to get the number for the card
    public int getNumber(){
            return number;
    }
    
    
    
    //this is used for testing to see if my card class is working
     public void printCard(){
        System.out.println("Suit: " + suit);
        System.out.println("Number: " + number);
        System.out.println();
    }
    
    
}
