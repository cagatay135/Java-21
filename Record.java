class Record {
    public record User(String name, int age) {
    }

    static class Animal {
        public String sound;

        public Animal(String sound) {
            this.sound = sound;
        }
    }


    public static void main(String[] args) {
        var newUser = new User("Cagatay", 23);

        var cat = new Animal("miyav"); // cat sound in turkish :)

        if (newUser.name.equals("Cagatay")) {
            System.out.println("Name equal the Cagatay");
        }
    }
}



