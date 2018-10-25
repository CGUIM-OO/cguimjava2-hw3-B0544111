
public class Card {

		// TODO Auto-generated method stub
		private int suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
		private int rank; //1~13
		/**
		 * @param s suit
		 * @param r rank
		 */	
//		public enum suitEnum {Clubs, Diamonds, Hearts, Spades};
		public enum suitEnum {Clubs, Diamonds, Hearts, Spades};
		
		public String getSuit() {
			switch(suitEnum.Clubs.ordinal()) {
			case 1:
				return suitEnum.Clubs.toString();
			case 2:
				return suitEnum.Diamonds.toString();
			case 3:
				return suitEnum.Hearts.toString();
			case 4:
				return suitEnum.Spades.toString();
			default:
				return this.toString();
			}
		}

		public Card(Suit s,int value){
			suit=s;
			rank=value;
			
		}	
		//TODO: 1. Please implement the printCard method (20 points, 10 for suit, 10 for rank)
		public void printCard(){
			//Hint: print (System.out.println) card as suit,rank, for example: print 1,1 as Clubs Ace
			if(getSuit()==1) {
				System.out.print("Clubs");
			}
			if(getSuit()==2) {
				System.out.print("Diamonds");
			}
			if(getSuit()==3) {
				System.out.print("Hearts");
			}
			if(getSuit()==4) {
				System.out.print("Spades");
			}
			
			String rankname=" ";
			int remain = rank % 13;
			        switch(remain) { 
			            case 0 :
			            	rankname = "K";			            	
			            case 1 :
			            	rankname = "Ace";
			            case 11: 
			            	rankname = "J";
			            case 12: 
			            	rankname = "Q";
			            default: 
			            	rankname = Integer.toString(remain);			            	
			        } 
			    }
			
			int suitOfCard=getSuit();
			int rankOfCard=getRank();
			System.out.println("Card(%s, %s)", , rankname);
		}
		public int getSuit(){		
			return suit;
		}
		public int getRank(){		
			return rank;
		}
	

}
