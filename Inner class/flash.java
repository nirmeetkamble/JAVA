class OutterClass{
    int x = 5;
    class InnerClass{
        int y = 6;
    }
}
class flash{
    public static void main(String[] args){
        OutterClass outterclass = new OutterClass();
        OutterClass.InnerClass innerclass = outterclass.new InnerClass();
        System.out.println(outterclass.x + innerclass.y);
    }
}   