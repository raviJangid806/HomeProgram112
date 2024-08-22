package Recursion;

import java.util.Scanner;

public class RecursionMainClass {

    public static void counting(int a){
        if(a==0){
            return;
        }
        System.out.println(a);
        counting(a-1);

    }
    public static  int factorial(int a) {
        if(a==1){
            return 1;
        }
        return(a*factorial(a-1));
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static int sumArray(int[] arr, int index) {
        if (index < 0) {
            return 0;
        } else {
            return arr[index] + sumArray(arr, index - 1);
        }
    }
    public static String reverseString(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            return reverseString(s.substring(1)) + s.charAt(0);
        }
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    public static int arrayLength(int[] arr, int index) {
        if (index < 0) {
            return 0;
        } else {
            return 1 + arrayLength(arr, index - 1);
        }
    }


    public static void main(String[] args) {

      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        //counting(a);


// factorial
        int ans = factorial(a);
        System.out.println(ans);*/


//fibonacci
      //  System.out.println(fibonacci(6));


        int[] arr = {1, 2, 3, 4};
        System.out.println(sumArray(arr, arr.length - 1));



    }




}

