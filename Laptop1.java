class Laptop1{
    private Laptop1{

    }
    
}
class Basic extends Laptop1{ //cant inherit class
    public static void main(String[] args) {
        Basic ob=new Basic();
        Laptop1 obj=new Laptop1(); //cannot create object from other class
    }
}