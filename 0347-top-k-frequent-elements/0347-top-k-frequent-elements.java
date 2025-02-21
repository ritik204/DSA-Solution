class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] list = new List[nums.length + 1];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           int i = entry.getValue();
           if(list[i] == null){
                list[i] = new ArrayList<>();
           }
           list[i].add(entry.getKey());
        }
        List<Integer> result = new ArrayList<>();
        for (int i = list.length - 1; i >= 0 && result.size() < k; i--) {
           if (list[i] != null) { 
                result.addAll(list[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}