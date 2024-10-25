interface Abn {
    void show();
}



//Lambda expression allow us to write code freely without the boilerplat
// as show below when ever object is created a another .java file creats but in below case we used lambda expression
// so that we saved memory

public class Lembda {
    public static void main(String[] strgs){
        Abn obj;
        obj = () -> System.out.println("Hi Nagesh");
        obj.show();
    }

}

