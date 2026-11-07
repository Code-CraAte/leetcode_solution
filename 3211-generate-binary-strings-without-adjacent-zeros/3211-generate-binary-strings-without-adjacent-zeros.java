class Solution {
    public void backtrack(int n, StringBuilder path,
                          List<String> result) {
        if (n == 0) {
            result.add(path.toString());
            return;
        }
        if (path.length() == 0 ||
            path.charAt(path.length() - 1) != '0') {
            path.append('0');
            backtrack(n - 1, path, result);
            path.deleteCharAt(path.length() - 1);
        }
        path.append('1');
        backtrack(n - 1, path, result);
        path.deleteCharAt(path.length() - 1);
    }
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, new StringBuilder(), result);
        return result;
    }
}