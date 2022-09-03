/* git ith bit */
public class gitithbit {
    public static int gietithbitt(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;

        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        System.out.println(gietithbitt(10, 2));
    }

    
}
