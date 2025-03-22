package FinalKeyword;

public class Final {
    final int a; 

    Final(int value) {
        this.a = value; 
    }
         void show() {
        System.out.println("Final Method");
    }
    public static void main(String[] args) {
        Final f = new Final(5);
        f.show();    
}
}

class childFinal extends Final {
    childFinal(int value) {
        super(value);
    }
    void show() {
        System.out.println("Final Method");
    }
}
