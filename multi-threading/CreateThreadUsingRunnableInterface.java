class MyThread extends Thread{
    private int threadNum;

    MyThread(int n){
        threadNum = n;
    }

    public void run(){
        System.out.println("Thread Number:"+threadNum+" is running");
    }
}

public class CreateThreadUsingRunnableInterface{
    public static void main(String[] args) {
        System.out.println("main thread starts");
        MyThread t1= new MyThread(1);
        MyThread t2= new MyThread(2);
        MyThread t3= new MyThread(3);
        t1.start();
        t2.start();
        t3.start();
        System.out.println("main thread finished");
    }
}