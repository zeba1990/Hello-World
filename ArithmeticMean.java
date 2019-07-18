/* 
Arithmetic mean

*/
import java.util.Scanner;

public class ArithmeticMean {
    public static void main(String[] args) throws Exception {
        //write your code here
        int sum =0, i=0;
        double mean =0;
        
        while(true){
            Scanner obj = new Scanner(System.in);
            int num = obj.nextInt();
            
            if(num == -1){
                if(i==0){
                    mean = 0.0;
                }
                break;
            }else{
                sum =sum + num;
            }
            i++;
        }
        mean = (double) sum/i;
        
        System.out.println(mean);
        
    }
}

