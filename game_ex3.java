 import java.util.Random;
import java.util.Scanner;
 class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses;
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();

    }
    boolean IsCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number){
            System.out.format("yes you guessed it right number, it was %d \n You guessed it in %d attempts" , +number, +noOfGuesses);
            return true;
        } 
        else if(inputNumber < number){
            System.out.println("Too less");
        }
        else if(inputNumber > number){
            System.out.println("Too high");
        }
        return false;

    }
 } 
public class game_ex3{
    public static void main(String[] args) {
        boolean b = false;
        while (!b) {
            
        Game g = new Game();
        g.takeUserInput ();
        b = g.IsCorrectNumber();
       
        }
    }
}
