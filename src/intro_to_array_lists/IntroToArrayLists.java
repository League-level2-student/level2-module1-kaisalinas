package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> stringies = new ArrayList<String>();
		// 2. Add five Strings to your list
		stringies.add("Bob");
		stringies.add("Rob");
		stringies.add("Cob");
		stringies.add("Snob");
		stringies.add("Job");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < stringies.size(); i++) {
			String s = stringies.get(i);

			// 5. Print only the even numbered elements in the list.
			if (i % 2 == 0) {
				System.out.println(s);
			}
		}
		// 4. Print all the Strings using a for-each loop
		for (String s : stringies) {
			System.out.println(s);
		}
			// 6. Print all the Strings in reverse order.
			for (int i = stringies.size()-1; i >= 0; i--) {
				String s = stringies.get(i);
				System.out.println(s);
			}
		
		// 7. Print only the Strings that have the letter 'e' in them.
			for(int i = 0; i<stringies.size(); i++) {
				String s = stringies.get(i);
					
				
			}
	}
}
