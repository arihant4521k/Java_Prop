class demo1{
    private int a;
    void input(){
        a=10;
    }
    int get(){
        return a;
    }
}
public class program24 {
    public static void main(String[] args) {
        demo1 dd=new demo1();
        dd.input();
        System.out.println("Value Of A Is "+dd.get());

    }
}
