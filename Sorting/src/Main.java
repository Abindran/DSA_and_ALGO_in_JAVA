class Main extends Thread
{
    String square; public Main(String square)
{
    this.square=square;
}
    public void run()
    {     try{
        for(int i=1;i<=20;i+=2){
            System.out.println(square+":"+i);
            Thread.sleep(1000);
        }
    }
    catch(Exception e)
    {}
    }
    public static void main(String args[]){
        Main obj1 = new Main("Thread1");         Thread t1 = new Thread(obj1);
        t1.start();
        even obj2 = new even("Thread2");             Thread t2 = new Thread(obj2);
        t2.start();
    }
}
class even extends Thread
{
    String t;
    public even(String t)
    {
        this.t = t;
    }
    public void run()
    {         try{
        for(int j = 1; j <= 20; j++)
        {
            if(j % 2 == 0){
                System.out.println(t+":"+j);
                Thread.sleep(1000);
            }
        }
    }
    catch(Exception e){}
    }
}
