class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0){
            return new ArrayList();
        }
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char c[]=s.toCharArray();
            Arrays.sort(c);
            String s2=new String(c);
            if(!map.containsKey(s2)){
                map.put(s2,new ArrayList<>());
            }
                map.get(s2).add(s);
            
        }
        for(String s:map.keySet()){
            ans.add(map.get(s));
        }
        return ans;
    }
}