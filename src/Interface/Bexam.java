package Interface;

public class Bexam implements Adialogs {
    @Override
    public void getName() {
        System.out.println("inside Bexam");
    }

    @Override
    public void printClass() {
        System.out.println(this.getClass());
    }

    @Override
    public void getAge() {
        System.out.println("age is 68");
    }
    public void sayHello(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Bexam ex = new Bexam();
        ex.getName();
        ex.printClass();
        ex.getAge();
    }
}
