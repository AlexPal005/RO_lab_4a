import java.util.concurrent.locks.*;
public class Write_delete implements Runnable{
    private ReadWriteLock readWriteLock;
    private Write_data write_data;
    public Write_delete(ReadWriteLock readWriteLock, Write_data write_data){
        this.readWriteLock = readWriteLock;
        this.write_data = write_data;
    }
    @Override
    public void run() {
        readWriteLock.writeLock().lock();
        try {
            Thread.sleep(50);
            write_data.delete("Klytenko Andriy Petrovich");
            //System.out.println(Thread.currentThread().getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }
}
