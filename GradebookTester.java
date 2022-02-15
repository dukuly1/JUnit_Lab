
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
//Two grade book attributes
private GradeBook book1;
private GradeBook book2;
	@BeforeEach
	void setUp() throws Exception {
	//creation of new object that that
	//takes the maximum amount of size 
	//that can be accepted by the object
		book1=new GradeBook(5);
		book2=new GradeBook(5);
	//The object takes in a score
		book1.addScore(100);
		book1.addScore(120);
		book2.addScore(50);
		book2.addScore(55);
		book2.addScore(5);
	}
	@AfterEach
	void tearDown() throws Exception {
		book1=null;
		book2=null;
	}
	@Test
	//The method will print out the total
	//amount in each object
	void testSum() {
	assertEquals(220,book1.sum(), .0001);
	assertEquals(110,book2.sum(), .0001);		
	}
	@Test
	//will add the scores in each object
	//and subtract the minimum score from the finalScore
	//of each object
	void testMinimum() {
	assertEquals(100, book1.minimum(),.001);
	assertEquals(5, book2.minimum(),.001);	
		}
	@Test
	//Will return false if the string out is not equal
	void addScoreTest() {
	assertEquals(false,book1.toString().equals("100 120"));
	assertEquals(false,book2.toString().equals("50 55 5"));
	}
	@Test
	//adds all the scores in each of the object and subtract the minimum
	//from each of the final score
	void finalScore() {
	assertEquals(120,book1.finalScore(), .001);
	assertEquals(105,book2.finalScore(), .001);
	}
}

