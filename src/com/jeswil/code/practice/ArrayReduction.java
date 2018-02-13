package com.jeswil.code.practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReduction {
    static int reductionCost(int[] num) {

        Arrays.parallelSort(num);

        if(num.length == 0)
            return 0;
        else if(num.length == 1)
            return num[0];
        else if(num.length == 2)
            return (num[0]+num[1]);
        else
        {
            int sum = num[0] + num[1];
            num[1] = sum;   //Reassigning the second element with the sum of all the elements
            num = Arrays.copyOfRange(num,1,num.length);

            return reductionCost(num) + sum;
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        //final String fileName = System.getenv("OUTPUT_PATH");
        String fileName = null;
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        int num_size = 0;
        num_size = Integer.parseInt(in.nextLine().trim());

        int[] num = new int[num_size];
        for(int i = 0; i < num_size; i++) {
            int num_item;
            num_item = Integer.parseInt(in.nextLine().trim());
            num[i] = num_item;
        }

        res = reductionCost(num);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}
