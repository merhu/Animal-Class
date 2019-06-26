public class AnimalApp {
    public static void main(String[] args) {

        Animal a = new Animal ();             //new object
        print ( a.eat () );                     //override method
        print ( a.sleep () );

        Cat c = new Cat ();                 //new object
        print ( c.eat () );
        print ( c.sleep () );
        print ( c.purr () );


        Bird b = new Bird ();
        print ( b.eat () );
        print ( b.sleep () );
        print ( b.fly () );

        Dog d = new Dog ();         //inherited from animal class
        print ( d.eat () );
        print ( d.sleep () );
        print ( d.barks () );              //new method


        Mouse m = new Mouse ();   //new object
        print ( m.eat () );
        print ( m.sleep () );
        print ( m.hide () );   //new method
    }

    private static void print(String s) {
        System.out.println ( s );
    }
}
