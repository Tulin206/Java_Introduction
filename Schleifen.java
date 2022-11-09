public class Schleifen {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int i = 0, s = 0;
        while (i<n){
            i = i+1;
            s = s + 1/(i*i);
            System.out.println("i²:" +i*i+ ", 2i+1:" +2*i+1+ ", 1/(2i+1):" +1/2*i+1+ ", 1/i²:" +1/i*i+ ", s:" +s);
        }
    }
}
