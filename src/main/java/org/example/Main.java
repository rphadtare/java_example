package org.example;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press ⌥⏎ with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press ⌃R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press ⌃D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing ⌘F8.
            System.out.println("i = " + i);
        }
    }
    
    public int arr_add(int[] arr){
        int result = 0;

        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public void pooja_pyramid(int height){
        if(height > 0){
            for(int i=0;i<height;i++){
                int space=height-i;
                int star_val=1;
                if(i>0){
                    star_val = (2*i+1);
                }
                while(space >0){
                    System.out.print(" ");
                    space=space-1;
                }
                while(star_val>0){
                    System.out.print("*");
                    star_val=star_val-1;
                }
                System.out.println("");
            }

            for(int i=height-2;i>=0;i--){
                int space=height-i;
                int star_val = (2*i+1);
                if(i == 0){
                    star_val=1;
                }
                while(space >0){
                    System.out.print(" ");
                    space=space-1;
                }
                while(star_val>0){
                    System.out.print("*");
                    star_val=star_val-1;
                }
                System.out.println("");
            }

        } else {
            System.out.println("Given height is not appropriate !!");
        }
    }


}