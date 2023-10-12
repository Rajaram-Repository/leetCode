class Solution {
   public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int[] s = new int[n];
        int[] e = new int[n];

        for (int i = 0; i < n; i++) {
            s[i] = flowers[i][0];
            e[i] = flowers[i][1];
        }

        Arrays.sort(s);
        Arrays.sort(e);

        int[] ans = new int[people.length];
        int ei, si;
        int m = s.length;
        for (int i = 0; i < people.length; i++) {
            int open =0, close=0;
            if(people[i]<s[0])
            {
                open =0;
            }
            else if(people[i]>=s[m-1])
            {
                open = m;
            }
            else
            {
                int l =0, r=m-1;
                while(l<r)
                {
                    int mid = (l+r+1)>>1;
                    if(s[mid]<=people[i])
                    {
                        l = mid;
                    }
                    else
                    {
                        r=mid-1;
                    }
                }
                open = l+1;
            }
            if(people[i]<=e[0]) 
                close =0;
            else if(people[i]>e[m-1])
            {
                close =m;
            }
            else
            {
                int l=0, r=m-1;
                while(l<r)
                {
                    int mid = (l+r+1)>>1;
                    if(e[mid]<people[i])
                    {
                        l=mid;

                    }
                    else
                    {
                        r = mid-1;
                    }
                }
                close = l+1;
            }
            ans[i]=open-close;
        }
        return ans;
    }
}