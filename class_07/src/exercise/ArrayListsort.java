package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListsort {

	public static void main(String[] args) {
		ArrayList<Float> userinput = new ArrayList<Float>(); 
		Scanner input = new Scanner(System.in);
		float sum = 0;
		System.out.println("Enter number or q to quit: ");
		
		while (input.hasNextFloat()) {
			float num = input.nextFloat();
			sum += num;
			System.out.println("Enter number or q to quit: ");
			userinput.add(num);
		}
		
		System.out.println(userinput);
		
		Collections.sort(userinput);
		
		System.out.print("Sorted: ");
		System.out.println(userinput);
		
		System.out.print("Highest: ");
		System.out.println(userinput.get(userinput.size()-1));
		
		System.out.print("Lowest: ");
		System.out.println(userinput.get(0));
		
		System.out.print("Average: ");
		System.out.println(sum / userinput.size());
		
	}

}
