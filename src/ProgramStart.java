public class ProgramStart extends MenuOptions{
    ReadFromKeyboard read = new ReadFromKeyboard();

    public void printMenu(){
        System.out.println("Hello!\n" +
                "Please select an option:\n" +
                "1. Sum\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Divide\n" +
                "5. Mean\n" +
                "6. Rest\n" +
                "7. Robot\n" +
                "8. Java\n" +
                "9. ConvertIntoCelsius\n" +
                "10. ConvertIntoMeters\n" +
                "0. Exit\n"

        );
    }



    public boolean runMenuOption(){
        printMenu();
        int option = read.getInt();
        switch (option){
            case 0:
                System.out.println("Bye bye.");
                return false;
            case 1:
                doSum();
                return true;
            case 2:
                doSubtract();
                return true;
            case 3:
                doMultiply();
                return true;
            case 4:
                doDivide();
                return true;
            case 5:
                doMean();
                return true;
            case 6:
                doRest();
                return true;
            case 7:
                doRobot();
                return true;
            case 8:
                doJava();
                return true;
            case 9:
                doConvertIntoCelsius();
                return true;
            case 10:
                doConvertIntoMeters();
                return true;

            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public void runProgram(){
        boolean repeatProgram;
        do {
            repeatProgram = runMenuOption();
        }while (repeatProgram);
    }
}
