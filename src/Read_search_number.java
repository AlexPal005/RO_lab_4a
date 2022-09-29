import java.util.concurrent.locks.*;
public class Read_search_number implements Runnable{
    private Search search;
    private ReadWriteLock readWriteLock;
    public Read_search_number(Search search, ReadWriteLock readWriteLock){
        this.search = search;
        this.readWriteLock = readWriteLock;
    }

    @Override
    public void run() {
        readWriteLock.readLock().lock();
        try {
            Thread.sleep(500);
            search.search_by_number("+32094832094");
            //System.out.println(Thread.currentThread().getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            readWriteLock.readLock().unlock();
        }
    }
}
