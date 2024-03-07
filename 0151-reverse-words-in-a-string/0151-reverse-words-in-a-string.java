class Solution {
    public String reverseWords(String s) {
        return Arrays.asList(s.split(" ")).reversed().stream().filter(e -> !e.equals("")).collect(Collectors.joining(" "));
    }
}