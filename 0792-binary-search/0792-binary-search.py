class Solution(object):
    def search(self, nums, target):
        left = 0
        right = len(nums) - 1

        while left <= right:
            mid = left + ((right - left) // 2)
            print(mid, nums[mid])
            if nums[mid] < target:
                left = mid + 1
            elif nums[mid] > target:
                right = mid - 1
            else:
                return mid

        return -1

