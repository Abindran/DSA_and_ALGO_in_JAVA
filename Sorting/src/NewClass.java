import academics.*;
public class NewClass {
    public static void main(String S[])
    {
        Merit obj=new Merit();
        int mark=obj.Gettotal(92,95,87,89);
        double avg=obj.Getaverage(mark);
        String Grade=obj.getgrade(avg);
        obj.Displaydetails("Abindran",mark,avg,Grade);
    }

}
