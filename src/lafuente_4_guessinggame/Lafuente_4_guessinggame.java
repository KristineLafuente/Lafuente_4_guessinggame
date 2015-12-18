/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lafuente_4_guessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Kristine
 */
public class Lafuente_4_guessinggame {

    static String username;
    static int uguess;
    static int guess;
    static int magicnumber;
    static Random rand = new Random();
    static boolean playagain;
    static int guesses = 6;
    
    /**
     * @param args the command line arguments
     */
    //the statics are shared with the entire program
    public static void main(String[] args) {
         Scanner name = new Scanner(System.in);
        magicnumber = rand.nextInt(100);
        System.out.println("Hello, would you like to play a game?");
        System.out.println("What's your name?");
        username = name.nextLine();
        System.out.println("Hello " + username + " please pick a number betwen 1 and 100");           
        
        
        //runs while the condition is true
         while (guesses >= 0) {
         playthegame();
         System.out.println("You have " + guesses + " guesses left.");
         guesses --;
        }
        }  
    
        static void playthegame(){
          Scanner guess = new Scanner(System.in); 
         uguess = guess.nextInt();
          if (magicnumber == uguess){
              System.out.println(" you win" );
              guesses = 0;
                   } else if (magicnumber > uguess){
                System.out.println(" Too low! Try again ");
            } else {
                System.out.println(" Too high!");
            }
            if (guesses < 1){
                System.out.println("Game Over");
                playagain = false;
            }
     
            }
    }

        
        // TODO code application logic here
        
    
 




