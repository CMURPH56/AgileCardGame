package test.java.cardgame;

// import class to be tested
import main.java.cardgame.Team;

// import junit libraries
import static org.junit.Assert.*;
import org.junit.Test;

public class TeamTest {

	@Test
	public void testScore() {
		Team teamOne = new Team(1);
		teamOne.setScore(1);
		teamOne.setScore(4);
		assertEquals(5, teamOne.getScore());
		
	}
}
