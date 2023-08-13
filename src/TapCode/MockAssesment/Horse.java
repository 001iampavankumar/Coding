package TapCode.MockAssesment;

class mammal{

    void eat(mammal m){
        System.out.println("mammal");
    }
}

class cattle extends mammal{

    void eat(cattle c){

        System.out.println("cttel");
    }
}

class donkey extends cattle{

    void eat(donkey k){
        System.out.println("donk"
        );
    }
}

public class Horse {


    public static void main(String[] args) {

    int[] arr = new int[10];
    for(int i = 0;i<10;i++){

        arr[i] = i/2;
        arr[i]++;
        System.out.println(arr[i]+" ");
        i++;
    }
    }
}
