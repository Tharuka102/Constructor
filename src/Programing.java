public class Programing {

    String name;

    Programing(){
        System.out.println("coumstructor called;");
        name = "programmer";

    }
    public static void main(String[] args) {
        Programing gawesh = new Programing();
        System.out.println("Name is -"+gawesh.name);

    }
}