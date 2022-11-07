import java.util.InputMismatchException;
import java.util.Scanner;

public class UsingTryCatch {
    public static void main(String[] args) {

        int num = 1;

        while(num == 1) {
            System.out.println("please enter a number between 0-9: ");
            Scanner myscan = new Scanner(System.in);
            try {

                int myNum = myscan.nextInt();

                if (myNum <= 9 && myNum >= 0) {
                    System.out.println("you entered " + myNum);
                    num = 0;
                } else {
                    System.out.println("invalid number");
                }

            } catch (InputMismatchException ime) {
                System.out.println("caused exception");
            }
        }


    }
}

