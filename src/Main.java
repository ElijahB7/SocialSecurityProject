/* Social Security Project
Write a program that prompts the user to enter a Social Insurance Number in the format
DDD-DDD-DDD, where D is a digit. Your program should check whether the input is
valid. (that means it is in the proper format – number of characters and dashes)
If the number is valid then print the number is a valid Social Insurance Number
If the number is not valid then print the number is an invalid Social Insurance Number
If the 1st digit is a 9 then Print “This number is for a temporary worker”
If the 1st digit is not a 9 print “This number is for a citizen or permanent resident”
 */

import java.util.Scanner;
import java.util.*;

class Main {
    public static void main(String[] args){
        Program();
    }
    public static void Program() {

        Scanner in = new Scanner(System.in);

        System.out.print("== Enter your social security number, make sure it is in proper format (000-000-000)== ");

        String socSec = in.nextLine();

        boolean num = (socSec.length() == 11) && (Character.isDigit(socSec.charAt(0))) &&
                (Character.isDigit(socSec.charAt(1))) &&
                (Character.isDigit(socSec.charAt(2))) &&
                (socSec.charAt(3) == '-') &&
                (Character.isDigit(socSec.charAt(4))) &&
                (Character.isDigit(socSec.charAt(5))) &&
                (Character.isDigit(socSec.charAt(6))) &&
                (socSec.charAt(7) == '-') &&
                (Character.isDigit(socSec.charAt(8))) &&
                (Character.isDigit(socSec.charAt(9))) &&
                (Character.isDigit(socSec.charAt(10)));

        if(num == true) {
            System.out.print("This is valid");
            if(socSec.charAt(0) == '9') {
                System.out.print(", This number is for a temporary worker");
            }
            if(socSec.charAt(0) != '9'){
                System.out.print(", This number if for a citizen or permanent worker");
            }

        }else{
            System.out.print("Not valid!");
        }

    }
}