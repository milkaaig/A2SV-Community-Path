class Solution {
public int maxArea(int[] height) {

    int maxArea= 0,start=0,last = height.length-1;
    while(start< last){
        
        int Area = Math.min( height[start],height[last] )*(last-start);
        
         maxArea = maxArea < Area ? Area : maxArea;
        
        if(height[start] < height[last]){
            start++;
        }
        else
        last--;
        
        
    }
    return maxArea;
}
}
