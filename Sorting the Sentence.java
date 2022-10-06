class Solution {
    public String sortSentence(String s) {
       int y = s.length();
        ArrayList<String>arr = new ArrayList<>();
        
        String word = "";
        for(int i=0; i<y; i++){
            if(s.charAt(i)!=' '){
                word+=s.charAt(i);
            }else{
                arr.add(word);
                word = "";
            }
        }
        arr.add(word);
        String ans = "";
        int arrsize = arr.size();
        String a[] = new String[arrsize];
        for(int i=0; i<arr.size(); i++){
            String b = arr.get(i);
            int v = b.length()-1;
            a[b.charAt(v)-'1']= b.substring(0,v);
        }
        for(int i=0; i<arrsize-1; i++){
            ans+=a[i]+" ";
        }
        ans+=a[arrsize-1];
       
        return ans;
    }
}
