class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        stack = []
        out = []

        def find(open, close):
            if open == close == n:
                out.append(''.join(stack))
                return

            if open < n:
                stack.append('(')
                find(open + 1, close)
                stack.pop()

            if close < open:
                stack.append(')')
                find(open, close + 1)
                stack.pop()

        find(0,0)
        return out