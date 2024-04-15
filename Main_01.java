public class Main_01 {
    public static void main(String[] args) {
        int rows = 7;
        
        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == i || k == (2 * i - 1) || k == 1 || k == (2 * rows - 1))
                    System.out.print("*");
                else
                    System.out.print("+");
            }
            System.out.println();
        }
        
        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == i || k == (2 * i - 1) || k == 1 || k == (2 * rows - 1))
                    System.out.print("*");
                else
                    System.out.print("+");
            }
            System.out.println();
        }
    }
}


// OUtput:

//                                         *       *       *
//                                 *       +       *       +       *
//                         *       +       +       *       +       +       *
//                 *       +       +       +       *       +       +       +       *
//         *       +       +       +       +       *       +       +       +       +       *
// *       +       +       +       +       +       *       +       +       +       +       +       *
//         *       +       +       +       +       *       +       +       +       +       *
//                 *       +       +       +       *       +       +       +       *
//                         *       +       +       *       +       +       *
//                                 *       +       *       +       *
//                                         *       *       *
//                                                 *