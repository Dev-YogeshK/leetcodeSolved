// Author :- yogeshk

class SumOfDiagonals {
    public static void main(String[] args) {
        int [][] mat = {{1,2,3},{4,5,6},{7,8,9}};
      
        
        int len= mat.length;

         int a1=0;
         int a2=0;
         int sum=0;
         int i=0;
         do {
             a1= mat[i][i];
             a2=mat[i][len-i-1];
             sum += a1+a2;
          
            i++;
          
        } while (i<=len-1);
         
        if (len%2==0){
         System.out.println(sum);
        } else {
            System.out.println(sum- mat[len/2][len/2]); 
        }
    }
}
