class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int stone :stones){
            maxHeap.add(stone);
        }

        while(maxHeap.size()>1){
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if(x !=  y){
                maxHeap.add(x-y);
            } 
        }
        return maxHeap.size() >= 1 ? maxHeap.peek() : 0;
        
    }
}