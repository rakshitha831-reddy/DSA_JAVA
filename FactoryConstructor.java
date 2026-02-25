 class FactoryConstructor {
    static String Username;
    static String Userrole;
    private FactoryConstructor(String name){
        Username = name;
        Userrole = "ADMIN";

    }
    public static FactoryConstructor createAdmin(String name){
        return new FactoryConstructor(name);
    }
    static void display(){
        System.out.println("User:"+Username+"\nRole:"+Userrole);
    }
    public static void main(String[] args){
        FactoryConstructor.createAdmin("Alice");
        FactoryConstructor.display();
    }
}
