import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
    //1//
        int[] discovery = {300, 450, 120, 800, 540, 760, 310, 900, 500, 620};
        System.out.println(Tasks.highestBarrel(discovery));
    //2//
        int[] deliveries = {1200, 1800, 1500, 2000, 1750, 1400, 1650};
        System.out.println( Tasks.totalReport(deliveries));
    //3//
        int[] defects = {2, 8, 1, 0, 6, 7, 3, 9, 5};
        System.out.println(Tasks.defective(defects));
    //4//
        int[][] meds = {
                {5, 0, 0, 4, 6, 5, 4},
                {3, 1, 0, 2, 0, 1, 2},
                {0, 0, 0, 0, 0, 0, 0}
        };
        for (int[] arr : Tasks.consecutiveMedicines(meds)){
            System.out.println(Arrays.toString(arr));
        }
    //5//
        int[][] routes = {
                {80, 90, 120},
                {105, 110, 115},
                {70, 85, 95},
                {130, 140, 125}
        };
        System.out.println(Tasks.tooManyPassengers(routes));
    //6//
        int[] yields = {45, 60, 38, 55, 70, 42, 39, 48};
        System.out.println(Tasks.minimumYield(yields));
    //7//
        int[][] bp = {
                {120, 80},
                {150, 95},
                {138, 85},
                {145, 92},
                {160, 100}
        };
        for (int[] reading : Tasks.hypertensionCheck(bp)) {
            System.out.println(Arrays.toString(reading));
        }
    }

}