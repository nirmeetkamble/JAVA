class Vehicle{
    protected String brand ="Ford";
    public void honk(){
        System.out.println("hello world!");

    }
}

class car extends Vehicle{
    private String modelName ="Mustang";
    public static void main(String[] args){ 
        car MyCar = new car();

        MyCar.honk();
        System.out.println(MyCar.brand+ " " + MyCar.modelName);
    }
}