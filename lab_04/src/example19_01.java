package lr4;

public class example19_01 {
    public static void main(String[] args) {
        int height = 11;
        int width = 23;

        for (int i = 0; i < height; i++){

            for (int j = 0; j < width; j++){

                if (i == 0 || i == height - 1 || j == 0 || j == width - 1){
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }

            System.out.println();
        }
    }
}
