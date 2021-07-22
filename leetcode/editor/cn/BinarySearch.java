//给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否
//则返回 -1。 
//
// 
//示例 1: 
//
// 输入: nums = [-1,0,3,5,9,12], target = 9
//输出: 4
//解释: 9 出现在 nums 中并且下标为 4
// 
//
// 示例 2: 
//
// 输入: nums = [-1,0,3,5,9,12], target = 2
//输出: -1
//解释: 2 不存在 nums 中因此返回 -1
// 
//
// 
//
// 提示： 
//
// 
// 你可以假设 nums 中的所有元素是不重复的。 
// n 将在 [1, 10000]之间。 
// nums 的每个元素都将在 [-9999, 9999]之间。 
// 
// Related Topics 数组 二分查找 
// 👍 278 👎 0

//Java：二分查找
public class BinarySearch{
    public static void main(String[] args) {
        Solution solution = new BinarySearch().new Solution();
        // TO TEST
        int[] nums = {-1,0,3,5,9,12};
        solution.search(nums,9);
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        while (left <= right){//判断左右两个指针重合了，即数组内的所有数字都过了一遍
            middle = left + (right - left)/2;//这里不合并写减法是为了避免middle溢出
            if (nums[middle] == target){
                return middle;//找到，则返回下标
            }
            if (nums[middle] < target){//因为数组是升序，说明该数在右边，改变left
                left = middle + 1;
            }else{//因为数组是升序，说明该数在左边，改变right
                right = middle -1;
            }
        }
        return -1;//当不存在时返回-1
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}