package Lab_2;

public class Three_Sum {
    public int[] getThreeSum(int[] list){
        for(int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                for (int k = j+1; k < list.length; k++) {
                    if (list[i] + list[j] + list[k] == 0) {
                        return new int[]{list[i], list[j], list[k]};
                    }
                }
            }
        }
        return null;
    }
    }

