class Solution(object):
    def largestRectangleArea(self, heights):
        out = 0
        stack = []
        for i, h in enumerate(heights):
            start = i
            while stack and stack[-1][1] > h:
                index, height = stack.pop()
                out = max(out, height * (i - index))
                start = index
            stack.append((start, h))

        for i, h in stack:
            out = max(out, h * (len(heights) - i))
        return out