class a{
    int s=10;
    void sum(a o){
       
        o.s++;
        System.out.println(s);
    }
}

public class nw{
    public static void main(String[] args) {
        a obj=new a();
        obj.sum(obj);
    }

}