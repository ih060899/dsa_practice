public class DemoMain {
    public static void main(String[] args) {
        System.out.println(numberOfBeams(new String[]{"011001", "000000", "010100", "001000"}));
        System.out.println(numberOfBeams(new String[]{"000", "111", "000"}));
    }

    public static int numberOfBeams(String[] bank) {
        int preCountRow = 0;
        int total = 0;
        for (String str : bank) {
            int currentRowCount = countRow(str);
            if (currentRowCount == 0)
                continue;
            total += preCountRow * currentRowCount;
            preCountRow = currentRowCount;
        }
        return total;
    }

    private static int countRow(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            count += ch - '0';
        }
        return count;
    }
}
