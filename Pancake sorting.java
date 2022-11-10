class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        int max = n;
        int idxToPlace = n - 1;
        for (int i = 0; i < n; i++) {
            if (arraySorted(arr)) {
                return list;
            }
            int k = findIndexOfMax(max, arr);
            if (k != 0) {
                flipArray(k, arr);
                list.add(k + 1);
            }
            if (arraySorted(arr)) {
                return list;
            }
            flipArray(idxToPlace, arr);
            list.add(idxToPlace + 1);
            max--;
            idxToPlace--;
        }
        return list;
    }
    
    private int findIndexOfMax(int max, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (max == arr[i]) return i;
        }
        return -1;
    }

    private void flipArray(int k, int[] arr) {
        for (int i = 0; i <= k / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[k - i];
            arr[k - i] = temp;
        }
    }

    private boolean arraySorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }
}
