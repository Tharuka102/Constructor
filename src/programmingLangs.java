public class programmingLangs {
    String languages;

    programmingLangs(){
        this.languages ="JAVA";

    }

    public void getname(){
        System.out.println("Programming Language "+this.languages);

    }

    public static void main(String[] args) {
        programmingLangs pl =new programmingLangs();
        programmingLangs pl1 =new programmingLangs ( );
        pl.getname();
        pl1.getname();

    }
}
