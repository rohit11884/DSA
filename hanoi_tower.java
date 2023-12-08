public class hanoi_tower {
    static void tower(int n,char start,char aux,char end){
        if(n==0){
            return;
        }
        tower(n-1,start,aux,end);
        System.out.println("Moving disk "+n+" from rod "+start+" to "+end);
        tower(n-1,aux,end,start);
    }
    public static void main(String[] args) {
        int N=4;
        tower(N,'A','C','B');
    }
}
