package ArrayOneDimesional;

public class exercise2 {

	public static void main(String[] args) {
		
		// write a statement that declare a string array initialize with the following string: 
		//Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday 
		//write a loop that display content of each element in the array that you declared

		String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		for (int i=0; i<days.length; i++) {
			System.out.println(days[i]);
		}
		
		System.out.println();
		int j = 0; 
		while (j < days.length) {
			System.out.println(days[j]);
			j++;
		}
		
		System.out.println();
		int k = 0;
		do {
			System.out.println(days[k]);
			k++;
		} while (k < days.length);
	}

}
