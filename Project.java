import java.util.InputMismatchException;
import java.util.Scanner;
public class Project{
    public static void main(String[] args){

        System.out.println("LETTER ARRANGEMENT GAME!");

        int level = 0;          //initialise because of try-catch block
        Scanner input = new Scanner(System.in);

        /*while(true) {
            System.out.print("Pick a level: Easy(1) / Medium(2) / Hard(3): ");
            level = input.nextInt();
            if(level == 1 || level == 2 || level == 3){
                break;
            }
            System.out.println("You have entered an invalid level.");
        }*/
        while(true){
            try {
                System.out.print("Pick a level: Easy(1) / Medium(2) / Hard(3): ");
                level = input.nextInt();
                if(level == 1 || level == 2 || level == 3)
                    break;
                else
                    throw new invalidLevelException("Invalid level exception");
            }catch(InputMismatchException e){
                System.out.println("Input mismatch, enter a number between 1 and 3.");
                input.next();
            }catch(invalidLevelException e){
                System.out.println("You have entered an invalid level."); //Infinite loop issue.

            }
        }


        String[] easyLevel = {"r-o-w-g", "i-r-b-d", "A-r-k-d"};  //AT LEAST 2 ANAGRAMS!
        String[] mediumLevel = {"l-e-t-l", "m-e-p-t","a-r-e-d"}; //AT LEAST 3 ANAGRAMS!
        String[] hardLevel = {"i-t-m-e","i-t-l-e","i-r-c-a-h"}; //AT LEAST 4 ANAGRAMS!

        if(level == 1){
            int index = 0;       //determines what prompt is displayed from each array.
            int n = 1;           //Tracks the number of prompts and controls the loop.
            while(n<=3) {
                String anagram1;
                String anagram2;
                System.out.println("Task " + n + ": " + displayAnagram(easyLevel, index) + " (At least 2 anagrams are required)");
                System.out.print("Anagram 1(Enter your Answer): ");
                anagram1 = input.next();
                checkEasyAnagram(anagram1, index);
                System.out.print("Anagram 2(Enter your Answer): ");
                anagram2 = input.next();
                checkEasyAnagram(anagram2, index);
                index++;
                n++;
            }
            System.out.println("Good job!");
        }

        if(level == 2){
            int index = 0;
            int n = 1;
            while(n<=3){
                String anagram1;
                String anagram2;
                String anagram3;
                System.out.println("Task " + n + ": " + displayAnagram(mediumLevel,index) + " (At least 3 anagrams are required)");
                System.out.print("Anagram 1(Enter your Answer): " );
                anagram1 = input.next();
                checkMediumAnagram(anagram1, index);
                System.out.print("Anagram 2(Enter your Answer): " );
                anagram2 = input.next();
                checkMediumAnagram(anagram2, index);
                System.out.print("Anagram 3(Enter your Answer): " );
                anagram3 = input.next();
                checkMediumAnagram(anagram3, index);
                index++;
                n++;
            }
            System.out.println("Good job!");
        }

        if(level == 3){
            int index = 0;
            int n = 1;
            while(n<=3){
                String anagram1;
                String anagram2;
                String anagram3;
                String anagram4;
                System.out.println("Task " + n + ": " + displayAnagram(hardLevel,index) + " (At least 4 anagrams are required)");
                System.out.print("Anagram 1(Enter your Answer): " );
                anagram1 = input.next();
                checkHardAnagram(anagram1, index);
                System.out.print("Anagram 2(Enter your Answer): " );
                anagram2 = input.next();
                checkHardAnagram(anagram2, index);
                System.out.print("Anagram 3(Enter your Answer): " );
                anagram3 = input.next();
                checkHardAnagram(anagram3, index);
                System.out.print("Anagram 4(Enter your Answer): " );
                anagram4 = input.next();
                checkHardAnagram(anagram4, index);
                index++;
                n++;
            }
            System.out.println("Good job!");
        }
    }
    public static String displayAnagram(String[] level, int index){
        return level[index];
    }
    public static void checkEasyAnagram(String anagram, int index){
        if( index == 0){
            if ((anagram.compareToIgnoreCase("row")==0) || (anagram.compareToIgnoreCase("grow")==0)){
                System.out.println("You are correct!");

            }
            else
                System.out.println("You are wrong!");
        }
        if(index == 1){
            if ((anagram.compareToIgnoreCase("bird")==0) || (anagram.compareToIgnoreCase("rib")==0) || (anagram.compareToIgnoreCase("bid") == 0)){
                System.out.println("You are correct!");
            }
            else
                System.out.println("You are wrong!");
        }
        if(index == 2){
            if ((anagram.compareToIgnoreCase("dark")==0) || (anagram.compareToIgnoreCase("ark")==0)){
                System.out.println("You are correct!");
            }
            else
                System.out.println("You are wrong!");
        }
    }
    public static void checkMediumAnagram(String anagram, int index){
        if(index == 0){
            if((anagram.compareToIgnoreCase("let")==0)||(anagram.compareToIgnoreCase("tell") == 0)|| (anagram.compareToIgnoreCase("ell") == 0)){
                System.out.println("You are correct!");
            }
            else
                System.out.println("You are wrong!");
        }
        if(index == 1){
            if((anagram.compareToIgnoreCase("temp")==0)||(anagram.compareToIgnoreCase("met") == 0)|| (anagram.compareToIgnoreCase("pet") == 0)){
                System.out.println("You are correct!");
            }
            else
                System.out.println("You are wrong!");
        }
        if(index == 2){
            if((anagram.compareToIgnoreCase("read")==0)||(anagram.compareToIgnoreCase("dear") == 0)|| (anagram.compareToIgnoreCase("ear") == 0) || (anagram.compareToIgnoreCase("red") == 0) || (anagram.compareToIgnoreCase("dare") == 0) || (anagram.compareToIgnoreCase("are") == 0)){
                System.out.println("You are correct!");
            }
            else
                System.out.println("You are wrong!");
        }
    }
    public static void checkHardAnagram(String anagram, int index){
        if(index == 0) {
            if ((anagram.compareToIgnoreCase("item") == 0) || (anagram.compareToIgnoreCase("time") == 0) || (anagram.compareToIgnoreCase("emit") == 0) || (anagram.compareToIgnoreCase("mite") == 0) || (anagram.compareToIgnoreCase("tie") == 0) || (anagram.compareToIgnoreCase("met") == 0)){
                System.out.println("You are correct!");
            }
            else
                System.out.println("You are wrong!");
        }
        if(index == 1){
            if ((anagram.compareToIgnoreCase("lite") == 0) || (anagram.compareToIgnoreCase("tile") == 0) || (anagram.compareToIgnoreCase("tie") == 0) || (anagram.compareToIgnoreCase("let") == 0) || (anagram.compareToIgnoreCase("lie") == 0) || (anagram.compareToIgnoreCase("lit") == 0)){
                System.out.println("You are correct!");
            }
            else
                System.out.println("You are wrong!");
        }
        if(index == 2){
            if ((anagram.compareToIgnoreCase("air") == 0) || (anagram.compareToIgnoreCase("car") == 0) || (anagram.compareToIgnoreCase("chair") == 0) || (anagram.compareToIgnoreCase("hair") == 0) || (anagram.compareToIgnoreCase("rich") == 0) || (anagram.compareToIgnoreCase("arch") == 0) || (anagram.compareToIgnoreCase("ich") == 0) || (anagram.compareToIgnoreCase("char") == 0) || (anagram.compareToIgnoreCase("arc") == 0)){
                System.out.println("You are correct!");
            }
            else
                System.out.println("You are wrong!");
        }
    }

}