/*Name:Tommy Lee Truong
 *Last Edit:Nov 13 2017
 *Program Name: Roommate Compatibility Program 
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Match {

	public static void main(String [] args) {
		Student[]student = new Student[100];
		String filename = "src/FullRoster.txt";
		Scanner input;
		try {
			input = new Scanner (new FileReader(filename));
		
			
			input.useDelimiter("[\t\r-]");
		
		String Token = "";
		 List<String> roster = new ArrayList<String>();
		 int count = 0;
	    	int line = 0;
		 while (count <100) {
			 count++;
			Token =input.next();
			roster.add(Token);
		}

	    String[] rosterArray = roster.toArray(new String[0]);
	    int[] save = new int[100];
	    for (count = 0; count < 100; count++) {
			student[line] = new Student();
			
			if(count%7 == 0) {		
				student[line].setName(rosterArray[count]);
				}
			
			if(count%7 == 1) {
				student[line].setGender(rosterArray[count].charAt(0));
			}
		
			if(count%7 == 2) {
				Scanner Temp = new Scanner(rosterArray[count]);
				Temp.useDelimiter("[-]");
				String Token2="";
				List<String> roster2 = new ArrayList<String>();
				while(Temp.hasNext()) {
					Token2 = Temp.next();
					roster2.add(Token2);
				}
				String[] rosterArray2 = roster2.toArray(new String[0]);
				for (int egg = 0; egg < 4; egg++) {
				save[count]= Integer.valueOf(rosterArray2[egg--]);
			}
				int a; int b; int c;
				a= save[count-2];
				
				b= save[count--];
			
				c= save[count];
				student[line].setBirthdate(b,a,c);
				}
			
			
				
			if(count%7 == 6) {
				int e; int f; int g; int d;
				e= Integer.valueOf(rosterArray[count-3]);
		
				f= Integer.valueOf(rosterArray[count-2]);
			
				g= Integer.valueOf(rosterArray[count--]);
			
				d= Integer.valueOf(rosterArray[count]);
				student[line].setPref(e, f, g,d);
				line++;
				
			}
	      }
		int maxScore = 0;
		Student pair1 = new Student();
		Student pair2 = new Student();
		for(int i=0; i < student.length; i++) {
			
			for(int j= 0; j < student.length; j++) {
			if (student[j].getMatch() == false) {
				int currentScore = student[i].compare(student[j]);
				if(currentScore > maxScore) {
					maxScore = currentScore;
					pair1 = student[i];
					pair2 = student[j];
				}
			}
			pair1.CheckMatch(pair1,pair2);
			System.out.println(pair1.getName() + " matches with " + pair2.getName() + " with the score " + maxScore);
			
			}
			}
		
		for (int i =0; i < student.length; i++) {
		if (student[i].getMatch() == false) {
			System.out.println(student[i].getName() + "has no matches");
			}
		}
		input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	
}

