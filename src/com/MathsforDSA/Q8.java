package com.MathsforDSA;
// find ig the numbers are repating odd time in array and find the unique numbers
public class Q8 {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2};
        System.out.println(singleNumber(arr));
    }
    static int singleNumber(int[] nums) {
        int[] bitCount = new int[32];

        // Count the number of 1s for each bit position
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                bitCount[i] += (num >> i) & 1;
            }
        }
        int result = 0;
        for (int i = 0; i < 32; i++) {
            // Take modulo 3 of each bit count to get the bit of the single number
            if (bitCount[i] % 3 != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }
}
