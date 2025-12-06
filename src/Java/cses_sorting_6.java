import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();
        
        ArrayList<int[]> arr = new ArrayList<>(2*n);
        
        int p = n;
        while(n-- > 0 ){
            int a = fs.nextInt();
            int b = fs.nextInt();
            
            arr.add(new int[]{a, b});
            
        }
        
        Collections.sort(arr, (x, y) -> {
            if (x[0] != y[0]) return Integer.compare(x[1], y[1]);
            return Integer.compare(x[0], y[0]); 
        });
        
        int ans = 0;
        int endTime = -1;
        int i = 0;
        while(i < p){
            if(arr.get(i)[0]>=endTime){
                ans++;
                endTime = arr.get(i)[1];
                i++;
            } else{
                i++;
            }
        }
        
        System.out.println(ans);
    }

    // FAST SCANNER (super fast input)
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) {
            in = is;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            long val = 0;
            int c;
            do { c = read(); } while (c <= ' ');
            boolean neg = false;
            if (c == '-') {
                neg = true;
                c = read();
            }
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return neg ? -val : val;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}
