class Cylinder{
    public double radius;
    public double height;
    
    public double lidArea()
    {
        return Math.PI * radius * radius;
    }

    public double circumference()
    {
        return 2*Math.PI*radius;
    }

    public double volume()
    {
        return lidArea()*height;
    }

    public double totalSurfaceArea()
    {
        return 2*lidArea()+circumference()*height;
    }
}

public class CylinderTest {
    public static void main(String[] args)
    {
        Cylinder cl = new Cylinder();
        cl.radius = 7;
        cl.height = 10;

        System.out.println("lidArea: " + cl.lidArea());
        System.out.println("volume: " + cl.volume());
        System.out.println("Total Area: " + cl.totalSurfaceArea());
    }
}
