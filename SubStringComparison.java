class SubStringComparison {
    public static String getSmallestAndLargest(String s, int k) {
        String str = s.substring(0, k);
        String smallest = str;
        String largest = str;
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        // for breakin into sub string
        for (int i = 1; i < s.length() - 2; i++) {
            str = s.substring(i, k + i);

            if (str.compareTo(smallest) < 0) {
                smallest = str;
            }
            if (str.compareTo(largest) > 0) {
                largest = str;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        System.out.println("The ans is " + getSmallestAndLargest("welcometojava", 3));
    }
}