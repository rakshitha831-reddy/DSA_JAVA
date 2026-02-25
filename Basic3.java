class Basic3{
    private static Basic3 instance;
    public static Basic3 getInstance(){
        if(instance==null)
            instance = new Basic3();
        return instance;
    }
    private Basic3(){

    }
    public static void main(String[] a){
        Basic3 s1 = Basic3.getInstance();
        System.out.println(s1);
        Basic3 s2 = Basic3.getInstance();
        System.out.println(s2);
        System.out.println(s1==s2);

    }
}