package Interface;

public class Iexam implements Dialogs {
    @Override
    public void getName() {
        System.out.println("inside Iexam");
    }

    @Override
    public void printClass() {
        System.out.println(this.getClass());
    }

    public static void main(String[] args) {
        Iexam ex = new Iexam();
        ex.getName();
        ex.printClass();
    }
}
