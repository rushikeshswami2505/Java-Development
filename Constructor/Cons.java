package Constructor.ConsPackage;
class A{
    A(){
        System.out.println("A is called");
    }

    A(int a){
        System.out.println("A is called "+a);
    }
}
class B extends A{
    B(){
        System.out.println("B is called");
    }
    B(int b){
        super(b--);
        System.out.println("B is called "+b);
    }
}
class C extends	B{
    C(){
        System.out.println("C is called");
    }

    C(int c){
        super(c--);
        System.out.println("C is called "+c);
    }
}
public class Cons {
    public static void main(String[] args) {    
        // C c1 = new C();
        C c2 = new C(2);
    }
}