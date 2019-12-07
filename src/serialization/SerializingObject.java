package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializingObject {
    public static void main(String[] args) {
        Employee employeeOutput = null;
        FileOutputStream fout = null;
        ObjectOutputStream oout = null;
        employeeOutput = new Employee();
        employeeOutput.setSerializeValueName("Aman");
        employeeOutput.setNonSerializeValueSalary(50000);
        try {
            fout = new FileOutputStream("Employee.txt");
            oout = new ObjectOutputStream(fout);
            oout.writeObject(employeeOutput);
            System.out.println("Serialized data is saved in Employee.txt file");
            oout.close();
            fout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}