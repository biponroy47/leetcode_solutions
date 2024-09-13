class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = []
        out = [0] * len(temperatures)
        for i, temp in enumerate(temperatures):
            while stack and temp > stack[-1][0]:
                prevTemp, prevIndex = stack.pop()
                out[prevIndex] = i - prevIndex
            stack.append((temp, i))
        return out