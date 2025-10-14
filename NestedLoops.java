public class NestedLoops {
    public static void main(String[] args) {

        System.out.println("===== 🔁 NESTED FOR LOOP =====");
        //  Nested For Loop (pattern printing)
        for (int i = 1; i <= 4; i++) {         
            for (int j = 1; j <= i; j++) {     
                System.out.print("* ");
            }
            System.out.println();              
        }

        /*
         Output:
         *
         * *
         * * *
         * * * *
        */

        System.out.println("\n===== NESTED WHILE LOOP =====");
         
        int a = 1;
        while (a <= 3) {                       
            int b = 1;
            while (b <= 3) {                    
                System.out.println("a = " + a + ", b = " + b);
                b++;
            }
            a++;
        }

        /*
         Output:
         a = 1, b = 1
         a = 1, b = 2
         a = 1, b = 3
         a = 2, b = 1
         a = 2, b = 2
         a = 2, b = 3
         a = 3, b = 1
         a = 3, b = 2
         a = 3, b = 3
        */

        System.out.println("\n====NESTED DO-WHILE LOOP =====");
        // Example 3️⃣: Nested Do-While Loop
        int x = 1;
        do {
            int y = 1;
            do {
                System.out.print("(" + x + "," + y + ") ");
                y++;
            } while (y <= 3);
            System.out.println();
            x++;
        } while (x <= 3);

        /*
         Output:
         (1,1) (1,2) (1,3)
         (2,1) (2,2) (2,3)
         (3,1) (3,2) (3,3)
        */

        System.out.println("\n=====MIXED NESTED LOOP (FOR + WHILE) =====");
        // Example 4️⃣: Mixed Nested Loops (combining types)
        for (int i = 1; i <= 3; i++) {
            int j = 1;
            while (j <= 2) {
                System.out.println("For Loop i=" + i + " | While Loop j=" + j);
                j++;
            }
        }

        /*
         Output:
         For Loop i=1 | While Loop j=1
         For Loop i=1 | While Loop j=2
         For Loop i=2 | While Loop j=1
         For Loop i=2 | While Loop j=2
         For Loop i=3 | While Loop j=1
         For Loop i=3 | While Loop j=2
        */

         
    }
}
