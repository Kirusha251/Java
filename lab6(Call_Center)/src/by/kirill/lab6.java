package by.kirill;

import java.util.concurrent.Semaphore;

/**
 * Created by Kirill on 04.10.2016.
 */
public class lab6 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        ClientSemaphore clientSemaphore1 = new ClientSemaphore(semaphore,1);
        ClientSemaphore clientSemaphore2= new ClientSemaphore(semaphore,2);
        ClientSemaphore clientSemaphore3 = new ClientSemaphore(semaphore,3);
        ClientSemaphore clientSemaphore4 = new ClientSemaphore(semaphore,4);
        clientSemaphore1.start();
        clientSemaphore2.start();
        clientSemaphore3.start();
        clientSemaphore4.start();
    }
}
