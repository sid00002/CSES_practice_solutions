import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();
        int m = fs.nextInt();
        
        TreeMap<Long, Integer> ms = new TreeMap<>();
        
        for(int i=0; i<n; i++){
            Long x = fs.nextLong();
            ms.put(x, ms.getOrDefault(x, 0)+1);
        }
        
        while(m-- > 0 ){
            long x = fs.nextLong();
            
            Long best = ms.floorKey(x);
            if(best == null){
                System.out.println(-1);
            } else {
                System.out.println(best);
                
                int cnt = ms.get(best);
                if(cnt == 1) {
                    ms.remove(best);
                } else {
                    ms.put(best, cnt-1);
                }
            }
        }
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
