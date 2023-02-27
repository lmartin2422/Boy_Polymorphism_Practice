public class Main {
    public static void main(String[] args) {

        // Creating an instance of the Boy class
        Boy boy = new Boy("Sam", 15);

        boy.buyItem("math book");
        boy.studying("math");
        System.out.println();

        System.out.println(boy.getName() + " is " + boy.getAge() + " years old");

        Boy boy2 = new Boy("aaron", 18);
        boy2.setName("Tim");
        boy2.setAge(22);

        System.out.println(boy2.getName() + " " + boy2.getAge());




    }
}