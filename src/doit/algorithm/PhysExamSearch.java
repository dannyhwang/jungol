package doit.algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class PhysExamSearch {

	static class PhyscData {
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator(); 
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 : (d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {                    // Ű�� ������������ ����
            new PhyscData("������", 162, 0.3),
            new PhyscData("�̼���", 168, 0.4),
            new PhyscData("Ȳ����", 169, 0.8),
            new PhyscData("������", 171, 1.5),
            new PhyscData("������", 173, 0.7),
            new PhyscData("����", 174, 1.2),
            new PhyscData("���ؼ�", 175, 2.0),
        };
        System.out.print("Ű�� �� cm�� ����� ã�� �ֳ���?: ");
        int height = stdIn.nextInt();                // Ŷ���� �о� ����
        int idx = Arrays.binarySearch(
                        x,                                 // �迭 x����
                        new PhyscData("", height, 0.0),    // Ű�� height�� ��Ҹ�
                        PhyscData.HEIGHT_ORDER             // HEIGHT_ORDER�� ���� �˻�
                     );

        if (idx < 0)
            System.out.println("�� ���� ��Ұ� �����ϴ�.");
        else {
            System.out.println("�� ���� x[" + idx + "]�� �ֽ��ϴ�.");
            System.out.println("ã�� ������: " + x[idx]);
        }
        stdIn.close();
    }
}