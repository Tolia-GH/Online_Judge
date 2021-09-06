class Solution {
public:
	int binarySearch(vector<int>& nums, int target) {
		int left = 0, right = nums.size() - 1;
		while (left < right) {
			int mid = (left + right) / 2;
			int valueMid = nums[mid];
			if (valueMid == target) {
				return mid;
			}
			else if (valueMid > target) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
		}
		return -1;
	}
};