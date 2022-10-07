class Solution
{
	int  select(int arr[], int i)
	{
		int max = arr[0], ind = 0;
		for(int j=1; j<=i; j++)
		{
			if(arr[j]>max)
			{
				ind = j;
				max = arr[j];
			}
		}
		return ind;
	}
	
	void selectionSort(int arr[], int n)
	{
		
		for(int i=n-1; i>=0; i--)
		{
			int j = select(arr, i);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}	
	}
}
