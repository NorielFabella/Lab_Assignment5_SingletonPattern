public class QueueSystem {
    private static QueueSystem instance;
    private int queueNumber = 997;
    
    
    private QueueSystem() 
    {
      
    }

    
    public static synchronized QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    
    public synchronized int getNextQueueNumber() {
        
        int currentNumber = queueNumber;
        queueNumber++;



        return currentNumber;
    }

   
    public synchronized void resetQueue(int newQueueNumber) {
        queueNumber = newQueueNumber;
        System.out.println("Queue number has been reset to: " + queueNumber);
    }

    
    public synchronized int getCurrentQueueNumber() {
        return queueNumber;
    }
}