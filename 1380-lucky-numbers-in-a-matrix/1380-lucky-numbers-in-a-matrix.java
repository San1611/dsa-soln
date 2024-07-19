class Solution {

    public List<Integer> luckyNumbers (int[][] matrix) {

    List<Integer> maxlist= new ArrayList<>();
    List<Integer> minlist= new ArrayList<>();
    List<Integer> list= new ArrayList<>();


    int min=0, max=0,idx=0,idx1=0;

    for(int i=0;i<matrix.length;i++){
        min=matrix[i][0];
        for(int j=0;j<matrix[0].length;j++){
            if(min>matrix[i][j]){
                min=matrix[i][j];
            }
            
        }
        minlist.add(min);
            
    }
    
    for(int i=0;i<matrix[0].length;i++){
        for(int j=0;j<matrix.length;j++){
            if(max<matrix[j][i]){
                max=matrix[j][i];
            }
            
        }
        maxlist.add(max);
        max=0;
              
    }
    System.out.println(minlist.toString());


    for(int i=0;i<Math.min(minlist.size(),maxlist.size());i++){
        if(minlist.size()>maxlist.size()){
        if(minlist.contains(maxlist.get(i)))
        list.add(maxlist.get(i));
        }
        else{
             if(maxlist.contains(minlist.get(i)))
        list.add(minlist.get(i));

        }
    }


    

return list;

    }
}