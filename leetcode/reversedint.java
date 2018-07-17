package com.hritik;

import java.util.Scanner;

class solution {

    public static int reverse(int x) {
        int reversedInt = 0;
        boolean negative = false;
        if(x > -10 && x < 10){
            return x;
        }
        if(x < 0){
            negative = true;
        }
        while(x!=0){
            reversedInt = reversedInt*10 + x%10;
            x = x / 10;
            if(x < 10 && negative==false){
                break;
            } else if (x > -10 && negative==true){
                break;
            }
        }
        if(reversedInt > 214748364 || reversedInt < -214748364){
            return 0;
        } else {
            reversedInt = reversedInt*10 + x%10;
        }
        return reversedInt;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println(reverse(x));
    }

}
