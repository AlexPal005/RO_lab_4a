
import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;

public class Search {
    public void search_by_surname( String surname) throws Exception{
        FileReader path = new FileReader("C:\\Users\\Qwerty\\Desktop\\3 course\\Programming Ruby\\lab_4\\RO_lab_4a\\src\\test.txt");
        Scanner scan = new Scanner(path);
        String str = "";
        while(scan.hasNextLine()){
            str += scan.nextLine();
        }

        String[] person = str.split(",");
        for(int i = 0; i < person.length; i++){
            System.out.println(person[i] + "\n");
        }
        String[] data;
        System.out.println("Found!");
        for(int i = 0; i < person.length; i++){
            data = person[i].split(" ");
            if (data[0].equals(surname)){
                System.out.println( data[0] +" " + data[data.length -1]);
            }
        }
    }
    public void search_by_number( String number) throws Exception {
        FileReader path = new FileReader("C:\\Users\\Qwerty\\Desktop\\3 course\\Programming Ruby\\lab_4\\RO_lab_4a\\src\\test.txt");
        Scanner scan = new Scanner(path);
        String str = "";
        while(scan.hasNextLine()){
            str += scan.nextLine();
        }
        String[] person = str.split(",");
        for(int i = 0; i < person.length; i++){
            System.out.println(person[i] + "\n");
        }
        String[] data;
        System.out.println("Found!");
        for(int i = 0; i < person.length; i++){
            data = person[i].split(" ");
            if (data[data.length -1].equals(number)){
                System.out.println( data[data.length -1] +" " + data[0]);
            }
        }
    }
}
