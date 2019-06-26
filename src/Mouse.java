public class Mouse extends Animal {
    public Mouse() {
        super ();
        System.out.println ( "I am now a Mouse" );

    }

    @Override
    public String eat() {
                return ("A Mouse eats...");
    }

    @Override
    public String sleep() {
        return ("A Mouse sleeps...");
    }
        public String hide() {
            return "A mouse hides...";
        }
    }

