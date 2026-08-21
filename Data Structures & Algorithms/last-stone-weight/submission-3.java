class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for(int i = 0;i<stones.length;i++){
            pQueue.add(-stones[i]);
        }

        while(pQueue.size()>1){
            int first = pQueue.poll();
            int second = pQueue.poll();
            if (second > first) {
                pQueue.offer(first - second);
            }
        }
        pQueue.add(0);
        return Math.abs(pQueue.peek());
    }
}
