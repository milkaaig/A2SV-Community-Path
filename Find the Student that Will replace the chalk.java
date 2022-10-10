class Solution {
public int chalkReplacer(int[] chalk, int k) {
long sum=0,value=0;
for(int i=0;i<chalk.length;i++)
{
sum=sum+chalk[i];
}
if(sum<=k)
{
value=k/sum;
}
long val=sum*value;
val=(k-val);
long s=0;
int ind=-1;
for(int i=0;i<chalk.length;i++)
{
s=s+chalk[i];
if(s>val)
{
ind=i;
break;
}
}
return ind;
}
}
