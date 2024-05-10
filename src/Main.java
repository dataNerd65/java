import com.kkiarie.mypackage.Sasii;
public class Main {
    public static void main(String[] args) {
        Main mainInstance = new Main(); //creating an instance of the main class
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i);

            //Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner: " + j);
            }
        }
        mainInstance.foreachLoop();
        mainInstance.breakStatement();
        mainInstance.continueStatement();
        mainInstance.WhileBreak();
        mainInstance.WhileContinue();
        mainInstance.ArrayLearning();
        System.out.println("Before creating Sasii instance");
        Sasii sasiiInstance = new Sasii();
        sasiiInstance.printMessage();
        System.out.println("After creating Sasii instance");

    }

    public void foreachLoop() { //removing static keyword make this a non-static method
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String k : cars) {
            System.out.println(k);

        }
    }

    public void breakStatement() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }

    public void continueStatement() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }

    public void WhileBreak() {
        int a = 0;
        while (a < 10) {
            System.out.println(a);
            a++;
            if (a == 4){
                break;
            }

        }

    }
    public void WhileContinue(){
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
    public void ArrayLearning(){
        String[] cars = {"Volvo", "Lambo", "Suzuki", "BMW","Alto"};
        cars[0] ="Opel";
        System.out.println(cars[0]);
        System.out.println(cars.length);
    }
}
