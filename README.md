# coin-change
Coin Change Problem


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
