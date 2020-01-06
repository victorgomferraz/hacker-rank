package easy.simplearraysum;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

	@Test
	@DisplayName("Simple Array Sum <https://www.hackerrank.com/challenges/simple-array-sum/problem>")
	void fistCase() {
		int ar[] = {1, 2, 3, 4, 10, 11};
		assertEquals(Solution.simpleArraySum(ar), 31);
	}
}
