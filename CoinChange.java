import java.io.IOException;
import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) throws IOException{
		// Test Case 1
		int[] coins = new int[] {1,2,3};
		Arrays.sort(coins);
		int n = 4;
		System.out.println("maximum ways: " + maxWays(n, coins));
		
		// Test Case 2
		coins = new int[] {5,2,3, 6};
		Arrays.sort(coins);
		n = 10;
		System.out.println("maximum ways: " + maxWays(n, coins));
	}
	
	
	private static int maxWays(int n, int[]coins){
		int[] results = new int[n+1];
		results[0] = 1;
		for(int i=0; i<coins.length; i++) {
			for(int j=coins[i]; j<=n; j++) {
				int x = results[j - coins[i]];
				results[j] += x;
			}
		}

		return results[n];
	}
}
