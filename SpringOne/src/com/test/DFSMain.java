package com.test;

import java.util.Scanner;

public class DFSMain {
	public static void main(String[] args) {
		DepthFirstSearch dfs = new DepthFirstSearch();
		Scanner scanner = new Scanner(System.in);
		int dfsTree[][] = dfs.createTree(scanner);

		System.out.println("Enter the search value for the graph");
		int searchValue = scanner.nextInt();

		dfs.searchTree(dfsTree, searchValue);
		scanner.close();
	}
}
