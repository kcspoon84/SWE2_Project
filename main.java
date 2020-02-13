
package SWE2_Project;


public class main {
     public static void main(String[] args) {
        Deck A = new Deck();
        
        Game C = new Game();
        A.MakeDeck(A);
        A.Shuffle();
        Hand Player = new Hand();
        Hand Dealer = new Hand();
        C.PlayGame(Player, Dealer, A);
        
        
        
        
    
}
}
