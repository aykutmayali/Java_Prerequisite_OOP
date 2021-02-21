package com.pack;

public class twosum {
    private static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];

        for (int i=0; i< nums.length-1; i++){
            for(int j=1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    result = new int[]{nums[i], nums[j]};
                } else {
                    System.out.println(i+" "+j+" attempt");
                }

            }
        }


        return result;
    }



    public static void main(String[] args){
        int[] nums = {6,15,11,4};
        int target = 9;

        int[] res = new int[2];
        res = twoSum(nums, target);
        System.out.println("1.element is "+res[0]+ " 2.element is "+ res[1]);
    }


}
