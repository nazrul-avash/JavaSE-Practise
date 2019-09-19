/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author nazrul
 */
public   class PlayingWithInterface implements InterfaceA,interfaceB{
     @Override
   public  void go(){
         System.out.println("overRiden method from A");
     }
     @Override
   public void go(int x){
         System.out.println("go method with different signature"+x);
   
   }
     @Override
   public String go(int x, String str){
       System.out.println("go method with different signature and return type");
       return x+str;
   
   
   }
   private void go(String s){
       System.out.println("this is the own overloading of the "+this.getClass());
   }

    @Override
    public int go(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     @Override
    public void go(String x,int y){
         System.out.println("");
     }
    private static float go (int x, String y,int z){
        return 2.3f;
    }
   
   
}
