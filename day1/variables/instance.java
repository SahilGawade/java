public class Instance{
     int i=10;     void show(){
         System.out.println("instance method");
         System.out.println("i="+i);
     }
     public static void main(String[] args) {
         System.out.println("main method");
         Instance s=new Instance();
         System.out.println("i="+s.i);
         s.show();
   }
