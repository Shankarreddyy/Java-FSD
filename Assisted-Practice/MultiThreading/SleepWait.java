package MultiThreading;

public class SleepWait 
{
    private static Object LOCKED = new Object();
    public static void main(String args[]) throws InterruptedException{
        Thread.sleep(2000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 2 second");
        synchronized (LOCKED) {
            LOCKED.wait(2000);
            System.out.println("Object '" + LOCKED + "' is woken after" + " waiting for 2 second");
        }
    }
}

