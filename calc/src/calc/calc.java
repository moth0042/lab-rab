package calc;
import java.util.Scanner;
public class calc {

	public static void main(String[] args) {
        System.out.println("������� ��������: ");
        System.out.println("1. ��������");
        System.out.println("2. ���������");
        System.out.println("3. ���������");
        System.out.println("4. �������");
        //�������� �. �.
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        
        System.out.println("������� ������ �����: ");
        int x = scanner.nextInt();
        System.out.println("������� ������ �����: ");
        int y = scanner.nextInt();
        
        int result = 0;
        
        if (operation == 1) {
            result = x + y;
        } else if (operation == 2) {
            result = x - y;
        } else if (operation == 3) {
            result = x * y;
        } else if (operation == 4) {
            result = x / y;
        }
        System.out.println("��������� = " + result);
        System.out.println("��������");
        
    }

}
