class Solution {
    public int leastInterval(char[] tasks, int n) {
        int arr [] = new int[26];
        for(char x : tasks)
            arr[x-'A']++;
        Arrays.sort(arr);
        int max = arr[25]-1;
        int c = max * n ;
        int i=24;
        while(c>0 && i>=0)
            c-=Math.min(max,arr[i--]);
        return c<=0?tasks.length:tasks.length+c;
    }
}