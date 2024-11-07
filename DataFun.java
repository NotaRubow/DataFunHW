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
        Scanner fun = new Scanner(System.in);
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
        switch(userFavInt):
        case 2:
            System.out.println("The noble gas is Helium.")
            break;
        case 10:
            System.out.println("The noble gas is Neon.")
        case 18:
            System.out.println("The noble gas is Argon.")
        case 36:
            System.out.println("The noble gas is Krypton.")
        case 54:
            System.out.println("The noble gas is Xenon.")
        case 86:
            System.out.println("The noble gas is Radon.")
        case 118:
            System.out.println("The noble gas is Oganesson.")
        case _:
            System.out.println("This number is not the atomic number of a noble gas.")
    }
}
