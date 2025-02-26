class Hello {

    public static void main(String[] args) {

        // #region simple array
        // int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // for (int i =0; i<a.length; i++) {
        // System.out.println("The array element is : "+a[i]);
        // }

        // for(int i : a) {
        // System.out.println("The elemetn is"+i);
        // }

        // System.out.println(a[8]);

        // #endregion simple array

        // #region 2D array
        int[][] myNumbers = new int [2][3];//{ { 1, 2, 3, 4 }, { 5, 6, 7 } };

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println("The element is : " + myNumbers[i][j]);
            }
        }

        // #endregion 2D array

    }

}