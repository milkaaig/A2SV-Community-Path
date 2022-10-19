class Solution {
    public List<Integer> partitionLabels(String S) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<S.length();i++){
            map.put(S.charAt(i),i);
        }
        
        int len=0;
        int end=-1;
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            
            int last=map.get(ch);
           end=Math.max(end,last);
            len++;
            
            if(i==end){
                list.add(len);
                len=0;
            }
        }
        return list;
    }
}
