//Demonstrating use of static classes that will yun on the Main class
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);

            //Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j);
            }
        }
        foreachLoop();
        breakStatement();
        continueStatement();
        WhileBreak();
        WhileContinue();

    }

    public static void foreachLoop() { //Using static keyword make this a static method that will run when called in the main class
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String k : cars) {
            System.out.println(k);

        }
    }

    public static void breakStatement() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }

    public static void continueStatement() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void WhileBreak() {
        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
            if (a == 4){
                break;
            }

        }

    }
    public static void WhileContinue(){
        int o = 0;
        while(o < 10){
            if(o == 4){
                o++;
                continue;
            }
            System.out.println(o);
            o++;
        }
    }
}