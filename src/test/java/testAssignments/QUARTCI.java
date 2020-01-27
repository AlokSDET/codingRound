package testAssignments;

import java.util.ArrayList;
import java.util.List;

public class QUARTCI {

	public static void main(String[] args) {

		List<Integer> songs = new ArrayList<Integer>();
		songs.add(10);
		songs.add(50);
		songs.add(90);
		songs.add(30);

		int pairs = 0;
		/*
		 * int pairs = 0; for(int i = 0; i< songs.size(); i++) { for(int j= i+1 ; j<
		 * songs.size(); j++) { if((songs.get(i)+ songs.get(j)) % 60 ==0) { pairs++; } }
		 * } System.out.println(pairs);
		 */
		int i =0;
		int j =1;
		while(pairs < (songs.size()-1)) {
			
			if((songs.get(i) + songs.get(j))%60==0) {
				pairs++;
			}
			
			i++;
			

		}
		System.out.println(pairs);
	}
}
