package com.Array;

import java.util.Scanner;

public class Sorting {

    public static int[] getIntegers(int x)
    {
        int [] arr = new int[x];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the number "+x+" to enter int the array"+"\r");
        for(int i=0;i<x;i++)
        {
            arr[i]=scanner.nextInt();
        }

        return arr;

    }

    public static int[] sortArray(int [] myArray)
    {
        int[] sortedValue = new int[myArray.length];
        int a;
        for(int i=0;i<myArray.length;i++)
        {
            for (int j=i+1;j<myArray.length;j++)
            {
                if(myArray[i]<myArray[j])
                {
                    a = myArray[i];
                    myArray[i]=myArray[j];
                    myArray[j]=a;
                }
            }
        }

        sortedValue = myArray;

        return sortedValue;
    }

    public static void printArray(int[] myArray)
    {
        System.out.println("The output of the array is -");
        for (int i=0;i<myArray.length;i++)
        {
            System.out.println(myArray[i]+"\r");
        }
    }

    public static void main(String args[])
    {
//            Sorting sort = new Sorting();
//            int[] myArray = getIntegers(5);
//            sortArray(myArray);
//            printArray(myArray);

            int [] arr = new int[5];

        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+"\r");
        }
       
    }
}
