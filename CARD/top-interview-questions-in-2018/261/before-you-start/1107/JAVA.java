class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.containsKey(num)?map.get(num)+1:1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>=(int)Math.ceil((nums.length+1)/2)){
                return key;
            }
        }
        return 0;
    }
}
// 通过hashmap 计算每个数字的个数
// 然后遍历 判断大于一半 则返回此数字