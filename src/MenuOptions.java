public class MenuOptions {
    Operatii op = new Operatii();
    Desene ds = new Desene();
    Conversii cn = new Conversii();
    ReadFromKeyboard read = new ReadFromKeyboard();
    public void doSum(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Suma este: "+
                op.sum(first, second));
    }

    public void doSubtract(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Scaderea este: "+
                op.substract(first, second));
    }

    public void doMultiply(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Inmultirea este: "+
                op.multiply(first,second));
    }

    public void doDivide(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Impartirea este: "+
                op.divide(first,second));
    }

    public void doMean(){
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        System.out.println("Media este: "+
                op.mean(first,second,third));
    }

    public void doRest(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Restul este: "+
                op.rest(first,second));
    }

   public void doRobot(){
       System.out.println(ds.robot());
   }

   public void doJava(){
       System.out.println(ds.java());
   }

   public void doConvertIntoCelsius(){
        int first = read.getInt();
       System.out.println("Conversia este: "+
               cn.grade(first));
   }

   public void doConvertIntoMeters(){
        int first = read.getInt();
       System.out.println("Distanta este: "+
               cn.distanta(first));
   }
}
