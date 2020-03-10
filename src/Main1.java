 import java.util.*;

    public class Main1 {
        public static int countNumberOf2s(int n) {
            // write code here
            int num=0;
            for(int i=0;i<=n;i++){
                String s=String.valueOf(i);
                int len=s.length();
                for(int j=0;j<len;j++){
                    if(s.charAt(j)=='2'){
                        num++;
                    }
                }
            }
            return num;
        }

        public static void main(String[] args) {
             int n= countNumberOf2s(20);
            System.out.println(n);
        }
    }
