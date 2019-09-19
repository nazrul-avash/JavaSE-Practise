package OOP;

public class Geek {
    static int x =1;
     void myfun(int a){
        x+=a;
        x*=a;
    }
    public static void main(String[] args) {
        int array[] = new int[2];
        try {
            if(array[8]/0==5){}
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("array error");
        }
        catch (ArithmeticException ex){
            System.out.println("arithmetic error");
        }
        finally {
            System.out.println("4");
        }
    }
}
