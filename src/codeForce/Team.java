package codeForce;

import java.util.*;
public class Team{
    public static boolean codingRound(int p, int v, int t){
             if((p+v+t) >= 2){
                      return true;
             }
             else{
                      return false;
             }
    }
    public static void main(String[] args){
             Scanner sc = new Scanner(System.in);
             
             int num = sc.nextInt();
             int result = 0;
             
             for(int i = 0; i<num; i++){
                      int p = sc.nextInt();
                      int v = sc.nextInt();
                      int t = sc.nextInt();
                      
                  
                      if(codingRound(p, v, t)){
                               result++;
                      }
             }
             System.out.println(result);
             
    }
}