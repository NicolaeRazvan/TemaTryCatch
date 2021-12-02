public class LogicalOp {
    //Cerita 6 try-catch
    private void wait(int seconds){
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

    //Cerinta 5
    public void doPositionInArray(int[] a, int i){
        try{
            System.out.println(a[i]);
        }
        catch(ArrayIndexOutOfBoundsException error){
            System.out.println("Inside catch, number too large");
        }
    }
}
