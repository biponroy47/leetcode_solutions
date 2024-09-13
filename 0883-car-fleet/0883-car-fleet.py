class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        pairs = [(p,s) for p, s in zip(position, speed)]
        pairs.sort(reverse=True)
        stack = []
        for p, s in pairs:
            cur = ((target - p)/s)
            stack.append(cur)
            if(len(stack) >= 2 and cur <= stack[-2]):
                stack.pop()
        return len(stack)

