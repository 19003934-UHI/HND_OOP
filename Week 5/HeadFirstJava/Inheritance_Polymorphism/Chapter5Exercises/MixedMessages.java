package HeadFirstJava.Inheritance_Polymorphism.Chapter5Exercises;

public class MixedMessages 
{
    public static void main(String[] args)
    {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        a.m1();
        b.m2();
        c.m3();
    }



}

class A 
{
    int ivar = 7;
    void m1()
    {
        System.out.println("A's m1, ");
    }

    void m2()
    {
        System.out.println("A's m2, ");
    }

    void m3()
    {
        System.out.println("A's m3, ");
    }
}

class B extends A
{
    void m1()
    {
        System.out.println("B's m1, ");
    }
}

class C extends B
{
    void m3()
    {
        System.out.println("C's m3, " + (ivar + 6));
    }
}
