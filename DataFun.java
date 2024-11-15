// any imports here
import java.util.Scanner;
/**
     * Data Fun Project
     * @author Nathan Rubow
     * @version 11/5/2024
     */
public class DataFun{
    public static void main(String[] args){
        System.out.println("What is your favorite integer? ");
        try (Scanner fun = new Scanner(System.in)) {
            int userFavInt =  fun.nextInt();
            if (userFavInt>=0)
                {
                System.out.println(userFavInt + " is a positive number");
                }
            else
            {
            System.out.println(userFavInt + " is a negative number");
            }
            if (userFavInt>1000)
            {
                System.out.println("It is greater than 1000");
            }
            else if (userFavInt>100)
            {
                System.out.println("It is greater than 100");
            }
            else if (userFavInt>10)
            {
                System.out.println("It is greater than 10");
            }
            else if (userFavInt>0)
            {
                System.out.println("It is greater than 0");
            }
            else
            {
                System.out.println("It is less than 0");
            }
            if ((userFavInt%2)==0)
            {
                System.out.println("your number is even");
            }
            else
            {
                System.out.println(userFavInt +" is odd");
            }
            switch (userFavInt) 
            {
            case 2:
                System.out.println("The noble gas is Helium.");
                break;
            case 10:
                System.out.println("The noble gas is Neon.");
                break;
            case 18:
                System.out.println("The noble gas is Argon.");
                break;
            case 36:
                System.out.println("The noble gas is Krypton.");
                break;
            case 54:
                System.out.println("The noble gas is Xenon.");
                break;
            case 86:
                System.out.println("The noble gas is Radon.");
                break;
            case 118:
                System.out.println("The noble gas is Oganesson.");
                break;
            
            }

        System.out.println("What is your favorite Character? ");
        try (Scanner cool = new Scanner(System.in)) {
            String userInput =  cool.nextLine();
            char userFavChar = userInput.charAt(0);
            if (Character.isUpperCase(userFavChar)){
                System.out.println(userFavChar +" is uppercase");
            }
            if (Character.isLowerCase(userFavChar)){
                System.out.println(userFavChar +" is lowercase");
            }
        
            if (userFavChar == 'a' || userFavChar == 'e' || userFavChar == 'i' || userFavChar == 'o' || userFavChar == 'u' ||userFavChar == 'A' || userFavChar == 'E' || userFavChar == 'I' || userFavChar == 'O' || userFavChar == 'U'){
                System.out.println(userFavChar + " is a vowel");
            }
            else{
            System.out.println(userFavChar + " is not a vowel.");
            }
            System.out.print(userFavChar + " ASCII value is: ");
            System.out.println((int)userFavChar);
            userFavChar = Character.toUpperCase(userFavChar);
            if ((userFavChar >= 68 && userFavChar<=84)||(userFavChar>=88 && userFavChar<=90)||(userFavChar>=101 && userFavChar<=116)|| (userFavChar>=120 && userFavChar<=122)){
               System.out.println("Your favorite character is the " +(userFavChar - 'A' + 1)+"th letter of the alphabet");
               
            }
            if (userFavChar == 65 || userFavChar == 97 || userFavChar == 85 || userFavChar == 117)
            {
                System.out.println("Your favorite character is the " +(userFavChar - 'A' + 1)+"rst letter of the alphabet");
            }
            if (userFavChar == 66 || userFavChar == 98 || userFavChar == 86 || userFavChar == 118)
            {
                System.out.println("Your favorite character is the " +(userFavChar - 'A' + 1)+"nd letter of the alphabet");
            }
            if (userFavChar == 67 || userFavChar == 99 || userFavChar == 87 || userFavChar == 119)
            {
                System.out.println("Your favorite character is the " +(userFavChar - 'A' + 1)+"rd letter of the alphabet");
            }
        }
        
    }
    }
    
}

