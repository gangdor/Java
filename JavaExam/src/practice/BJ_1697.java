package practice;
 
import java.util.Arrays;
import java.util.Scanner;
 
public class BJ_1697 {
 
    static int[][] a; // ������ķ� �̷���� ����׷���
    static int[] c; //check �湮 ���� �����ϴ� 1���� �迭
    static int[][] path; //i,j�� ���±� ���θ� �����ϴ� 2���� �迭
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int n = sc.nextInt();
        a = new int[n+1][n+1];
        c = new int[n+1];
        path = new int[n+1][n+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                a[i][j] = sc.nextInt();
            }
        }
         
         
        for(int i=1; i<=n; i++){
            dfs(i);
             
            for(int j=1; j<=n; j++){
                path[i][j] = c[j];
            }
            //���� Ž���� ���� ����
            Arrays.fill(c, 0);
        }
         
         
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(path[i][j]+" ");
            }
            System.out.println();
        }
 
 
    }
    private static void dfs(int v) {
        int n = a.length-1;
         
        for(int i=1; i<=n; i++){
             
            //v->i�� ���ִ� ���� �ְ�, �湮���� ���� ���
            if(a[v][i]==1 && c[i]==0){
                c[i] = 1; // �湮üũ
                dfs(i);
            }
        }
         
         
    }
 
}