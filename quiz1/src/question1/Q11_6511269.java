package question1;

public class Q11_6511269 {
	public static boolean haveFour(int[] nums) {
		int count4 = 0;
        if (nums.length < 4) {
            return false;
        } else {
            if (nums[0] == 4 && nums[1] != 4) {
                count4++;
            }
            if (nums[nums.length - 1] == 4 && nums[nums.length - 2] != 4) {
                count4++;
            }
            for (int i = 1; i < nums.length-1; i++) {
                if (nums[i] == 4 && nums[i - 1] != 4 && nums[i + 1] != 4) {
                    count4++;
                }
            }
        }
        if (count4 == 4) {
            return true;
        }
        return false;
	}
	public static void main(String[] args){
	
		int[] arr1 = {4};
		int[] arr2 = {1,2,3,4};
		int[] arr3 = {94,5,4,9,4,4};
		int[] arr4 = {9,100,4,9,4,100,4,2,4,10};
		int[] arr5 = {100,4,9,4,100,4,2,4,10,4};
		int[] arr6 = {4,3,4,9,4,8,9,10,100,9,7,4}; 
		int[] arr7 = {4,2,4,99,3,4,2,1,9,100,8,7,4,3,2}; 
		int[] a = {1,4,9,4,9};
		int[] b = {4,9,4,9,1,4,1,1,4};
		int[] c = {1,4,4,3,9,4,5,4,10};
		
		System.out.println(haveFour(arr1)); // false 
		System.out.println(haveFour(arr2)); // false 
		System.out.println(haveFour(arr3)); // false 
		System.out.println(haveFour(arr4)); // true 
		System.out.println(haveFour(arr5)); // false 
		System.out.println(haveFour(arr6)); // true 
		System.out.println(haveFour(arr7)); // true
		System.out.println(haveFour(a));
		System.out.println(haveFour(b));
		System.out.println(haveFour(c));
		

	}
}
