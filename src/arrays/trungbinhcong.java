package arrays;

import java.util.Scanner;

public class trungbinhcong {

    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("nhap so luong mang ");
        int so = nhap.nextInt();
        int[] num = new int[so];
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.print("Nhap so thu " + (i + 1) + "' la : ");
            num[i] = nhap.nextInt();
            sum += num[i];

        }
        double average = (double) sum / so;
        System.out.print("average : " + average);
        

    }
}

    
    

