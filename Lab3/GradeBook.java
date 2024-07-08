import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GradeBook {
    private double[] scores;
    private int scoresSize;

    /**
     * Constructs a gradebook with no scores and a given capacity.
     *
     * @param capacity the maximum number of scores in this gradebook
     */
    public GradeBook(int capacity) {
        scores = new double[capacity];
        scoresSize = 0;
    }

    /**
     * Adds a score to this gradebook.
     *
     * @param score the score to add
     * @return true if the score was added, false if the gradebook is full
     */
    public boolean addScore(double score) {
        if (scoresSize < scores.length) {
            scores[scoresSize] = score;
            scoresSize++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Test for the addScore method.
     *
     * Use the toString method to compare the contents of what is in the scores array
     * vs. what is expected to be in the scores array assertTrue( . . .)
     * Compare the scoreSize to the expected number of scores entered, using assertEquals(. . .)
     */
    public void testAddScore() {
        // Add scores to the gradeBook
        assertTrue(addScore(85.5));
        assertTrue(addScore(90.0));

        // Check the contents of the scores array using the toString method
        assertEquals("85.5 90.0", toString());

        // Check if the scoreSize matches the expected number of scores entered
        assertEquals(2, getScoreSize());
    }

    /**
     * Computes the sum of the scores in this gradebook.
     *
     * @return the sum of the scores
     */
    public double sum() {
        double total = 0;
        for (int i = 0; i < scoresSize; i++) {
            total += scores[i];
        }
        return total;
    }

    /**
     * Test for the sum method.
     *
     * Compare what is returned by sum() to the expected sum of the scores entered.
     */
    public void testSum() {
        // Add scores to the gradeBook
        addScore(85.5);
        addScore(90.0);

        // Calculate the expected sum of the scores entered
        double expectedSum = 85.5 + 90.0;

        // Compare the sum returned by sum() with the expected sum
        assertEquals(expectedSum, sum(), 0.001); // Use delta for double comparison
    }

    /**
     * Gets the minimum score in this gradebook.
     *
     * @return the minimum score, or 0 if there are no scores.
     */
    public double minimum() {
        if (scoresSize == 0) return 0;
        double smallest = scores[0];
        for (int i = 1; i < scoresSize; i++) {
            if (scores[i] < smallest) {
                smallest = scores[i];
            }
        }
        return smallest;
    }

    /**
     * Test for the minimum method.
     *
     * Compare what is returned by minimum() to the expected minimum of the scores entered.
     */
    public void testMinimum() {
        // Add scores to the gradeBook
        addScore(85.5);
        addScore(90.0);

        // Assert that the minimum score is as expected
        assertEquals(85.5, minimum(), 0.001); // Use delta for double comparison
    }

    /**
     * Gets the final score for this gradebook.
     *
     * @return the sum of the scores, with the lowest score dropped if
     * there are at least two scores, or 0 if there are no scores.
     */
    public double finalScore() {
        if (scoresSize == 0)
            return 0;
        else if (scoresSize == 1)
            return scores[0];
        else
            return sum() - minimum();
    }

    /**
     * Test for the finalScore method.
     *
     * Compare what is returned by finalScore() to the expected finalScore of the scores entered.
     * The finalScore is the sum of the scores, with the lowest score dropped if there are at least two scores,
     * or 0 if there are no scores.
     */
    public void testFinalScore() {
        // Add scores to the gradeBook
        addScore(85.5);
        addScore(90.0);

        // Assert that the final score is as expected
        assertEquals(85.5 + 90.0, finalScore(), 0.001); // Use delta for double comparison
    }

    /**
     * Gets the number of scores currently stored in this gradebook.
     *
     * @return the number of scores
     */
    public int getScoreSize() {
        return scoresSize;
    }

    /**
     * Returns a string representation of the scores stored in this gradebook.
     * Each score is separated by a space.
     *
     * @return a string representation of the scores
     */
    public String toString() {
        // Using StringBuilder to create the string representation
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < scoresSize; i++) {
            result.append(scores[i]);
            if (i < scoresSize - 1) {
                result.append(" "); // Add space if not the last score
            }
        }
        return result.toString();
    }
}
