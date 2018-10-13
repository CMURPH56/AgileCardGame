import java.util.*;
public class GameDriver {

	// List of 50 cards with Questions and Answers
	static Card[] CardDeck;
	
	public static void main(String args[]) {
		// Initialize game
		CardDeck = new Card[50];
		loadCardDeck(CardDeck);
		
		displayOptions();
		
		
		String selection = userInput();
		
		
		
		if(selection.equals("rules")) 
		{
			displayRules();
		}
		else if(selection.equals("start")) 
		{
			System.out.println("HERE WE GOOOOOO!");
			Team teamOne = new Team(1);
			Team teamTwo = new Team(2);
			
			teamOne.setTeamName();
			System.out.println("I like your name team " + teamOne.getTeamName());	
			teamTwo.setTeamName();
			System.out.println("oof team" + teamTwo.getTeamName() + " team one had the better name");
		}
		else 
		{
			System.out.println("AHHHHH none of those words were right bleh");	
		}	
		
	}
	
	
	public static void displayOptions() {
		System.out.println("Hello and welcome to the agile card game");
		System.out.println("__________________________________________");
		System.out.println("If you would like to hear the rules of the game please type in rules below");
		System.out.println("If you would like to start the game please type in start below!!");
	}
	
	public static void displayRules() {
		System.out.println("rules rules rules....");
	}
	public static String userInput(){
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.next();
		answer = answer.trim();	
		return answer;
		
	}
	
	public Integer getPoints(){
		return 0;
	}

	public void displayScore(){

	}
	
	// Get question and answer from file for hard code?
	public static void loadCardDeck(Card[] cardDeck) {
		
		for (int i = 0; i < 50; i++)
		{
			cardDeck[i] = new Card();
			
			//cardDeck[i].setsQuestion( read a line then add to this card);
			//cardDeck[i].setsAnswer( read the next line then add to this card);
		}
		
		// Or just hard code?
		cardDeck[0].setsQuestion("What is Net Present Value?");
		cardDeck[0].setsQuestion("The present value of an investment�s earning less the investment itself.");
		
		cardDeck[1].setsQuestion("What is a product backlog?");
		cardDeck[1].setsQuestion("A prioritized list of �requirements� for a  project.");
	}
}
