
    public class Dog extends Animal {
        public Dog() {
            super();  //use of construtor method from the animal class
            System.out.println ( "Now i am a Dog!" );

        }

        @Override
        public String sleep() {
            return ("A Dog sleeps...");
        }

        public String barks(){
            return ("A Dog barks....");
        }

        @Override
        public String eat() {
            return ("A Dog eats...");


        }
    }



