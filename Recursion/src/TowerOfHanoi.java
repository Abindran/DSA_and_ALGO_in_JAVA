public class TowerOfHanoi {

    public static void toh(int n,char from_rod,char to_rod,char aux_rod){
        if(n==1){
            System.out.println("Move the disk 1 from rod " + from_rod + " to rod "+ to_rod);
            return;
        }
        toh(n-1,from_rod,aux_rod,to_rod);
        System.out.println("Move the disk " + n + " from rod " + from_rod + " to rod "+ to_rod);
        toh(n-1,aux_rod,to_rod,from_rod);
    }

    public static void main(String[] args){
        int n = 4;
        toh(n,'A','B','C');
    }
}
