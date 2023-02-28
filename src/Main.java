import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello, this is the lottery number generator!");
        System.out.println("I will generate 6 lottery numbers.");
        System.out.println("***********************************************");
        Random rand = new Random();
        int min = 1;
        int max = 49;
        int slots = 6;

        int []lotteryArray = new int[slots];
        boolean isRepeated;
        int randomNumber = 0;

        for( int indexDrawn = 0; indexDrawn <slots; indexDrawn++){
           do{
               isRepeated = false;
               randomNumber = rand.nextInt(max + 1 - min)+ min;
               for (int k =0; k<=indexDrawn; k++){
                   if (lotteryArray[k]==randomNumber){
                       isRepeated = true;
                       break;
                   }
               }
           } while(isRepeated);
           lotteryArray[indexDrawn]=randomNumber;
            }
        Arrays.sort(lotteryArray);
    System.out.println("This is results of the lottery");
        System.out.println("***********************************************");
            for ( int i = 0 ;i <slots; i++){
                System.out.println(lotteryArray[i] + " ");

        }System.out.println("***********************************************");
    }
}