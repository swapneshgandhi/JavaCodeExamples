package com.cloudwick.training.core.coinchange;

import java.util.ArrayList;

public class Program {

	public static void change(ArrayList<Integer> coins, int[] amounts,
			int highest, int sum, int goal) {

		// See if we have reached the goal.
		if (sum == goal) {
			display(coins, amounts);
			return;
		}

		// We cannot go over our goal.
		if (sum > goal) {
			return;
		}

		// Add higher amounts to a new ArrayList.
		for (int value : amounts) {
			if (value >= highest) {
				ArrayList<Integer> copy = new ArrayList<>();
				copy.addAll(coins);
				copy.add(value);
				// Recurse to check total and add further coins.
				change(copy, amounts, value, sum + value, goal);
			}
		}
	}

	public static void display(ArrayList<Integer> coins, int[] amounts) {
		// Count each amount within the added coins.
		// ... Then display the amount and count.
		for (int amount : amounts) {
			int count = 0;
			for (int coin : coins) { // Count loop.
				if (coin == amount) {
					count++;
				}
			}
			System.out.print(amount);
			System.out.print(":");
			System.out.println(count);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		ArrayList<Integer> coins = new ArrayList<>();

		// This array contains the coin amounts.
		int[] amounts = { 1, 2 };

		// Solve for 51 cents.
		change(coins, amounts, 0, 0, 4);
	}
}