package SWE2_Project;
import java.util.Random;
import java.util.*;
// SWE2 project
public class Deck {
    
    


/**
 * All methods regarding the card deck.
*/

   
    private static final int MAX = 53;
    private int top;
    public static int count = 0;
    private Card a[]= new Card[MAX];

    /**
    * Default Constructor for the deck
    * 
    * Sets a negative value for the Stack.
    */
    public Deck(){
        top = -1;   
    }

    /**
    * Pushes a card onto the deck. this will be used when adding the cards back to the deck
    * 
    * 
    */
    public void Push(Card x){
        sizeCount(count++);
        a[++top]= x;
    }
    
    /**
    * Removes a card from the deck. this will be used to put the cards in the players hands
    */
    public Card pop(){
        Card x;
    
        if(top < 0){
            return null;
        }
        else{
   
            x = a[top--];
            sizeCount(count--);
            return x;
        }
    
    }

    /**
     * Shuffles the deck.
    */
    public void Shuffle(){
         
        
	Random rgen = new Random();  		
 
	for (int i=0; i<=top; i++) {
            int R = rgen.nextInt(top);
            Card temp = a[i];
            a[i] = a[R];
            a[R] = temp;
	}
    }
    
 
     // Used to control the size of the deck.
    
    public int sizeCount(int x){
        return x;
    }
   
    // puts all the cards into a deck
     public void MakeDeck(Deck A){
         int i = 0;
         for(i = 1; i < 10; i++){
      Card Cardmaker = new Card( i + " of Hearts", i);
       A.Push(Cardmaker);
       Card Cardmaker1 = new Card( i + " of Clubs", i);
       A.Push(Cardmaker1);
       Card Cardmaker2 = new Card( i + " of Spades", i);
       A.Push(Cardmaker2);
       Card Cardmaker3 = new Card( i + " of Diamonds", i);
       A.Push(Cardmaker3);
       
       
           
            
         
     }
         Card Cardmaker4 = new Card( "Jack of Hearts", 10);
       A.Push(Cardmaker4);
        Card Cardmaker5 = new Card( "King of Hearts", 10);
       A.Push(Cardmaker5);
        Card Cardmaker6 = new Card( "Queen of Hearts", 10);
       A.Push(Cardmaker6);
        Card Cardmaker7 = new Card( "Ace of Hearts", 11);
       A.Push(Cardmaker7);
       
       
        Card Cardmaker8 = new Card( "Jack of Spades", 10);
       A.Push(Cardmaker8);
        Card Cardmaker9 = new Card( "King of Spades", 10);
       A.Push(Cardmaker9);
        Card Cardmaker10 = new Card( "Queen of Spades", 10);
       A.Push(Cardmaker10);
        Card Cardmaker11 = new Card( "Ace of Spades", 11);
       A.Push(Cardmaker11);
       
          Card Cardmaker12 = new Card( "Jack of Clubs", 10);
       A.Push(Cardmaker12);
        Card Cardmaker13 = new Card( "King of Clubs", 10);
       A.Push(Cardmaker13);
        Card Cardmaker15 = new Card( "Queen of Clubs", 10);
       A.Push(Cardmaker15);
        Card Cardmaker14 = new Card( "Ace of Clubs", 11);
       A.Push(Cardmaker14);
       
        Card Cardmaker16 = new Card( "Jack of Diamonds", 10);
       A.Push(Cardmaker16);
        Card Cardmaker17 = new Card( "King of Diamonds", 10);
       A.Push(Cardmaker17);
        Card Cardmaker18 = new Card( "Queen of Diamonds", 10);
       A.Push(Cardmaker18);
        Card Cardmaker19 = new Card( "Ace of Diamonds", 11);
       A.Push(Cardmaker19);
     }
     
     // calls the make deck function and prints the the items in the stack to show the "Deck" is made
     public void printDeck(Deck A){
       
         
        
            for(int i = 0; i <= top; i++){
               a[i].printCard(); 
            }
        }
       
        
        
        
    
    //more testing for the hand class
   
    }
    
    

