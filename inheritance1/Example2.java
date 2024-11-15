
class A {
    int a=10;
    void m1()
    {
        System.out.println("Inside m1()method"+a);
    }
}

class B extends A{
    float b=20;
    void m2()
    {
        System.out.println("Inside m2() method"+b);
    }   
}

class Example2 {
    public static void main(String[] args) {
        System.out.println("Start @ Cyber success");    
        B b1=new B();
        b1.m2();
        b1.m1();
        System.out.println("stop @ cyber success");
    }
    
}
