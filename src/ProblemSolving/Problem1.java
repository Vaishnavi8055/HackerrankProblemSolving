package ProblemSolving;

//https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long minSum=0;
        long maxSum=0;
        for(int i=0;i<4;i++){
            minSum=minSum+arr[i];
        }
        for(int i=1;i<arr.length;i++){
            maxSum=maxSum+arr[i];
        }
        System.out.println(minSum+" "+maxSum);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        Problem1.miniMaxSum(arr);
    }
}
