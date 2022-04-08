package ss5_access_modifier_static.thuc_hanh;



public class StaticMethodTest {
    public static void main(String[] args) {
      StaticMethod.changer();
      StaticMethod staticMethod1=new StaticMethod(1,"PHUC1 ");
      StaticMethod staticMethod2=new StaticMethod(2,"Phuc2 ");
      StaticMethod staticMethod3=new StaticMethod(3,"Phuc3 ");
      staticMethod1.Display();
      staticMethod2.Display();
      staticMethod3.Display();


    }
}
