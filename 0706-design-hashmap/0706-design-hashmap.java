class MyHashMap {
    int map [][] ;
    public MyHashMap() {
        map = new int[10][2];
    }
    
    public void put(int key, int value) {
        if(map.length<=key)
            map = resize(key);
        map[key][0]=key==0?-1:key;
        map[key][1]=value;
    }
    public int[][] resize (int key){
        int arr[][] = new int[key+1][2];
        for(int i=0;i<map.length;i++){
            arr[i][0]=map[i][0];
            arr[i][1]=map[i][1];
        }
        return arr;
    }
    public int get(int key) {
        try{
            return map[key][0]==0?-1: map[key][1];
        }
        catch(Exception e ){
            return -1;    
        }
    }
    
    public void remove(int key) {
        try{
            map[key][0]=0;
        }
        catch(Exception e ){
            
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */