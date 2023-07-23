package TapCode.PlayGround;


class Parent {

    public Parent() {

        System.out.println("Parent Constructor");

    }

}



class Child extends Parent {

    public Child() {

        System.out.println("Child Constructor");

    }

}


public class Strings {
    public static void main(String[] args) {

        Child st = new Child();
        String s = "    hello buddy    good    ";
        System.out.println(s);
        System.out.println(s.trim());
    }
}
