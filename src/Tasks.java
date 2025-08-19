import java.util.ArrayList;
import java.util.List;

public class Tasks {
    //1//
     public static String highestBarrel(int[] data){
         int max = data[0];
         int pos = 0;
         for ( int i = 1; i < data.length; i++){
             if (data[i] > max){
                 max = data[i];
                 pos = i;
             }
         }
         return "Highest discovery: " + max + "barrels at position " + pos;
     }
     //2//
    public static String totalReport(int[] items){
         int sum = 0;
         for (int each : items){
             sum+=each;
         }
         if (sum > 10000){
             return "Total delivered: " + sum + "litres" + "ALERT: Capacity Exceeded!";
         }else {
             return "Total delivered: " + sum + "litres";
         }
    }
    //3//
    public static List<Integer> defective(int[] parts){
        List<Integer> result = new ArrayList<>();
        for (int each : parts){
            if (each > 5){
                result.add(each);
            }

        }
        return result;
    }
    //4//
    public static List<int[]> consecutiveMedicines(int[]... medicines){
         List<int[]> seen = new ArrayList<>();
         for ( int[] each : medicines) {
             for ( int i = 0; i < each.length; i++){
                 if (each[i] == 0 && each[i + 1] == 0){
                     seen.add(each);
                     break;
                 }
             }
         }
         return seen;
    }
    //5//
    public static List<Integer> tooManyPassengers(int[]... routes){
         List<Integer> result = new ArrayList<>();
         for(int[] route : routes){
             int sum = 0;
             for (int each : route){
                 sum+=each;
             }
             int average = Math.round((float) sum / route.length);
             if (average > 100){
                 result.add(average);
             }
         }
         return result;
    }
    //6//
    public static String minimumYield( int[] yield){
         int min = yield[0];
         int day = 0;
         for (int i = 1; i < yield.length; i++){
             if (yield[i] < min){
                 min = yield[i];
                 day = i;
             }
         }
         return "Lowest yield: " + min + "bags on day " + day;
    }
    //7//
    public static List<int[]> hypertensionCheck( int[]... readings){
         List<int[]> result = new ArrayList<>();
         for (int[] each : readings){
             if ( each[0] > 140){
                 result.add(each);
             }
         }
         return result;
    }

}
