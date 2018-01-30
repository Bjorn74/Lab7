import java.util.Scanner;

/* I know this is lame. I'm just trying to achieve the minimum on this. 
 * I didn't get home until after 7.
 */

public class StudentInfo {

	public static void main(String[] args) {
		
		// Initialize
Scanner scan = new Scanner(System.in);

int[] vStudID = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
String[] vStudentFName = {"Derrick", "Portia", "Marcus", "Ryo", "Emily", "Kal", "The", "Devon", "Nyx", "Tabor"};
String[] vStudentLName = {"Moss", "Lin", "Boone", "Ishida", "Kolburn", "Varrick", "Android", "Taltherd", "Harper", "Calchek"};
String[] vHobby = {"solving his wife's murder", "nanites", "firearms", "Martial Arts", "stowing away and tech", "inciting rebellion", "dressing up and acting human", "surgery", "planning heists","deceptions and lies"};
String[] vHairColor = {"brown", "black", "brown", "shaven", "green", "black", "as she wishes", "blonde", "black", "brown"};
String vConf = "yes";
int vID = 0;
String vInfo = "Nothing";

System.out.println("Welcome to our Java Class. Which student would you like to learn more about?");
System.out.println("Enter a number between 1 and 10.");

try {
	vID = scan.nextInt();
}
catch (IndexOutOfBoundsException e) {
	System.out.println("The Student ID needs to be between 1 and 10.");
}
catch (IllegalArgumentException e) {
	System.out.println("Whoops. You did it again...");
}

System.out.println("Student " + vID + " is " + vStudentFName[vID-1] + " " + vStudentLName[vID-1] + ". What would you like to know about " + vStudentFName[vID-1] + "?");
System.out.println("Hobby or Hair Color?");

vInfo = scan.next();
char vRepeat = 'y';

while (vRepeat == 'y') {
if (vInfo.equalsIgnoreCase("hobby")) {
	System.out.println(vStudentFName[vID-1] + " enjoys " + vHobby[vID-1] + ".");
vRepeat = 'n';
} 
else if (vInfo.equalsIgnoreCase("hair") || vInfo.equalsIgnoreCase("hair color") || vInfo.equalsIgnoreCase("haircolor")) {
	System.out.println(vStudentFName[vID-1] + " has " + vHairColor[vID-1] + " hair.");
	vRepeat = 'n';
}
else {
	System.out.println("Please enter either Hobby or Hair Color.");
	vRepeat = 'y';
}
}

System.out.println("Would you like the see the other information? yes or no");
String vMore = scan.next();

if (vMore.equalsIgnoreCase("yes")) {
if (vInfo.equalsIgnoreCase("hobby")) {
	System.out.println(vStudentFName[vID-1] + " has " + vHairColor[vID-1] + " hair.");
} 
else if (vInfo.equalsIgnoreCase("hair") || vInfo.equalsIgnoreCase("hair color") || vInfo.equalsIgnoreCase("haircolor")) {
	
	System.out.println(vStudentFName[vID-1] + " enjoys " + vHobby[vID-1] + ".");
	vRepeat = 'n';
}

}

	System.out.println();
	System.out.println("Thanks.");




}
	}


