class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int max = heights[0] ;
        int index = 0 ;
        for(int i=0;i<names.length;i++){
            max = heights[i] ;
            index = i;
            for(int j=i;j<names.length;j++)
                if(max<heights[j]){
                    max=heights[j];
                    index = j ;
                }

            int temp = heights[index];
            heights[index] = heights[i];
            heights[i] = temp;
            String temps = names[index];
            names[index] = names[i];
            names[i] = temps;
        }
        return names;
    }
}