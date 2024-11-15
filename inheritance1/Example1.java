class Parent{
    int a=10;
}
class Child extends Parent{
    float b=20;
}

class Example1 {
    public static void main(String[] args) {
        System.out.println("start");    
        //parent
        Parent P1 = new Parent();
        Child C1 = new Child();
        System.out.println(P1.a);
        //system.out.print(p1.b);
        //child
        System.out.println(C1.b);
        System.out.println(P1.a);
        System.out.println("Stop");
    }
}