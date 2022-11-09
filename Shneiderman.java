public class Shneiderman {
    public static void main(String[] args) {
        // Initialization variables
        int s = 0; 
        int m = 0;
        int h = 0;
    
        while (true){
            System.out.println(h*m*s);
            if (s>59){
                s = s+1;
            }
            else{
                s = 0;
                if (m < 59){
                    m = m+1;
                }
                else{
                    m = 0;
                    if (h < 23){
                        h = h+1;
                    }
                    else{
                        h = 0;
                    }

                }
            }
        }
    }
 
}
       