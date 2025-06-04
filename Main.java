public class TableExample {

   
    public static void main(String[] args) {
       
        int[][] table = {
            {10, 30},
            {20, 40}  
        };

       
        System.out.println("  a   |   b");
        System.out.println("---------------");

       
        for (int i = 0; i < table[0].length; i++) {
            System.out.printf("%4d  |%4d%n", table[0][i], table[1][i]);
        }
    }
}
