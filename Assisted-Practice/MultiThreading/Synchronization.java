package MultiThreading;

class Sender1
{ 
    public void send(String message) 
    { 
        System.out.println("Sending..."  + message ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + "Above message  " + ";)Sent\n"); 
    } 
} 
class ThreadedSend extends Thread 
{ 
    private String msg; 
    
    Sender1  Shankar; 
    ThreadedSend(String m,  Sender1 obj) 
    { 
        msg = m; 
        Shankar = obj; 
    } 
  
    public void run() 
    {  
        synchronized(Shankar) 
        { 
            Shankar.send(msg); 
        } 
    } 
} 
public class Synchronization 
{ 
    public static void main(String args[]) 
    { 
        Sender1 snd = new Sender1(); 
        ThreadedSend S1 = 
            new ThreadedSend( " Hello! How r U? " , snd ); 
        ThreadedSend S2 = 
            new ThreadedSend( " Are U Fine? " , snd ); 
        S1.start(); 
        S2.start(); 
        try
        { 
            S1.join(); 
            S2.join(); 
        } 
        catch(Exception e) 
        { 
            System.out.println("Interrupted"); 
        } 
    } 
} 
