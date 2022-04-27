import java.util.Scanner;
import java.io.*;


public class Menu { //setting public class as Menu
    
public static void echo(String userName){ //setting echo string name to display 20 times

for (int i = 0; i < 20; ++i) //for loop iterating 20x for echo
System.out.println(userName);//print to screen user name
}

public static void ageChecker(int ageOfUser) { //setting oldMeter to check user age
int yearsOld = ageOfUser * 2; //setting the age of user as int and multiplying by 2
System.out.println("Your age is: " + ageOfUser);//outputting user age to screen
System.out.println("If we doubled your age, you will be " + yearsOld + " years old!");//after doubling user age, we print it to screen
}

public static void check(int ageOfUser){ //check case forageOfUser
    if(ageOfUser <= 19) //if statement if user is 19 or younger
    System.out.println("Since you are " + ageOfUser + " years old, you are a teenager.");
    //above output age of user if it meets condition
    else // else statement if condition above is not met
    System.out.println("Since you are " + ageOfUser + " years old, you are NOT a teenager.");
    }//print to screen that user is 20 or above

    public static void main(String[] args) { //main method

    int ageOfUser = 0, stars = 0; //setting ageOfUser and stars to 0 before incrementing

    Scanner scnr = new Scanner(System.in); //starting scanner class to accept user input

    //code below is the Menu of the application and printing to screen user options
    System.out.println("Welcome to the Main Menu User!!!"); 
    System.out.println("Please select a choice from the list below"); 
    System.out.println("Enter 1 to print your name 20 times: ");
    System.out.println("Enter 2 to print your age, double it, and find out if you are a teenager or not: ");
    System.out.println("Enter 3 to see a triangle made of X's: ");
        
    int userInput = scnr.nextInt();//taking user input and storing it as int in userInput

    switch(userInput){ //starting switch statement

	case 1: //case 1 of switch statement
            System.out.print("Please input your name: "); //print to screen
            String userName = scnr.next(); //accepting user input for their name and storing as String
            echo(userName); //echo the name back 20x
            break;//ending case 1

        case 2: //case 2 of switch statement
            System.out.println("Please enter your age: "); //print to screen
            ageOfUser = scnr.nextInt();//storing user input
            ageChecker(ageOfUser); //taking user age and doubling it
            check(ageOfUser); //checking userAge to sww if teenager or not
            break;//ending case 2
           
        case 3: //case 3 of switch statement
             try{ //try block for exception handling
                
               FileWriter fw = new FileWriter("triangle.txt"); //text document with triangle of X's
               System.out.println("Please enter a value between 3 and 50 to see your triangle: ");//print to screen
                int x = scnr.nextInt(); //setting int x from input
                for(int i=1; i<=x; ++i){ //for loop for triangle increment operator 
                    for(int j=0; j<i; ++j){ //for loop for triangle incremet operator
                        System.out.printf("X"); //output Xs to screen
                        fw.write("X"); //write X's to file
                    }
                System.out.println();//outprint to screen
                fw.write("\n");//skip a line
                }    
               fw.close(); //closing write to file
            }
            catch(Exception e) //exception handling check, closing it
            {System.out.println(e);}//outputting any error 
            break; //closing case 3
}
}
}
