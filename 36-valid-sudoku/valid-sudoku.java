class Solution {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < board.length; j++) {
                char ch = board[j][i];
                if (Character.isDigit(ch))
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for (int value : map.values()) {
                if (value > 1)
                    return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < board.length; j++) {
                char ch = board[i][j];
                if (Character.isDigit(ch))
                    map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for (int value : map.values()) {
                if (value > 1)
                    return false;
            }
        }

        for (int startRow = 0; startRow < 9; startRow += 3) {
            for (int startCol = 0; startCol < 9; startCol += 3) {

                Set<Character> set = new HashSet<>();
                for (int i = startRow; i < startRow + 3; i++) {
                    for (int j = startCol; j < startCol + 3; j++) {
                        if (set.contains(board[i][j]))
                            return false;
                        if (Character.isDigit(board[i][j]))
                            set.add(board[i][j]);
                    }
                }

            }
        }

        return true;
    }
}