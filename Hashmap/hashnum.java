import java.util.HashSet;
public class hashnum {
    public static void main(String[] args){
        HashSet<Integer> MyNum = new HashSet<Integer>();
        MyNum.add(1);
        MyNum.add(5);
        MyNum.add(7);
        MyNum.add(9);
        for (int i = 1 ; i <= 10; i++){
            if(MyNum.contains(i)){
                System.out.println("Number in SET");
            }else{ System.out.println("Number in not in SET");
                    }
            }
        }
    }
    

