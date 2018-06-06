class TwoD {
    public static void main(String[] args) {

        int table[][] = new int[4][5];

        for (int i=0; i<4;i++) {
            for (int t = 0; t < 5; t++) {
                table[i][t] = (i * 5) + t + 1;
                System.out.print(table[i][t] + "\t");
            }
            System.out.println();
        }

    }
}
