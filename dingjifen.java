import java.util.*;
 
public class dingjifen {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
 
            // ��ʾ�û��������������
            System.out.println("��������������ޣ�");
 
            // �������������a,b,�п���̨����
            double a = input.nextDouble();
            double b = input.nextDouble();
 
            double sum = 0;
            // ��������ֳ�10000�����䣬����ԽС�����ԽС
            double e = cha(a, b, 10000.0);
 
            // ��ͣ�ѭ���ӵ�һ��������ӵ���10000��
            for (int j = 1; j <= 10000; j++) {
                double x = zhongjian(a, b, 10000.0, j);
                sum = sum + f(x);
 
            }
            System.out.print("f(x)=2*x*x+x�Ķ����֣�");
            System.out.println(sum * e);
 
        }
 
    // ���屻�������������޸�
    public static double f(double x) {
        return 2*x*x+x;
    }
 
    // �����i��������е�ֵ����������ֱ���
    public static double zhongjian(double a, double b, double n, int i) {
        return a + i * (b - a) / n;
    }
 
    // ����ÿ��С����ļ���������Χ�ֳ�n��������
    public static double cha(double a, double b, double n) {
        return (b - a) / n;
    }
}
