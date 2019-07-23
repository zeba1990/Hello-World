/* 
Cat relations

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class CatRelations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catgrandFather = new Cat(grandfatherName);
        
        String grandmotherName = reader.readLine();
        Cat catgrandMother = new Cat(grandmotherName);
        
        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null , catgrandFather);
        
        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,catgrandMother, null);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);
        
        String SonName = reader.readLine();
        Cat catSon = new Cat(SonName,catMother, catFather);

        System.out.println(catgrandFather);
         System.out.println(catgrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catDaughter);
        System.out.println(catSon);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parent1;

        Cat(String name) {
            this.name = name;
        }
        
        Cat(String name, Cat parent, Cat parent1) {
            this.name = name;
            this.parent = parent;
            this.parent1 = parent1;
        }

        @Override
        public String toString() {
            if (parent == null && parent1 == null)
                return "The cat's name is " + name + ", no mother, no father";
            else if (parent != null && parent1 != null)
                return  "The cat's name is " + name + ", " + parent.name + " is the mother"+ ", " + parent1.name + " is the father" ; 
            else if (parent != null && parent1 == null)
                return "The cat's name is " + name + ", " + parent.name + " is the mother, no father";
            else if (parent1 != null && parent ==null)
                return "The cat's name is " + name + ", no mother, " + parent1.name + " is the father";
            else
                return " ";
            
        }
    }

}
