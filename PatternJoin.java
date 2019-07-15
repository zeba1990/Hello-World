
public class PatternJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i< 6; i++){
		    for(int j =0; j<i; j++){
		        System.out.print("*");
		    }
		     System.out.print("\n");
		  }
		for(int i = 6; i> 0; i--){
		    for(int j =i; j>0; j--){
		        System.out.print("*");
		    }
		     System.out.print("\n");
		  }

	}

}
