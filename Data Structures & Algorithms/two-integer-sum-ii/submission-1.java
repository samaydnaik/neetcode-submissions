class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int pointerA = 0, pointerB = numbers.length-1;
        while(pointerA < pointerB){
            if(numbers[pointerA]+numbers[pointerB] == target)
            {
                result[0] = pointerA+1;
                result[1] = pointerB+1;
                return result;
            }
            else if(numbers[pointerA]+numbers[pointerB] > target){
                pointerB--;
            } else {
                pointerA++;
            }
        }

        return result;
    }
}
