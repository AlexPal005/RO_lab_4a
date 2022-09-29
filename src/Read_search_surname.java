import java.util.concurrent.locks.*;
public class Read_search_surname implements Runnable {

    private Search search;
    private ReadWriteLock readWriteLock;

    public Read_search_surname(Search search, ReadWriteLock readWriteLock){
        this.search = search;
        this.readWriteLock = readWriteLock;
    }
    @Override
    public void run() {

        readWriteLock.readLock().lock();
        try {
            Thread.sleep(1000);
            search.search_by_surname("Rudenko");
            //System.out.println(Thread.currentThread().getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            readWriteLock.readLock().unlock();
        }

    }
}
