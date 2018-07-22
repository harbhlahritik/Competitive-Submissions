package com.hritik;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static int[] sort(int [] array){
        int front_pointer = 0;
        int rear_pointer = array.length - 1;
        int [] ans = new int [array.length];
        for(int i = 0;i < array.length;i++){
            if(array[i] == 0){
                ans[front_pointer] = 0;
                front_pointer++;
            } else if (array[i] == 2){
                ans[rear_pointer] = 2;
                rear_pointer--;
            } else {
                continue;
            }
        }
        for(int i = front_pointer;i <= rear_pointer;i++){
            ans[i] = 1;
        }
        return ans;
    }

    public static void print_array(int [] array){
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T > 0){
            int N = s.nextInt();
            int [] array = new int [N];
            for(int i = 0;i < N;i++){
                array[i] = s.nextInt();
            }
            array = sort(array);
            print_array(array);
            T--;
        }
    }
}