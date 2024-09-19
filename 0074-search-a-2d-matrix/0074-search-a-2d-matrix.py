class Solution(object):
    def searchMatrix(self, matrix, target):
        top = 0
        bottom = len(matrix) - 1
        outer_mid = 0
        while top <= bottom:
            mid = top + ((bottom - top) // 2)
            outer_mid = mid
            print(top, bottom, outer_mid, matrix[outer_mid][0])
            if matrix[mid][0] > target:
                bottom = mid - 1
            elif matrix[mid][0] < target:
                if len(matrix[mid]) > 1 and matrix[mid][-1] >= target:
                    break;
                else:
                    top = mid + 1
            else:
                return True

        left = 0
        right = len(matrix[0]) - 1
        
        while left <= right:
            center = left + ((right - left) // 2)
            if target < matrix[outer_mid][center]:
                right = center - 1
            elif target > matrix[outer_mid][center]:
                left = center + 1
            else:
                return True

        return False