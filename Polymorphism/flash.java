class Animals{
    public void AnimalVoice(){
        System.out.println("This is animal sounds like");  
    }
}
class pig extends Animals{
    public void AnimalVoice(){
        System.out.println("This is what pig sounds like Oink Oink !! ");
    }
}
class Dog extends Animals{
    public void AnimalVoice(){
        System.out.println("This is dog sounds like bow bow");
    }
}

class cats extends Animals{
    public void AnimalVoice(){
        System.out.println("This is cat sounds like meow meow");
    }
}
class flash{
public static void main(String[] args){
    Animals MyAnimals = new Animals();
    Animals Mypig = new pig();
    Animals MyDog = new Dog();
    Animals Mycat = new cats();

    MyAnimals.AnimalVoice();
    Mycat.AnimalVoice();
    MyDog.AnimalVoice();
    Mypig.AnimalVoice();

}
}