/*Write a program that:
1. reads a number N (must be greater than 0) from the console
2. reads N numbers from the console
3. Displays the maximum of the N entered numbers.

*/

public class MaxNum{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int[] arr = new int[N];
        
        int maximum = 0;
        
        for(int i=0; i<N; i++){
                arr[i] = Integer.parseInt(reader.readLine());
        }
       
        
        for(int j=0; j<N; j++){
           if(arr[j]>=0){
               if(arr[j]>maximum){
                 maximum= arr[j];
                }
           } else if(arr[j]<0) {
               if (maximum == 0 || arr[j] > maximum) {
                maximum = arr[j];
            }
           }
        }
        System.out.println(maximum);
    }
    
    
}
