package queries;

public class FindSumEvenNumberAfterQueriesFunction {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
		int sum = 0;

		int i = 0;

		for (int a : A) {
			// Sum of even numbers
			if (a % 2 == 0) {
				sum += a;
			}
		}

		int[] answer = new int[queries.length];

		// For each array in double array
		for (int[] q : queries) {
			// Checking if index of A is even
			if (A[q[1]] % 2 == 0) {
				// If even, then subtract the element of A to the sum
				sum -= A[q[1]];
			}

			// Adding the number to the index of A
			A[q[1]] += q[0];

			// Checking if index of A is still even
			if (A[q[1]] % 2 == 0) {
				// If still even, then add the element of A to the sum
				sum += A[q[1]];
			}

			// Add the sum to the solution
			answer[i] = sum;

			// Since i starts from 0
			i++;
		}

		return answer;
	}
}
