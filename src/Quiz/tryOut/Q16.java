package Quiz.tryOut;

public class Q16 {
    public void tryOut() {
        A a = new A(7);
        System.out.println(a.x);
        A b = new A(a);
        System.out.println(a.x+b.x);

    }
    public  class A{
        int x;
        A(int x){
            this.x = x;
        }
        A(A p) {

            p.x = 13;
            x = 9;
          
        }
    }

    public static void main(String[] args) {
        new Q16().tryOut();
    }
}
