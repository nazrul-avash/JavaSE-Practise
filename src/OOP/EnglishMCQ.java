package OOP;

public class EnglishMCQ extends EnglishExam {
    public void callTHat(EnglishMCQ exm){
        exm.print();



    }
    public void print(){
        System.out.println("This is: "+this.getClass());
    }
    public void doSome(){
        System.out.println("i am called!");
    }

    public static void main(String[] args) {
        exam ex = new EnglishExam();
        EnglishMCQ em = new EnglishMCQ();

    }
}
