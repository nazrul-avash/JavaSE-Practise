package Quiz.tryOut;

public class Q15 {
    public static void main(String[] args) {
    try {
        int array[] = new int[4];
        array[8] = 40/0; //assignments operators'(=, +=, -+, /=, *=, |=) associativity is from righ to left.
        System.out.println("1");
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("2");
    }
    catch (ArithmeticException e) {
        System.out.println("3");
    }

    finally {
        System.out.println("4");
    }
    }

}
