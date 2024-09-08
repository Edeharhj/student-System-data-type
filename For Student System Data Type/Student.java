public class Student {
    //attributes or assign (ari ka mag assign sa object)
    private String id;
    private String name;
    private int age;
    private String section;
    private String department;
    private double grade;

    //constructor (anhi or dinhi nimo i put kung unsa sila na object)
    public Student(String id, String name, int age, String section, String department, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.section = section;
        this.department = department;
        this.grade = grade;
    }

    //setters or set and getters or get (nag libog ko basta mao ingon sa indian GETTERS AND SETTERS)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section){
        this.section = section;
    
    }

    public String getDepartment(){
        return department;
    }

    public void setDeparment(String department){
        this.department = department;
    }

    public double getGrade(){
        return grade;
    }

    public void setGrade(double age){
        this.grade = grade;
    }

    //toString method ako gi gamit which is indian gihapon nako nakit.an
    //toString is used para ma print ni ang student information

public String toString () {
    return "Student{" + "ID='" + id + '\'' + ", Name=" + name + '\'' + ",Age=" + age + ", Section=" + section + ", Department='" + department + '\'' + "Grade=" + grade + '}';
}

}
