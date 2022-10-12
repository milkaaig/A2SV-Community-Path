class Solution {
    public int maxOperations(int[] nums, int k) {
       // Sorting the Array
       Arrays.sort(nums);
	   //Initializing the Count
        int count=0;
        for(int i=0,j=nums.length-1; i<j;){
		//if Integer at i and j = equal, increament the Count and move the pointer
            if(nums[i]+nums[j]==k){
                count +=1;
                j--;
                i++;
            }
			// if the Integers at i and j are greater the k, we need the decrease the sum so we move the j pointer by -1 
            else if(nums[i]+nums[j]>k){
                j--;
            }  
			// else we increment the i pointer by +1
            else {
                i++;
            }
        }
		Return the Count
		return count;
	}
}
