 public class Static{
     static int i=10;
     public void show(){
         System.out.println("static method:"+i);
}
     public static void main(String[] args) {
         System.out.println("main method");
         Static s=new Static();
         s.i=50;
         s.show();
     }
 }
