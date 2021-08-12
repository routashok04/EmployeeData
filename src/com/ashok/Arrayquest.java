package com.ashok;

public class Arrayquest  {
    public static void main(String[] args) {
      try {
          Object[] nums = new String[5];

          nums[0] = "56";
          nums[1] = 56;
          System.out.println(nums[0] == nums[1]);
      } catch (ArrayStoreException e) {
        //  e.printStackTrace();
          System.out.println("Exception Occur due to arraystore");
      }
    }
}
