package desafio;

//Given an integer array nums, return true if any value appear
//at least twice in the array, and return false if every element is distinct.

import java.util.HashSet;
import java.util.Set;

public class ContemDuplicidade {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
    }
    static void main() {
        int[] nums = {1, 2, 3};
        ContemDuplicidade.containsDuplicate(nums);
    }



}
