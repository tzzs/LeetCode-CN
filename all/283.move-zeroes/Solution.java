// class Solution {
//     public void moveZeroes(int[] nums) {
//         int n = nums.length, count = 0;

//         for (int i : nums) {
//             if (i == 0) {
//                 count++;
//             }
//         }

//         int i = 0, j = n - 1;
//         for (; i < n && j >= 0;) {
//             while (i < n && nums[i] != 0) {
//                 i++;
//             }
//             while (j >= 0 && nums[j] == 0) {
//                 j--;
//             }
//             if (nums[i] == 0) {
//                 int tmp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = tmp;
//             }
//             i++;
//         }
//     }
// }
// class Solution {
//     public void moveZeroes(int[] nums) {
//         int n = nums.length;

//         int i = j = 0;

//         while (i < n && j < n) {
//             while (nums[i] != 0) {
//                 i++;
//             }
//             while (nums[j] == 0) {
//                 j++;
//             }

//             if (i < n && j < n) {
//                 int tmp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = tmp;
//             }
//         }
//     }
// }

// 上面的方法均不可用

class Solution {
    public void moveZeroes(int[] nums) {
        // 旋转数组
        int n = nums.length;
        int i = 0, count = 0;
        while (i < n - count) {
            while (i < n - count && nums[i] != 0) {
                i++;
            }

            if (i == n - count) {
                break;
            }

            revertMain(nums, i, n - count - 1);
            count++;
            i = 0;
        }
    }

    public void revertMain(int[] nums, int left, int right) {
        int tmp = nums[left];
        for (int i = left; i < right; i++) {
            nums[i] = nums[i + 1];
        }
        nums[right] = tmp;
    }
}
