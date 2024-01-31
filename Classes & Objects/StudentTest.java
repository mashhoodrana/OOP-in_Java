class Student
{

    public int rollNo;
    public String name;
    public String course;
    public int m1, m2, m3;


    public int total()
    {
        return m1+m2+m3;
    }

    public double average()
    {
        double avg = (double)total()/3;
        return avg;
    }
     
    public char grade()
    {
        if (total() >= 80){
            return 'A';
        }
        return 'B';
    }

    public String details()  // by using toString(), you just need to call the object name in the sout and it will print the following the line. 
    {
        return "Roll-No: "+rollNo+"\n" + "Student Name: "+name+"\n" + "Course: "+course+"\n" + "OHT-1 Marks: "+m1+"\n" + "OHT-2 Marks: "+m2+"\n" + "Final Marks: "+m3+"\n" + "Average: "+average()+"\n" + "Total: "+total()+"\n" + "Grade: "+grade()+"\n";
    }
}

public class StudentTest{
    public static void main(String[] args)
    {
        Student s = new Student();
        s.rollNo = 230201053;
        s.name = "Mashhood Rana";
        s.course = "Discrete Structure";
        s.m1 = 24;
        s.m2 = 28;
        s.m3 = 30;
        System.out.println("Details of " + s.name + "\n" + s );
    }
}