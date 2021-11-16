package com.company;

public class FirstAndLastPosition {


    public static void main(String[] args) {
        int[] ans = {-1, -1};
        int []nums ={1,2,3,4,5,6,7,8,8,8,8,9};
        int target =8;
        // check for first occurrence if target first
        findFandL(nums,target);
      /*  ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }*/
    }



    // this function just returns the index value of target
    public static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid =(start+end)/2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        System.out.println(ans);
        return ans;
    }

    public static void findFandL(int arr[],int target){
        for (int i=0; i<arr.length;i++){
            if (arr[i]==target)
            {
                System.out.println(i);
                break;
            }
        }
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]==target) {
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}