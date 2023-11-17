package employeeApp;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(long id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void addHealthplan(int index, String name) {
        if (index < 0 || index >= healthplans.length) {
            System.out.println("invalid index");
        } else {
            boolean isExist = false;
            for (String healthplan : healthplans) {
                if (healthplan!=null && healthplan.equals(name)) {
                    isExist = true;
                    System.out.println(name + " healthplans içerisinde mevcut");
                    break;
                }
            }
            if (!isExist) {
                if (healthplans[index] == null) {
                    healthplans[index] = name;
                } else {
                    System.out.println("invalid index,index full");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}
