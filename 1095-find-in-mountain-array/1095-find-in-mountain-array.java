/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int op= -1;
        int l = mountainArr.length();
        int mid = mountainArr.get(l/2);
        int s = mountainArr.get((l/2)-1);
        if(l<90)
            for(int i=0;i<mountainArr.length();i++)
                if(mountainArr.get(i)==target)
                    return i;
        int index ;
        if(s<mid)
           index = back (target,l/2,mid,mountainArr);
        else
           index = front(target,l/2,mid,mountainArr);
        int f = find(target,0,index,mountainArr);
        if(f!=-1)
            return f;
        return find(target,index,l-1,mountainArr);
    }
    public int front (int target,int pos , int val , MountainArray mountainArr){
        int last =val;
        for(int i=pos-1;i>=0;i--){
            int curr = mountainArr.get(i);
            if(curr<last)
                return i+1;
            last = curr;
        }
        return -1;
    }
    public int back (int target,int pos , int val, MountainArray mountainArr){
        int last =val;
        for(int i=pos+1;i<mountainArr.length();i++){
            int curr = mountainArr.get(i);
            if(last>curr)
                return i-1;
            last = curr;
        }
        return -1;       
    }
    public int find(int target,int s ,int pos , MountainArray mountainArr){
        int e =pos;
        while(s<=e){
            int mid = s+(e-s)/2;
            int c = mountainArr.get(mid);
            if(c==target)
                return mid;
            else if(c>target)
                e =mid-1;
            else 
                s =mid+1;
        }
        return -1;
    }
}