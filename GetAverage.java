import java.util.Scanner;

public class GetAverage {
    public static void main (String[] args) {
        findAverage();
    }
    private static void findAverage() {
        Scanner scanner = new Scanner(System.in);
        Float sumNumbers = 0f;
        for (int i = 1; i <= 3; i++) {
            sumNumbers += Float.parseFloat(scanner.nextLine());
        }

        Float averageNumber = sumNumbers/3.0f;
        System.out.println(String.format("%.2f", averageNumber));
    }
}
