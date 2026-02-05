// Sum and average of array elements
class Sum_Average {
    
    public static void main(String[] args){
        int[] a = {20,30,40,50,60};
        int sum = 0;
        
        for(int x:a){
            sum += x;
        }
        double average = (double) sum/a.length;
        
        System.out.println("Sum: "+ sum);
        System.out.println("Average: "+ average);
    }
}
