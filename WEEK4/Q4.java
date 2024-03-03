package myPack1.WEEK4;

import static java.lang.Thread.sleep;

public class Q4 extends Thread{
    public void run(){
        for(int i = 1; i<=3; i++){
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        Q4 r = new Q4();
        Thread t = new Thread();
        t.start();
        System.out.println("Run::::");
    }
}
