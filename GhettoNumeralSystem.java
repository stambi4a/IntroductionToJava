import java.util.Scanner;

public class GhettoNumeralSystem {
    public static void main (String[] args) {
        convertNumberToGhettoNumeral();
    }

    private static String[] createTranslateTable()
    {
        String[] ghettoDigits = new String[10];
        ghettoDigits[0] = "Gee";
        ghettoDigits[1] = "Bro";
        ghettoDigits[2] = "Zuz";
        ghettoDigits[3] = "Ma";
        ghettoDigits[4] = "Duh";
        ghettoDigits[5] = "Yo";
        ghettoDigits[6] = "Dis";
        ghettoDigits[7] = "Hood";
        ghettoDigits[8] = "Jam";
        ghettoDigits[9] = "Mack";

        return ghettoDigits;
    }

    private static void convertNumberToGhettoNumeral()
    {
        Scanner scanner = new Scanner(System.in);
        int normalNumber = scanner.nextInt();
        int digits = 0;
        int copiedNumber = normalNumber;
        while(copiedNumber > 0) {
            copiedNumber /= 10;
            digits++;
        }
        String[] ghettoNumbers = createTranslateTable();
        String[] ghettoDigitsArray = new String[digits];
        StringBuilder reversedGhettoNumber = new StringBuilder();
        for(int index = 0; index < digits; index++)
        {
            ghettoDigitsArray[digits - 1 - index] = ghettoNumbers[normalNumber % 10];
            normalNumber /= 10;
        }

        for(int i = 0; i < digits; i++)
        {
            reversedGhettoNumber.append(ghettoDigitsArray[i]);
        }

        System.out.println(reversedGhettoNumber);
    }
}
