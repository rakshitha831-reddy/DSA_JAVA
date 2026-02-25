class Animal {
    String dogname;
    Animal(String name){
        dogname=name;
        System.out.println("Animal created");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
        System.out.println("Dog created");
    }
}
class Testsuper{
    public static void main(String[] args){
        Dog ob =new Dog("Buddy");
    }
}