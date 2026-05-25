package day4.assignment;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("vivek").append("trainer").reverse().insert(2,"xyz").delete(3,7);
        System.out.println(sb);
    }
}
