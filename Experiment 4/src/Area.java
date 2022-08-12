public class Area {

    public double area(double a, double b, double c)
    {
        double s = (a+b+c)/2;
        return  Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public double area(double a, double b, double c, double d){
        return a*b;
    }

    public double area(double r){
        return Math.PI * Math.pow(r, 2);
    }
}
