import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradeBookTester {

    private GradeBook gradeBook1;
    private GradeBook gradeBook2;

    @Before
    public void setUp() {
        // Create two GradeBook objects with a capacity of 5
        gradeBook1 = new GradeBook(5);
        gradeBook2 = new GradeBook(5);

        // Add some random scores to gradeBook1
        gradeBook1.addScore(85.5);
        gradeBook1.addScore(90.0);

        // Add some random scores to gradeBook2
        gradeBook2.addScore(75.25);
        gradeBook2.addScore(88.75);
    }

    @After
    public void tearDown() {
        // Set the GradeBook objects to null
        gradeBook1 = null;
        gradeBook2 = null;
    }

    @Test
    public void testAddScore() {
        // Add more random scores to gradeBook1
        gradeBook1.addScore(80.0);
        gradeBook1.addScore(95.0);

        // Assert that gradeBook1 has the expected scores and score size
        assertEquals("85.5 90.0 80.0 95.0", gradeBook1.toString());
        assertEquals(4, gradeBook1.getScoreSize());

        // Add more random scores to gradeBook2
        gradeBook2.addScore(82.5);

        // Assert that gradeBook2 has the expected scores and score size
        assertEquals("75.25 88.75 82.5", gradeBook2.toString());
        assertEquals(3, gradeBook2.getScoreSize());
    }
}
