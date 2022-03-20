abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzz");
    }
}
    class Dog extends Animal{
        public void animalSound(){
            System.out.println("Bow Zzz");
        }
    }
       class oscar{
        public static void main(String[] args){
            Dog Bolt = new Dog();
            Bolt.animalSound();
            Bolt.sleep();


        }
    }

