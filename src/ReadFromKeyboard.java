import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
//Cerinta 1 try-catch
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
    //Cerinta 2 try-catch

    public float getFloat() {
        int count = 0;
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("Introdu un numar: ");
                return scan.nextFloat();
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

    public double getDouble() {
        int count = 0;
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("Introdu un numar: ");
                return scan.nextDouble();
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

    //Cerinta 3 try-catch
    public int[] getArray(int size){
        int[] myArr = new int[size];
        System.out.println("Introdu valorile din array.");
        for (int i = 0; i < myArr.length; i++){
            myArr[i] = getInt();
        }
        return myArr;
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

    public List<Integer> doInsertAList() {
        Scanner scan = new Scanner(System.in);
        List<Integer> myList = new ArrayList<>();
        try {
            System.out.print("Insert your list:");
            do {
                System.out.print("Insert a number: ");
                myList.add(scan.nextInt());
            } while (true);
        }
        catch (InputMismatchException error) {
            System.out.println("Error.");
            return myList;
        }
    }




}
