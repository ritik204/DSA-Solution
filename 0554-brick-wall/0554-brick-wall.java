class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(List<Integer> l :wall){
            int total = 0;
            for(int i = 0;i< l.size() - 1;i++){
                total+=l.get(i);
                map.put(total,map.getOrDefault(total,0)+1);
                res = Math.max(res,map.get(total));
            }
        }
        
        return wall.size() - res;
    }
}