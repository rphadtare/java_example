package org.example;

public class ArrayExample {

    public static void main(String[] args) {
        System.out.println("Hello after long time!!");
        show();
        int[] a = {1,2,5};

        Main m = new Main();

        System.out.println("Result of array : " + m.arr_add(a));
        m.pooja_pyramid(4);
    }

    public static void show(){
        int v1 = 1;
        int v2 = 2;

        System.out.println("Result : " + (v1+v2));

    }

}
