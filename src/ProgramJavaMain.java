public class ProgramJavaMain {

    public static void main(String[] args) {
        ProgramStart ps = new ProgramStart();
        Login login = new Login();
        if (login.loginSuccessful()) {
            ps.runProgram();
        }
    }
}
