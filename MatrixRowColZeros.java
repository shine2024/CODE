
 public class MatrixRowColZeros{

    public static int[][] matrixRowCol(int n[][]){
    boolean row=false;boolean col=false;
    for (int i=0;i<n[0].length;i++){
        if(n[i][0]==0){
         row = true;
         break;
        }
    }
     for (int i=0;i<n.length;i++){
        if(n[0][i]==0){
         col = true;
         break;
        }
    }
   
   for(int i=1;i<n.length;i++){
    for(int j=1;j<n[i].length;j++){
        if(n[i][j] ==0){
            n[0][j] =0;
            n[i][0] =0;

        }
    }
      
   }

   for(int i=1;i<n.length;i++){
    for(int j=1;j<n[i].length;j++){
     if (n[i][0] == 0 || n[0][j] == 0) {
                n[i][j] = 0;
            }
    }

    }

    if(row==true){
        for(int i=0;i<n.length;i++){
            n[i][0] =0;
        }
    }

     if(col==true){
        for(int i=0;i<n[0].length;i++){
            n[0][i] =0;
        }
    }


    return n;
    }


    public static void main(String[] args) {
        int[][] arr=new int[][]{{1, 1, 0}, {1, 1, 1}, {1, 1, 1}};
        matrixRowCol(arr);
        
         for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();}
    }
}