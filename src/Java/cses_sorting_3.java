import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();
        int x = fs.nextInt();
        
        
        int[] a = new int[n];
        
        for(int i=0; i<n; i++) a[i] = fs.nextInt();
        
        Arrays.sort(a);
        
        int cnt = 0;
        int i=0, j=n-1;
        while(i <= j){
            long sum = a[i] + a[j];
            if(sum <= x){
                cnt++;
                i++;
                j--;
            } else {
                cnt++;
                j--;
            }
        }
        System.out.println(cnt);
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
