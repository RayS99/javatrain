package javatrain;

/*

Task: Inheritance
Given the provided Person class (see comments),  create two types derived from Person, Employee and Trainee. The two types inherit a name field from Person.Employee must have:
a field annualSalary of type double a field weeklySalary of type double a method calculateWeeklySalary() which makes use of the formula weeklySalary = annualSalary / 52.
Trainee must have:
a field bursary of type double a list of subjects learned as a field called subjectsLearneda method addSubject() for adding a new subject to the list.
Each derived type, Trainee and Employee must be encapsulated (using private fields with public accessors).TIPS:
You can call a base types constructor with the super() constructYou can call a constructor in the same class from a constructor with the this() construct, this technique is known as constructor chainingYou don't need to rewrite public methods supplied by a parent type unless you are overriding them

 public class Person {
    
    private String name;
    
    public Person() {
        this("Unknown");
    }
    
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
 */

public class PersonR {
	public Person() {
        this("Unknown");
    }
    
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
