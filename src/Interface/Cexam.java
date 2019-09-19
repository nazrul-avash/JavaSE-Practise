package Interface;

public class Cexam implements Dialogs {
    @Override
    public void getName() {
        System.out.println("inside Cexam");
    }

    @Override
    public void printClass() {
        System.out.println(this.getClass());
    }
}
