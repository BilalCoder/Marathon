package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[4][7];
        String[] names = {"David", "Charles", "Antony", "Leo"};
        double[] sum = new double[4];
        double[] avg = new double[7];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextDouble();
                sum[i] = sum[i] + arr[i][j];
            }
            //avg[i] = sum[i]/7;
        }
        double sumAvg = 0;
        for (int i = 0; i < 7; i++) {
            sumAvg = 0;
            for (int j = 0; j < 4; j++) {
                sumAvg = sumAvg+arr[j][i];
            }
            avg[i] = sumAvg/4;
        }

        for(int i=0; i<4; i++){
            System.out.println(names[i]+" "+String.format("%.0f", sum[i])+" kms");
        }
        for(int i=0; i<7; i++){
            System.out.println("Day"+(i+1)+":"+String.format("%.2f", avg[i])+" kms");
        }
    }
}
