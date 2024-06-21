

public class MultipleDimensionalArray {
    public static void main(String args[]){
        
        int nums [] [] = new int[3][4];

        for(int i=0;i<3;i++){
            for (int j=0;j<4;j++){

                nums[i][j] = (int)Math.random() * 10;
            }
        }

        for(int n[] : nums){
            for (int m : n){
                System.out.println(m + " ");
            }
            System.out.println();
        }
    }
}

