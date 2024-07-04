package Assignments;

public class Permutations {
        static void permutation(String s, int m, int n){
            if(m>=n){
                System.out.println(s);
                return;
            }else {
                for(int i=m;i<=n;i++){
                    String s1=swap(s,m,i);
                    permutation(s1,m+1,n);
                }
            }
        }
        static String swap(String s, int i, int j) {
            char[] a = s.toCharArray();
            char x = a[i];
            a[i] = a[j];
            a[j] = x;
            return new String(a);
        }
        public static void main(String[] args) {
            permutation("abc",0,2);
        }
        }

