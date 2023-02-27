import java.util.Random;
import java.util.Scanner;

public class Game extends Story {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    public void enterName(){
        System.out.println("Enter name:");
        setName(scanner.nextLine());
    }
    public void enterNoun1(){
        System.out.println("Enter noun 1:");
        setNoun1(scanner.nextLine());
    }
    public void enterNoun2(){
        System.out.println("Enter noun 2:");
        setNoun2(scanner.nextLine());
    }
    public void enterNoun3(){
        System.out.println("Enter noun 3:");
        setNoun3(scanner.nextLine());
    }
    public void enterAdj1(){
        System.out.println("Enter adj 1:");
        setAdj1(scanner.nextLine());
    }
    public void enterAdj2(){
        System.out.println("Enter adj 2:");
        setAdj2(scanner.nextLine());
    }
    public void enterAdverb(){
        System.out.println("Enter adverb:");
        setAdverb(scanner.nextLine());
    }


    public void playInstructions() {
        System.out.println("Welcome to the MadLibs game! If you type in 'words', we'll" +
                " give you a story.....");
    }

    public void playGame() {
        enterName();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdj1();
        enterAdj2();
        enterAdverb();
        setRandomNumbers();
        storyPrint();
        System.out.println(getStory());
    }

    public void storyPrint() {
        String gameStory = getName()+ " and Procalino went to the icehouse to see " + getNoun1() +
                " and eat burgers. But Oh no! " + getNoun2() + " and " + getNoun3() + " were at the icehouse also " +
                "this was a shocker, \n they both were " + getAdj1() + " and had to be very careful so that they" +
                " don't get caught in the icehouse. \n So they crept to the back door that had a keypad and pressed "
                + getRandomNumbers() + " on the keypad to make an exit. ";
        setStory(gameStory);
    }
}
