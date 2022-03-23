public class flash{
    static void AgeCheck(int age){
        if(age<18){
            throw new ArithmeticException("AGE should be greater then 10");
        }
        else{
            System.out.println("YOU ARE OLD ENOUGH!");
        }
        
    }
    public static void main(String[] args){
        AgeCheck(15);
    }
}