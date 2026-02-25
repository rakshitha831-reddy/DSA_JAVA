class Animal{
    void speak(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animals{
    void speak(){
        super.speak();
        System.out.println("Dog barks");
    }

}
class Basic{
    public static void main(String[] args){
        Dog ob = new Dog();
        ob.speak();
    }
}