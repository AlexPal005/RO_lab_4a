import java.util.concurrent.locks.*;
public class Write_add implements Runnable {
    private ReadWriteLock readWriteLock;
    private Write_data write_data;
    public Write_add(ReadWriteLock readWriteLock, Write_data write_data){
        this.readWriteLock = readWriteLock;
        this.write_data = write_data;
    }
    @Override
    public void run() {
        readWriteLock.writeLock().lock();
        try {
            Thread.sleep(50);
            write_data.add_notation("Polishchuk Petro Vasylovich - +380932432442\"");
            //System.out.println(Thread.currentThread().getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
}
