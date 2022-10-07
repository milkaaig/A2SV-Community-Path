class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points,(a,b)->((Math.sqrt(a[0]*a[0]+a[1]*a[1])) - (Math.sqrt(b[0]*b[0]+b[1]*b[1])))<0?-1:1);
        int i,res[][] = new int[k][];
        for(i=0;i<k;i++)
            res[i]=points[i];
        return res;
    }
}
