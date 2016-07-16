
package model;

/**
 * @author Piotrek
 */
public class Person {
    private Integer iD;
    private String name;
    private String lastName;
    private String companyName;

    public Integer getiD() {
        return iD;
    }

    public void setiD(Integer iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Person{" + "iD=" + iD + ", name=" + name + ", lastName=" + lastName + ", companyName=" + companyName + '}';
    }
   
    
}
