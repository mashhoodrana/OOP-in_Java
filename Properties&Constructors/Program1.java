class Subject
{
    private int subID;
    private String name;
    private int MaxMarks;
    private int marksObtain;

    public int getID()
    {
        return subID;
    }

    public String getName()
    {
        return name;
    }

    public int getMax()
    {
        return MaxMarks;
    }

    public int getObtain()
    {
        return marksObtain;
    }


    public void setMax(int m)
    {
        MaxMarks=m;
    }

    public void setObtain(int o)
    {
        marksObtain=o;
    }

    public Subject(int id, String n, int m)
    {
        subID=id;
        name=n;
        MaxMarks=m;
    }

    boolean isQualified()
    {
        return marksObtain >= MaxMarks/10*4;
    }
    public String toString()
    {
        return "\nSubject ID: "+subID + "\nName: "+name + "\nMarks Obtained: "+marksObtain;
    }


}

public class Program1 {
    public static void main(String[] args) {
        Subject subs[] = new Subject[4];
        subs[0] = new Subject(043, "DS", 100);
        subs[1] = new Subject(047, "OOP", 100);
        subs[2] = new Subject (053, "PF", 100);
        subs[3] = new Subject(023, "ICT", 100);

        for(Subject s:subs)
            System.out.println(s);


    }
}
