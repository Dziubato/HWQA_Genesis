package homework3;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.util.*;

public class StudentsList {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File ("Student`s list.txt");
        if (!file.exists()) {
            try{
                file.createNewFile();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        if (file.exists()){
           // System.out.println("Exist");
        }
        System.out.println("Please, write first name and second name of the student");
        Scanner sc = new Scanner (System.in);
        TreeSet<String> studentList = new TreeSet<String>();
        String studentName = sc.nextLine();
        sc.close();
        if (read(file).contains(studentName)) {
            System.out.println("Such name exists in the file");
        }
        else {
            write(studentName, file);
        }
    }

    static void write(String str, File file) throws FileNotFoundException {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(file, true));
            pw.println(str);
            pw.close();
            System.out.println("Name of the student " + str + " is written to the " + file.getName());
        } catch (Exception e){
        }
    }

    public static ArrayList<String> read(File file){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            ArrayList<String> names= new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
            reader.close();
            return names;
        } catch (Exception e) {
        }
        return null;
    }
}
