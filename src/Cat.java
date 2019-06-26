    /*
     * All Cats are Animals but all Animals are not Cats
     */
    public class Cat extends Animal {

        public Cat() {
           super();                                     //use of constructor method from animal class
            System.out.println("Now I am a Cat!");
        }

        @Override
        public String sleep() {
            return "A cat sleeps...";
        }

        @Override
        public String eat() {
            return "A cat eats...";
        }
                                                // this method is specifically for cat class
                                                // which animal class doesn't know so it only applies to cats
        public String purr() {
            return "purrr...";
        }

    }


