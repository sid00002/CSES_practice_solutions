import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();
        int m = fs.nextInt();
        int k = fs.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[m];
        
        for(int i=0; i<n; i++) a[i] = fs.nextInt();
        for(int i=0; i<m; i++) b[i] = fs.nextInt();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int cnt = 0;
        int i=0, j=0;
        while(i<n && j <m){
            if(Math.abs(a[i] -b[j]) <= k){
                cnt++;
                i++;
                j++;
            } else {
                if(a[i] - b[j] > k ) j++;
                else i++;
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
