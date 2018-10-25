import java.util.ArrayList;

public class Deck {

		// TODO Auto-generated method stub
		private ArrayList<Card> cards;
		//TODO: Please implement the constructor (30 points)
		public Deck(int nDeck){
			cards=new ArrayList<Card>();
			//1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
			//Hint: Use new Card(x,y) and 3 for loops to add card into deck
			//Sample code start
			//Card card=new Card(1,1); ->means new card as clubs ace
			//cards.add(card);
			//Sample code end
			for(int deckNum=1; deckNum<=nDeck ; deckNum++) {
				for(int i=1; i<=4 ; i++) {
					for(int j=1; j<=13 ; j++) {
						Card card=new Card(i, j);
						cards.add(card);
					}
				}
			}
			shuffle();
		}	
		//TODO: Please implement the method to print all cards on screen (10 points)
		public void printDeck(){
			//Hint: print all items in ArrayList<Card> cards, 
			//TODO: please implement and reuse printCard method in Card class (5 points)
			System.out.println("All cards in decks are:");
			System.out.println(cards);
			for(int i=0;i<cards.size();i++) {
				Card c=new Card(cards.get(i).getSuit(),cards.get(i).getRank());
				c.printCard();	
			}
			
		}
		
		public void shuffle() {
			for(int i = 0; i < cards.size(); i++) {
	            Collections.swap(cards, i, 
	                (int) (Math.random() * cards.size() - 1));
	        }
	        return cards.toArray(new Card[52]);
		}
		
		public ArrayList<Card> getAllCards(){
			return cards;
		}
	

}
