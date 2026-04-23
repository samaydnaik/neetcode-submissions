class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        [2,3,4,8,9,10,11]
        */

        if(nums.length<1) return 0;
        Set<Integer> orderedList = new TreeSet<>();
        for(int i = 0;i<nums.length;i++){
            orderedList.add(nums[i]); //[2,3,4,5,10,20]
        }

        int max_length = 0;
        int length = 0;

        if(orderedList.size()<2)return 1;

        List<Integer> list = new ArrayList<>(orderedList);
        for(int i = 0;i<list.size()-1;i++){
            if(list.get(i+1) == list.get(i)+1){
                length++;
            } else {
                if(length > max_length) max_length = length;
                length = 0;
            }
        }
        if(length > max_length) max_length = length;

        return max_length+1;
    }
}
