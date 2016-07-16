
package model;

/**
 * @author Piotrek
 */
public class Person {
    private String email;
    private String name;
    private String lastName;
    private String companyName;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "Person{" + "iD=" + email + ", name=" + name + ", lastName=" + lastName + ", companyName=" + companyName + '}';
    }
   
    
}
