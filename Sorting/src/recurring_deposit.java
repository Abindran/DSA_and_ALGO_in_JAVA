interface bank
{
    double interest(int age,int amount);
}
class recurring_deposit implements bank
{
    public double interest(int age,int amount)
    {
        if(age>=60)
        {
            return amount*0.08;
        }
        else if(age<60)
        {
            return amount*0.062;
        }
        else if(age<18)
        {
            return -1;
        }
        return 0.0;
    }
}
class fixed_deposit implements bank
{
    public double interest(int age,int amount)
    {
        if(age>=60)
        {
            return amount*0.085;
        }
        else if(age<60)
        {
            return amount*0.072;
        }
        else if(age<18)
        {
            return -1;
        }
        return 0.0;
    }
    public static void main(String g[])
    {
        bank obj=new fixed_deposit();
        System.out.println("FD "+obj.interest(66,50000)); bank obj1=new recurring_deposit();;
        System.out.println("RD "+obj1.interest(66,50000));
    }
}
