package qualifyinground;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * SheepCounter question from Google Code Jam 2015.
 *
 * @author Roland Dominic Au 
 * @version 2017
 */
public class SheepCounter {
    
    /**
     * drives the class.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter a starting integer:");
        int input = scan.nextInt(); //starting N
        /* test is a list of the characters 0-9 */
        ArrayList<Character> test = new ArrayList<Character>(); 
        int counter = 1; 
        final int ten = 10;
        final int maxExp = 6;
        int value = input;
        String tester = String.valueOf(value);
        
        if (input == 0) {
            System.out.println("INSOMNIA");
        } else {
            for (int i = 0; i < tester.length(); i++) {
                if (!test.contains(tester.charAt(i))) {
                    test.add(tester.charAt(i));
                }
            }
            while (value < Math.pow(ten, maxExp) && test.size() < ten) {
                counter++; 
                value = input * counter;
                
                String valueString = String.valueOf(value);
                for (int i = 0; i < valueString.length(); i++) {
                    if (!test.contains(valueString.charAt(i))) {
                        test.add(valueString.charAt(i));
                    }
                }
            }
            if (test.size() < ten) {
                System.out.println("INSOMNIA");
            } else {
                System.out.println(value);
            }         
            
        }
        scan.close();
    }
}
