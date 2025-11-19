package Lab_2;

public class Three_Sum_Demo {
    public static void main (String[] arg ){
        int[] list = {-1,-2,-3,-4,-5,-6,-7,-8,-9,10,1,2,3,4,5,6,7,8,9,10};
        Three_Sum test = new Three_Sum();
        int[] display = test.getThreeSum(list);
        if (display != null){
        for(int i = 0; i< display.length; i++) {
            System.out.print(display[i]+"  ");
        }
        }
        else {
            System.out.print("No match");
        }

    }
}
