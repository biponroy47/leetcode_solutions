class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pA = 0;
        int pB = numbers.length - 1;
        int nA = numbers[pA];
        int nB = numbers[pB];
        while(nA + nB != target){
            if(nA + nB > target){
                pB--;
                nB = numbers[pB];
            }
            if(nA + nB < target){
                pA++;
                nA = numbers[pA];
            }
        }
        return new int []{
pA + 1, pB + 1
};
    }
}