import java.util.Scanner;

public class PrintACharacterTriangle {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int triangleBase = scanner.nextInt();
        for(int i = 0; i < triangleBase; i++){
            for(char ch = 'a'; ch <= 'a' + i; ch++){
                System.out.print(ch + " ");
            }

            System.out.println();
        }

        for(int i = triangleBase - 2 ; i >= 0 ; i--){
            for(char ch = 'a'; ch <= 'a' + i; ch++){
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
