package by.kirill;

import java.util.concurrent.Semaphore;

/**
 * Created by Kirill on 04.10.2016.
 */
public class ClientSemaphore extends Thread {
    Semaphore semaphore;
    int id;
    ClientSemaphore(Semaphore semaphore, int id){
        this.semaphore = semaphore;
        this.id = id;
    }

    public int getClientId() {
        return id;
    }

    public void setClientId(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            if(semaphore.tryAcquire()) {
                System.out.println("Клиент " + id + " соединяется с оператором.");
                sleep(500);
                System.out.println("Клиент " + id + " закрывает соединение с оператором.");
                semaphore.release();
            }
            else{
                System.out.println("Клиент " + id + " ожидает освобождения оператора.");
                sleep(700);
                if(semaphore.tryAcquire()){
                    System.out.println("Клиент " + id + " соединяется с оператором.");
                    sleep(500);
                    System.out.println("Клиент " + id + " закрывает соединение с оператором.");
                    semaphore.release();
                }
                else{
                    System.out.println("Клиент " +id+ " бросает трубку.");
                }

            }


        }catch (InterruptedException e){

        }

    }
}
