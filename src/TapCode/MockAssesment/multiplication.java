package TapCode.MockAssesment;

public class multiplication {


    int num = 100;

    public void calc(int num){

        num = num*10;
    }

    public void display(){

        System.out.println(num);
    }
    public static void main(String[] args) {

        multiplication s = new multiplication();
        s.calc(2);
        s.display();
    }
}
