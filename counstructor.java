public class counstructor {
    String CarName;
    int ModelNumber;
    public counstructor(String name , int year ){
       CarName = name;
       ModelNumber = year;
    }
    public static void main(String[] args){
        counstructor MyCar = new counstructor("Mustang",1996);
        System.out.println(MyCar.CarName+" "+MyCar.ModelNumber);

    }
}

