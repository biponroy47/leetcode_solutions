class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pA = 0;
        int pB = numbers.length - 1;
        
        while(numbers[pA] + numbers[pB] != target){
            if(numbers[pA] + numbers[pB] > target){
                pB--;
                continue;
            }
            if(numbers[pA] + numbers[pB] < target){
                pA++;
                continue;
            }
        }
       return new int []{pA + 1, pB + 1};
    }
}