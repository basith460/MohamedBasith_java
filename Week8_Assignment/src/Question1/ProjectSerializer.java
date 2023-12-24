package Question1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ProjectSerializer {

	Map<Project, ArrayList<Employee>> projectMap1 = new HashMap<>();
    ArrayList<Employee> elist1 = new ArrayList<>();
    ArrayList<Employee> elist2 = new ArrayList<>();
    ArrayList<Employee> elist3 = new ArrayList<>();

    public void serializeProjectDetails(Map<Project, ArrayList<Employee>> projectMap) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
            oos.writeObject(projectMap);
            System.out.println("Output: SerializeData");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public void deserializeProjectDetails() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.ser"))) {
            Map<Project, ArrayList<Employee>> deserializedMap = (Map<Project, ArrayList<Employee>>) ois.readObject();

            System.out.println("Output: DeSerializeData");

            for (Map.Entry<Project, ArrayList<Employee>> entry : deserializedMap.entrySet()) {
                Project project = entry.getKey();
                ArrayList<Employee> employees = entry.getValue();

                System.out.println("DeSerialized Data:");
                System.out.println("The Project " + project + " Has the following Employees");
                System.out.println("Employees .....");
                for (Employee employee : employees) {
                    System.out.println(employee);
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
