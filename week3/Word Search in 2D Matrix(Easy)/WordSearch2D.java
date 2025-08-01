public class WordSearch2D {

    public static boolean exists(char[][] matrix, String word) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Check each row
        for (int i = 0; i < rows; i++) {
            String rowString = new String(matrix[i]);
            if (rowString.contains(word)) {
                return true;
            }
        }

        // Check each column
        for (int j = 0; j < cols; j++) {
            StringBuilder colString = new StringBuilder();
            for (int i = 0; i < rows; i++) {
                colString.append(matrix[i][j]);
            }
            if (colString.toString().contains(word)) {
                return true;
            }
        }

        return false;
    }

    // Example usage
    public static void main(String[] args) {
        char[][] matrix = {
            {'F', 'A', 'C', 'I'},
            {'O', 'B', 'Q', 'P'},
            {'A', 'N', 'O', 'B'},
            {'M', 'A', 'S', 'S'}
        };

        String word = "FOAM";
        System.out.println("Word found: " + exists(matrix, word));  // Output: true
    }
}
