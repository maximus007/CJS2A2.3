
        class X
        {
        public static void main(String[] args) {
            
            
            int i, j,n=5; // decalaring the variables
          
            for (i = 1; i <= n; i++) { // no of times the loop will run
                for (j = 1; j <= n; j++) {
                    if (j == i) {
                        System.out.print("*");
                    } else if (j == n - (i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }