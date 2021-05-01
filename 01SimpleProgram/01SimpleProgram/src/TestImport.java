//import garden.vegetable.VineVegetable;
import garden.vegetable.*;
import nursery.vegetable.* ;

public class TestImport {

        public static void main(String[] args) {

            // Using a FQCN when using the String class in the java.lang package
            java.lang.String s = "We are testing ways to import classes";
            System.out.println(s);

            // class form other packages
            VineVegetable.main(args);
            nursery.vegetable.VineVegetable.main(args);
        }
    }

class VineVegetable{
    public static void main(String[] args){
        System.out.println("I'm a local class Vegetable");
    }
}