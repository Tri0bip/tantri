package mang;

import java.util.Scanner;

public class maxmin {

    public static int Max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int Min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap so luong mang: ");
        int so = nhap.nextInt();
        int[] num = new int[so];
        for (int i = 0; i < num.length; i++) {
            System.out.print("so thu " + (i + 1) + " la: ");
            num[i] = nhap.nextInt();
        }
        int max = Max(num);
        int min = Min(num);
        System.out.println("max là: " + max);
        System.out.println("min là: " + min);

    }
}
