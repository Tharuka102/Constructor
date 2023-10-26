public class sum {
     int i;
     int j;


    sum(){
        i =10;
        j =30;
        System.out.println("counstructer");


    }
    public static void main(String[] args) {
        sum s =new sum();
        System.out.println("value of :"+ (s.i+s.j ));


    }
}
