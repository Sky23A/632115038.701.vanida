//632115038 vanida gowan
class A {

}
class B extends A {

}
class C extends B {

}
public class InstanceOfDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Object c = new C();
        //Test the instan of object and class
        System.out.println(a instanceof A);
        System.out.println( b instanceof B);
        System.out.println(b instanceof A);
        System.out.println(a instanceof B);
        System.out.println(c instanceof C);
        System.out.println(c instanceof A);
        System.out.println( c instanceof B);
    }
}
