class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        stack = []
        out = [0] * len(temperatures)

        for i, temp in enumerate(temperatures):
            if not stack or temp <= stack[-1][0]:
                stack.append((temp, i))
            else:
                while stack and stack[-1][0] < temp:
                    index = stack[-1][1]
                    out[index] = i - index
                    stack.pop()
                stack.append((temp, i))

        return out

        