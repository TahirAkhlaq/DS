package com.company;

public class BinarySearch {
    public static int searchInsert(int[] nums, int target) {
        int low=0;
        int high= nums.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if (target>nums[mid]){
                low=mid+1;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }else{
                return mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {

/*int[] arr={1,3,5,6};
int data= 5;
    int low=0;
    int fi=-1;
    int high= arr.length-1;
    while(low<=high){
        int mid =(low+high)/2;
        if (data>arr[mid]){
            low=mid+1;
        }
        else if(data<arr[mid]){
            high=mid-1;
        }else{
             fi =mid;
            high= mid-1;

        }
    }
        System.out.println(fi);

         low=0;
         int li=-1;
         high= arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if (data>arr[mid]){
                low=mid+1;
            }
            else if(data<arr[mid]){
                high=mid-1;
            }else{
                li =mid;
                low= mid+1;
            }
        }
        System.out.println(li);
    }*/
    }
    }

