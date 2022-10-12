class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        
       // Arrays.sort(people);         n log n method
        
        int count[] = new int[limit+1];
        for(int p: people){
            count[p]++;                        
                                        //counting freq. of element 
        }
        int i = 0;
        for(int val = 1; val<=limit; val++){
            while(count[val]-- > 0){
                people[i++] = val; 
                                        //count sort ...sorts in O(n)
            }
        }
        
        int left = 0, right = n-1, boats = 0;       
                                            // two pointers and will check in limit
        while(left <= right){
            if(people[left] + people[right] <= limit){
                left++;
                right--;
            }
            else{
                right--;
            }
            boats++;
        }
        return boats;
                            //        O(n log n) can be optimised to O(n) using Count Sort
    }
}       
