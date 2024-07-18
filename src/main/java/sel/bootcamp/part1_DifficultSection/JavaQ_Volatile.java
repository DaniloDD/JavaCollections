package sel.bootcamp.part1_DifficultSection;

public class JavaQ_Volatile {
    private static volatile JavaQ_Volatile _instance; // volatile variable
    public static JavaQ_Volatile getInstance() {
        if (_instance == null) {
            synchronized (JavaQ_Volatile.class) {
                if (_instance == null)
                    _instance = new JavaQ_Volatile();
            }
        }
        return _instance;
    }
}
/*
we are creating instance lazily at the time the first request comes.
If we do not make the _instance variable volatile then the Thread which is creating the instance of Volatile is not able to communicate 
to the other thread. So if Thread A is creating Singleton instance and just after creation, the CPU corrupts etc, all other threads 
will not be able to see the value of _instance as not null and they will believe it is still assigned null.

This happens because reader threads are not doing any locking and until the writer thread comes out of a synchronized block, 
the memory will not be synchronized and value of _instance will not be updated in main memory. 
With the Volatile keyword in Java, this is handled by Java itself and such updates will be visible by all reader threads.
*/