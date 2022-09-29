import java.io.FileWriter;
import java.util.Scanner;
import java.io.*;
import java.util.List;
import java.util.*;

public class Write_data {
    private Scanner scanner;
    public Write_data(Scanner scan){
        this.scanner = scan;
    }
    public String get_s() throws Exception {
        FileReader path = new FileReader("C:\\Users\\Qwerty\\Desktop\\3 course\\Programming Ruby\\lab_4\\RO_lab_4a\\src\\test.txt");
        Scanner scan = new Scanner(path);
        String str = "";
        while (scan.hasNextLine()) {
            str += scan.nextLine();
        }
        return str;
    }
    public void add_notation(String data) throws Exception{
        String str = get_s();
        str = str.concat(data);
        FileWriter writer = new FileWriter("C:\\Users\\Qwerty\\Desktop\\3 course\\Programming Ruby\\lab_4\\RO_lab_4a\\src\\test.txt", false);
        BufferedWriter w = new BufferedWriter(writer);
        w.write(str);
        w.append(",");
        w.close();
        System.out.println("Added:\n" + data);
    }
    public void delete(String name) throws Exception{
        String str = "";
        while(scanner.hasNextLine()){
            str += scanner.nextLine();
        }
        String[] person = str.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(person));
        System.out.println(list);

        String[] data;
        for(int i = 0; i < list.size() ; i++){
            data = list.get(i).split(" - ");
            if (data[0].equals(name) ){
                list.remove(i);
                System.out.println("Deleted :" + name);
            }
        }
        System.out.println(list);

        str = String.join(",", list);
        FileWriter filewriter= new FileWriter("C:\\Users\\Qwerty\\Desktop\\3 course\\Programming Ruby\\lab_4\\RO_lab_4a\\src\\test.txt", false);
        BufferedWriter w = new BufferedWriter(filewriter);
        w.write(str);
        w.append(",");
        w.close();

    }
}