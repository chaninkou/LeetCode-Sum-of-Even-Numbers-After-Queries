package queries;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 4 };

		int[][] queries = { { 1, 0 }, { -3, 1 }, { -4, 0 }, { 2, 3 } };
		
		System.out.println("A: " + Arrays.toString(A));
		System.out.println("queries: " + Arrays.deepToString(queries));
		
		FindSumEvenNumberAfterQueriesFunction solution = new FindSumEvenNumberAfterQueriesFunction();
		
		System.out.println("Solution: " + Arrays.toString(solution.sumEvenAfterQueries(A, queries)));
		
		
	}
}
