package ss5_access_modifier_static.thuc_hanh;



public class Bai1StaticMethodTest {
    public static void main(String[] args) {
      Bai1StaticMethod.changer();
      Bai1StaticMethod staticMethod1=new Bai1StaticMethod(1,"PHUC1 ");
      Bai1StaticMethod staticMethod2=new Bai1StaticMethod(2,"Phuc2 ");
      Bai1StaticMethod staticMethod3=new Bai1StaticMethod(3,"Phuc3 ");
      staticMethod1.Display();
      staticMethod2.Display();
      staticMethod3.Display();


    }
}
