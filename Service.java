class Service{
     static void process(Task t){
     System.out.println(t);
    }
}
class Task{
    static Task o = new Task();//reference variable as static
   static void start(){
    Service.process(o);//passing variable at static
        
    }
}
class Basic{
    public static void main(String[] args){
        Task.start();//calling static start method
    } 
}