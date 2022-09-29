import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.locks.*;

public class Main {
    private static ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    public static void main(String[] args ) throws Exception {
        FileReader path = new FileReader("C:\\Users\\Qwerty\\Desktop\\3 course\\Programming Ruby\\lab_4\\RO_lab_4a\\src\\test.txt");
        Scanner scan = new Scanner(path);
        Write_data wr = new Write_data(scan);
        Search search = new Search();

        new Main().readWriteLock = new ReentrantReadWriteLock();
        Read_search_surname read_search_surname = new Read_search_surname(search, readWriteLock);
        new Thread (read_search_surname).start();
        Read_search_number read_search_number = new Read_search_number(search, readWriteLock);
        new Thread(read_search_number).start();
        Write_delete write_delete = new Write_delete(readWriteLock, wr);
        new Thread (write_delete).start();
        Write_add write_add = new Write_add(readWriteLock, wr);
        new Thread (write_add).start();

    }

}