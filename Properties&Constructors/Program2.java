class Student
{
    private int RollNO;
    private String Name;
    private String dept;
    private String subjects;

    public int getRollNo()
    {
        return RollNO;
    }

    public String getName()
    {
        return Name;
    }

    public String getDept()
    {
        return dept;
    }

    public String getSub()
    {
        return subjects;
    }

    public Student(int rno, String name, String dept)
    {
        RollNO=rno;
        Name=name;
        this.dept=dept;
    }

    public String details()
    {
        return "\nRoll NO: "+RollNO + "\nName: "+Name + "\nDepartment: " + dept;
    }

}

public class Program2 {
    public static void main(String[] args) {
        Student s = new Student(053, "Mashhood", "CS-04-A");
         System.out.println(s.details());
    }
}
