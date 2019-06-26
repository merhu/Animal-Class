/*
 * All Birds are Animals but all Animals are not Birds
 */
public class Bird extends Animal {
    public Bird() {
        //super();                          //this constructor method is not used because it only applies to the bird class.
        System.out.println ( "A bird is hatched..." );
    }

    //using override returns what we have on Animal class on this method
    //so instead of returning "An animal sleeps soundly" it replaces it with the class(name)
    //  animal so it becomes "a bird sleeps soundly"

    @Override
    public String sleep() {
        return "A bird sleeps soundly...";
    }


    @Override
    public String eat() {
        return "A bird eats...";
    }


    public String fly() {
        //Birds can fly but other animals can't so this method
        //is unique to the Bird class
        return "A bird flies...";
    }
}

//Overloading in Java. Overloading allows different methods to have same name,
// but different signatures where signature can differ
// by number of input parameters or type of input parameters or both.

//You can implement method overloading in two different ways:
//implementing two or more methods that have the
// same name but take different numbers of arguments
//implementing two or more methods that have
// the same name but take arguments of different types