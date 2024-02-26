import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Employee employe = new Employee("rene", "schumann", "prof");
        String filename = "me.ser";
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(employe);

            out.close();
            file.close();
        } catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        String filenameJ1 = "me.json";
        try (FileWriter file = new FileWriter(filenameJ1)) {
            file.write(employe.toString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}