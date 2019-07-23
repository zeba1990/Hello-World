/* 
Static cats
Practice with arraylist
*/
import java.util.ArrayList;



public class Cat {
    //write your code here
    public static ArrayList<Cat> cats= new ArrayList<>(10);
 
    public Cat() {
        
    }

    public static void main(String[] args) {
        //write your code here
        printCats();
        for(int i=0; i<10; i++){
            cats.add(new Cat());
        }
    }

    public static void printCats() {
        //write your code here
        for (int i = 0; i < 10; i++) {
             System.out.println(cats);
        }
       
    }
}
