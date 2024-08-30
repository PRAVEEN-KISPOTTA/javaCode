package tree;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Solution {

  public static int sum(int arr[]){
     int n = arr.length;
     int su = 0;
     for(int i =0; i<n; i++){
         su = su + arr[i];
         
     }
     return su;
     
 }
 public static int[]takeArrayInput (){
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     int arr[] = new int [n];
     for(int i=0; i<n; i++ ){
         arr[i] = s.nextInt();
     }
     return arr;
 }

 public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int t = s.nextInt();
     while(t!=0){
         int arr[] = takeArrayInput();
         int result = sum(arr);
         System.out.println(result);
         t--;
     }
 }
}