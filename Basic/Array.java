// Store and display the marks
public class Array{
    public static void main(String... args){
        int[] marks = {70,75,80,90,95};
        for(int i=0;i<marks.length;i++){
            // System.out.println("Student Marks: "+marks[i]);  
            System.out.println("Student " + (i+1) +":"+marks[i]);
        }
    }
    
}
