package main.java.cardgame;
import java.util.*;
import main.java.cardgame.Game;
import main.java.cardgame.Team;

public class GameDriver {

	
	public static void main(String args[]) {
		
		
		String selection;
		Game game = new Game();
		game.displayGreetings();
		selection = userInput();

		
		while(!selection.equals("quit")) {
			if(selection.equals("rules")) {
				game.displayRules();
				System.out.println();
			}
			else if(selection.equals("")) {
				System.out.println("Invalid entry........");
				System.out.println();
			}
			else if(selection.equals("start")) {
				System.out.println();
				game.setupTeams();
				System.out.println();
				game.gameStart();
			}
			else 
			{
				System.out.println("AHHHHH none of those words were right bleh");	
				System.out.println();
			}	
			//System.out.println();
			selection = userInput();
			Team teamOne= new Team(1);
			Team teamTwo= new Team(2);

			teamOne.setTeamName();
			System.out.println("I like your name team " + teamOne.getTeamName());	
			teamTwo.setTeamName();
			System.out.println("oof team " + teamTwo.getTeamName() + " team " +  teamOne.getTeamName() +" has the better name");
		}
	

		
	}
	
	public static String userInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("User Input: ");
		System.out.print("");
		String answer = scanner.nextLine();
		answer = answer.trim();
		answer = answer.toLowerCase();	//to change it to lowercase
		return answer;
		
	}

	public Integer getPoints(){
		return 0;
	}

	public void displayScore(){

	}
}
