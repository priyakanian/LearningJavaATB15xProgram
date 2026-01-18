package ex_01_Java_Basics;

public class max_age {

    public static void main(String[] args) {

        int n1 = 11;

        int n2 = 9;

        int n3 = 21;

        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 >n3) ? n2 : n3;

        System.out.println(max);

    }

}

