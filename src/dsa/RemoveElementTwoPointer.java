package dsa;

import org.junit.Test;

public class RemoveElementTwoPointer {
	
	@Test
	public  void test() {

		int nums[] = { 3, 2, 2, 3 };
		int val = 3;
		System.out.println(removeElement(nums, val));
	}

	public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        return i;
    }
	
}
