package ArrayOneDimesional;

import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		
		int[] list1 = new int[5];
		Scanner in = new Scanner (System.in);
		System.out.println("List1: ");
		for ( int i = 0; i < list1.length; i++) { 
				list1[i] = in.nextInt();
		}
		System.out.println();
		
		int[] list2 = list1;
		System.out.println("List2: ");
		for (int i = 0; i < list2.length; i++) {
			System.out.println(list2[i]);
		}

		
	in.close();
	}

}
