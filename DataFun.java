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
    }
}
