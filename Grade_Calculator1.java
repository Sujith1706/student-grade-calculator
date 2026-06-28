import java.util.*;
import java.io.*;


public class Grade_Calculator1{
    
    public static void main(String[] args) throws Exception{
        int num_std;
        FileWriter fw=new FileWriter("results1.txt",true);
        PrintWriter pw=new PrintWriter(fw);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no of students: ");
        num_std=scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<num_std;i++){
        String std_name;
        double[] marks=new double[5];
        System.out.println("Enter student name: ");
        std_name=scanner.nextLine();
        System.out.println("=============================");
        pw.println("=============================");
        System.out.println("Student Report: "+std_name);
        pw.println("Student Report: "+std_name);
        System.out.println("=============================");
        pw.println("=============================");
        for(int k=0;k<marks.length;k++){
            double mark;
            do{
            System.out.println("Enter subject "+(k+1)+" marks : ");
            mark=scanner.nextDouble();
            if(mark<0 || mark>100){
                System.out.println("invalid input, type again.");
            }
        }while(mark<0 || mark>100);
        marks[k]=mark;
        }
        scanner.nextLine();
        double total=0;
        for(int j=0;j<marks.length;j++){
            total=total+marks[j];
        }
        double avg=total/marks.length;
        String grade;
        boolean pass=true;
        for(int j=0;j<marks.length;j++){

            if(marks[j]>=85 && marks[j]<=100){
                grade="A";
            }
            else if(marks[j]>=70 && marks[j]<=84){
                grade="B";
            }
            else if(marks[j]>=50 && marks[j]<=69){
                grade="C";
            }
            else{
                grade="F";
                pass=false;
            }
            System.out.println("Subject "+(j+1)+" : "+marks[j]+" : Grade : "+grade);
            pw.println("Subject "+(j+1)+" : "+marks[j]+" : Grade : "+grade);
        }
        System.out.println("=============================");
        pw.println("=============================");
        System.out.println("Total marks: "+total);
        pw.println("Total marks: "+total);
        System.out.println("Average marks: "+avg);
        pw.println("Average marks: "+avg);
        System.out.println(pass?"Result : Pass":"Result : Fail");
        pw.println(pass?"Result : Pass":"Result : Fail");
        System.out.println("=============================");
        pw.println("=============================");
        }
        pw.close();
        

    }
}