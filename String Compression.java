class Solution {
   public int compress(char[] chars) {
    int count = 1; 
    int index = 0; 
    for (int i = 0; i < chars.length; i++) {
        while (i < chars.length - 1 && chars[i] == chars[i + 1]) {
            count++; 
            i++; 
        }
        if (count == 1) {
            chars[index++] = chars[i]; 
        } else {
            chars[index++] = chars[i]; 
            String num = String.valueOf(count); 
            for (int j = 0; j < num.length(); j++) {
                chars[index++] = num.charAt(j); 
            }
        }
        count = 1; 
    }
    return index; 
}
}
