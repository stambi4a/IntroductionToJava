import java.util.Scanner;

public class SumNumbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lastNumber = scanner.nextInt();
        Long numberSum = 0L;
        for(int i = 1; i < lastNumber; i++)
        {
            numberSum += i;
        }

         //Changes for github
        System.out.println(numberSum);
    }
}
