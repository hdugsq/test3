import java.util.Date;
public class Ap {
    public static void main(String arg[]) {
        Date date = new Date();
        System.out.println(A2.a(5));
       // ʹ�� toString() ������ʾ����ʱ��
        System.out.println(date.toString());
        String.format("�����ͱ�����ֵΪ " +
                   "%f, ���ͱ�����ֵΪ " +
                   " %d, �ַ���������ֵΪ " +
                   " %s", 1.1, 1, "qq");
        System.out.printf("�����ͱ�����ֵΪ " +
                   "%f, ���ͱ�����ֵΪ " +
                   " %d, �ַ���������ֵΪ " +
                   " %s", 1.1, 1, "qq");
        System.out.println('1'+0);
        System.out.println(Math.sin(Math.PI/2));
    }
}