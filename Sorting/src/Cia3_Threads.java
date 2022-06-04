import java.util.Random;
class Square extends Thread{
    int x;
    Square(int n){
        x=n;
    }
    public void run(){
        int sqr = x*x;
        System.out.println("Square of "+x+" is "+sqr);
    }
}
class Cube extends Thread{
    int x;
    Cube(int n){
        x=n;
    }
    public void run(){
        int sqr = x*x*x;
        System.out.println("cube of "+x+" is "+sqr);
    }
}
class Number extends Thread{
    public void run(){
        Random random = new Random();
        for(int i=0;i<5;i++){
            int randomInteger = random.nextInt(100);

            System.out.println("Random Integer generated : " + randomInteger);

            if(randomInteger%2==0){
                Square s = new Square(randomInteger);
                s.start();
            }else{
                Cube c = new Cube(randomInteger);
                c.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Cia3_Threads {
    public static void main(String[] args) {
        Number n = new Number();
        n.start();
    }
}

