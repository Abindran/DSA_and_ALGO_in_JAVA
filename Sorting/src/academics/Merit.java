package academics;

public class Merit {
        public int Gettotal(int m1,int m2,int m3,int m4)
        {
            return m1+m2+m3+m4;
        }
        public double Getaverage(int  total)
        {
            return total/4;
        }
        public String getgrade(double avg)
        {
            if(avg>=80)
            {
                return "A+";
            }
            else if(avg>=70 && avg<80)
            {
                return "A";
            }
            else if(avg>=60 && avg<70)
            {
                return "B";
            }
            else if(avg>=50 && avg<60)
            {
                return "C";
            }
            else
            {
                return "D";
            }
        }
        public void Displaydetails(String name,int total,double average,String Grade)
        {
            System.out.println("Name: "+name);
            System.out.println("Total: "+total);
            System.out.println("Average: "+average);
            System.out.println("Grade: "+Grade);
        }


}
