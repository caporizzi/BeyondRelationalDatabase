import java.io.Serializable;
import com.github.cliftonlabs.json_simple.JsonObject;


public class Employee extends JsonObject implements Serializable {
    String firstname;
    String name;
    String status;
    public Employee(String firstName, String lastName, String status) {
        this.firstname=firstName;
        this.put("firstname",this.firstname);
        this.name=lastName;
        this.put("name",this.name);
        this.status = status;
        this.put("status",this.status);
    }
}
