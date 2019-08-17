package assignment01;

import java.util.ArrayList;
import java.util.Scanner;

public class DesignTestCases {
	public int numberOfVariables;
	ArrayList<ArrayList<Integer>> rangesList = new ArrayList<ArrayList<Integer>>();
	
	public void takeInput()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of variables:");
		numberOfVariables = input.nextInt();
		
		for(int i = 0; i < numberOfVariables; i++) 
		{
			System.out.println("Enter range of variable number " + (i+1) + ":");
			ArrayList<Integer> tempList = new ArrayList<Integer>();
			tempList.add(input.nextInt());
			tempList.add(input.nextInt());
			rangesList.add(tempList);
		} 		
	}

	
	
	
	
	
	
	public void printBVC()
	{
		
		
		
	}
	
	
	public void printRobustTesting()
	{}
	
	public void printWorstCaseTesting()
	{}
	
	public void design3TestCases()
	{
		
	}
	
}
