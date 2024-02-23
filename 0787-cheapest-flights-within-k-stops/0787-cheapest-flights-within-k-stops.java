class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int arr [] = new int[n];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[src]=0;
        for(int i=0;i<=k;i++){
            int temp []= Arrays.copyOf(arr,n);
            for(int[] f : flights)
                if(arr[f[0]]!=Integer.MAX_VALUE)
                    temp[f[1]]=Math.min(temp[f[1]],arr[f[0]]+f[2]);
            arr = temp;
        }
        return arr[dst]==Integer.MAX_VALUE?-1:arr[dst];
    }
}