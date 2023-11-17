package employeeApp;

import java.util.Arrays;
import java.util.PrimitiveIterator;

public class Company {
    private long id;
    private String companyName;
    private double giro;
    private String[] developerNames;

    public Company(long id, String companyName, double giro, String[] developerNames) {
        this.id = id;
        this.companyName = companyName;
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
        this.developerNames = developerNames;
    }

    public long getID() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name) {
        try{
            if(developerNames[index] ==null){
                developerNames[index] =name;
            }else{
                System.out.println("this index full");
            }
        }catch(Exception ex){
            System.out.println("invalid index");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
