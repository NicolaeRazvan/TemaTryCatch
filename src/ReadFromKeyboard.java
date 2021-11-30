import java.util.InputMismatchException;
import java.util.Scanner;
public class ReadFromKeyboard {
    public int getInt() {
        int count = 0;
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("Introdu un numar: ");
                return scan.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Incorrect value!");
                count++;
            }
            if (count == 5){
                sleep(5);
                count = 0;
            }
        } while (true);
    }

    private void sleep(int seconds){
        System.out.print("Sleeping for: " );
        do {
            System.out.println(seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seconds --;
        }while (seconds > 0);

    }

    public int[] getArray(int size){
        int[] myArr = new int[size];
        System.out.println("Introdu valorile din array.");
        for (int i = 0; i < myArr.length; i++){
            myArr[i] = getInt();
        }
        return myArr;
    }

}
