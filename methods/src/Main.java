public class Main{
    public static void main(String[] args){
        mymethod();//Inside main, call the myMethod() method:
        mymethod();
        Params("Peter", "Java", 2);
        Params("Peter", "Python", 2);


    }

    static void mymethod(){
        System.out.println("I am World, Hello World!");
    }
    static void Params(String name, String lang, int years){
        System.out.println("I am " + name + " and " + "I have a skillset of " +lang + " With " + years + " years of experience." );

    }


}
