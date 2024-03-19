class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int count = 1;
        int p = points[0][1];
        for(int i=1;i<points.length;i++){
            if(p<points[i][0]){
                count++;
                p=points[i][1];
            }
        }
        return count;
    }
}