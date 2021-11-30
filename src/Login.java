import java.util.Scanner;
public class Login {
    public boolean isLoggedIn(){
        Scanner scan = new Scanner(System.in);
        String username = "Razvan";
        String password = "parola11";

        String givenUsername = scan.next();
        String givenPassword = scan.next();

        if (username.equals(givenUsername) && password.equals(givenPassword)){
            System.out.println("Success");
            return true;
        }else {
            System.out.println("Not success");
            return false;

        }
    }

    public boolean loginSuccessful(){
        boolean repeat;
        int count = 0;
        do {
            repeat = isLoggedIn();
            count++;
        }while (!repeat && count <=3);
        return repeat;
    }
}
