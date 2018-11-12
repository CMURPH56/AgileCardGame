//package for the test file
package test.java.cardgame;

//import class(es) need to use for creating object
import main.java.cardgame.QACard;

//import junit libraries
import static org.junit.Assert.*;

//import junit libraries
import org.junit.Test;

public class QACardTest {

	//TC_001 - Test getsQuestion 1
	@Test
	public void testGetsQuestion_1() {
		QACard qaCard = new QACard("One of the reasons to do Agile development?", "Flexibility");
		assertEquals("One of the reasons to do Agile development?", qaCard.getsQuestion());
	}
	
	//TC_002 - Test setsQuestion_Long string
	@Test
	public void testSetsQuestion_1() {
		QACard qaCard = new QACard("","");
		qaCard.setsQuestion("????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????");
		assertEquals("????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????????", qaCard.getsQuestion());
	}
	
	//TC_003 - Test checkResult_True - 1
	@Test
	public void testCheckResult_1() {
		QACard qaCardCheck = new QACard("ABCDEF","GHIJKL?");
		QACard qaCardResult = new QACard("ABCDEF","GHIJKL?");
		assertEquals(true, qaCardCheck.checkResult(qaCardResult));
	}
}