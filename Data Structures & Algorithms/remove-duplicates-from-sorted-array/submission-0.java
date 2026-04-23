class Solution {
    public int removeDuplicates(int[] nums) {
        TreeSet<Integer>hashSet = new TreeSet<>();
        for(int i: nums){
            hashSet.add(i);
        }
        for(int i = 0;i<nums.length-hashSet.size();i++){
            nums[hashSet.size()+i]=0;
        }
        int i = 0;
        for(int item: hashSet){
            nums[i] = item;
            i++;
        }
        return hashSet.size();
    }
}