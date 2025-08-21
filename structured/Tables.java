package structured;

public class Tables {
    public static void main (String[] args) {
        for (char[] vowels : new char[][] { 
            {'a', 'e', 'i', 'o', 'u'},
            {'A', 'E', 'I', 'O', 'U'}
        }) {
            for (char vowel: vowels) {
                System.out.println(vowel + ", ");
            }
        }

        System.out.println("================= \n");
        for (int[][] tableData : new int[][][]{
            { {0,0,0}, {0,0}, {0} },
            { {}, {1,2,3,4} }
        }){
            for( int[] rowData: tableData){
                for (int value : rowData) {
                    System.out.println("value: " + value + ", ");
                }
            }
        }

        System.out.println("================= \n");
        boolean b = false;
        for (boolean x : new boolean[] { true, b, 5 + 6 > 5 - 6, }){
            System.out.println(x + ", ");
        }

        System.out.println("================= \n");
        int length = 3;
        for(boolean[] row : new boolean[length][2]){
            for (boolean el : row) {
                System.out.println(el);
            }
        }
    }
}
