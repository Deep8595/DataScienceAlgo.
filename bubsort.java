import java.util.Arrays;

    public static void main(String[] args) {
        
        int[] arr = {1,24,56,787,890,23,45};
        
        System.out.println(Arrays.toString(arr)) ;
        
        // System.out.println(Arrays.toString(arr)) ;
           bubsort(arr); 
    }
    public static void bubsort(int newarr[]){
        int n = newarr.length;
        for(int i = 0; i < n; i++){
            for(int j= 0 ; j < n-1; j++){
                if( newarr[j] > newarr[j+1] ){
                    int temp ;
                    temp = newarr[j+1];
                    newarr[j+1] = newarr[j];
                    newarr[j] = temp; 

                }
            }
        }
        System.out.println(Arrays.toString(newarr));
    }

