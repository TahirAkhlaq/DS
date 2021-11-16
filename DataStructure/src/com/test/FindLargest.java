package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindLargest {
    public static void main(String[] args) {
        int arr[] = {2, 2, 3, 2, 3, 4, 1, 3, 9, 2, 2};
       // System.out.println(findLargest(arr));
        findUsingSet();
    }

    public static int findLargestOne(int a[]) {
        Arrays.sort(a);
        return a[a.length - 3];
       /* for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != a[a.length - 1]) {
                System.out.printf("The second largest " + a[i]);
                return;
            }
        }*/
    }

    public static int findLargest(int[] a) {
        int max = 0;
        int second=0;
        int third=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                third = max;
                second=third;
                max = a[i];
            }
           else if (a[i] > second) {
                third= second;
                second=a[i];
            }
           else if(a[i]>third){
               third=a[i];
            }
        }

        System.out.println("First:: "+max+"Second:: "+second+"third:: "+third);
        return third;
    }

    public static void findUsingSet(){
        int[] l={1,2,5,8,2,9,6,4,7,3};
        TreeSet<Integer> s = new TreeSet();
        for (int i:l){
            s.add(i);
        }
        s.remove(s.last());
        System.out.println(s.last());
    }
}
