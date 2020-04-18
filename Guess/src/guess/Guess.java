/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author dread
 */

public class Guess {
    Timer timer;
    
    public Guess(int seconds) {
        timer = new Timer();
        timer.schedule(new TimerThread(), seconds * 1000); //used to set length in seconds
    }
    
    class TimerThread extends TimerTask {
        @Override
        public void run() {
            System.out.println("\n\nNot fast enough!");
            System.out.println("Bye!");
            timer.cancel(); //cancel the timer
            System.exit(0); //used to close game
        }
    }
     
    public static void main(String[] args) {
        new Guess(10); //set to 10 seconds can be changed
                          
        final int LIMIT = 10; // set as max number in game can be changed as desired
        
        System.out.println("Guess the number!");
        System.out.println("I'm thinking of a number from 1 to " + LIMIT); //if limit is changed will display new max
        System.out.println("Try to guess it in 10 seconds."); 
        System.out.println("");  
        System.out.println("Timer Started!");
                    
        double d = Math.random() * LIMIT; //random number to set max
        int number = (int) d;
        number++;
       
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (true) {
            System.out.print("Your guess: ");
            int guess = sc.nextInt();
            
            if (guess < 1 || guess > LIMIT) {
                System.out.println("Invalid guess. Try again.");
                continue;
            }
            
            if (guess < number) {
                System.out.println("To low.");
            } else if (guess > number) {
                System.out.println("To high.");
            } else {
                System.out.println("You guessed it in " + count + " tries.\n");
                System.out.println("You did it!");
                System.out.println("The application will end when the timer finishes.");
                System.exit(0); //ends game after win not really what i wanted will do more research
                break;
            }
            count++;
        }
        
    }
    
}