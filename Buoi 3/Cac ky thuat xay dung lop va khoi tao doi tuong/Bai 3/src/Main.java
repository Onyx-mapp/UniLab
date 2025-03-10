public class Main {
    public static void main(String[] args) {
        String s = "";
        StringBuffer sb = new StringBuffer();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s += "hello";
        }
        long end = System.currentTimeMillis();
        System.out.println("Thời gian cộng xâu: " + (end - start) + "ms");
        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sb.append("hello");
        }
        end = System.currentTimeMillis();
        System.out.println("Thời gian nối xâu với append: " + (end - start) + "ms");
    }
}