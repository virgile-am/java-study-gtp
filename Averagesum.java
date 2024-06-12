public class Averagesum {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            int arraylength = array.length;
            sum += array[i];
            average= (double) sum /arraylength;
        }
        System.out.println(sum);
        System.out.println(average);
        
    }
}
