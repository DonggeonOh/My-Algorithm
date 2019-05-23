/*
 *  Date    : 2019-04-07
 *  Dankook UNIV.
 *  Dept : Computer Science
 *  ID : 32152661
 *  Name : Oh Donggeon
 */

package dan.lecture.algorithms_Report_2;

public class Report2 {

	public static void main(String[] args) {
		MergeSortClass mergeTest;
		QuickSortClass1 quickTest;
		
		int[] n = {1000, 5000, 10000, 20000, 50000, 100000};    //������� ������ ���� ����
		int[] value;		//������ ���� ���� ����
		int nLength = n.length;

		long start, end;	//���α׷� ���۰� ��(��ȯ ���� long�̹Ƿ� long ����)
	
		int[] resultM = new int[6];
		int[] resultQ = new int[6];
		
		for(int i = 0; i < 6; i++) {
			resultM[i] = 0;
			resultQ[i] = 0;
		}
		System.out.println("\t1000\t5000\t10000\t20000\t50000\t100000");
		for(int k = 0; k < 10; k++) {
			System.out.print("Merge\t");
			for(int i = 0; i < nLength; i++) {
				value = new int[n[i] + 1];
				
				for(int j = 1; j < n[i] + 1; j++) {	//n�� ���ڸ�ŭ ������ �� ����ֱ� (1 ~ n[i]��ŭ ex-1~1000, 1~5000)
					value[j] = (int) (Math.random() * n[i]);
				}
				
				mergeTest = new MergeSortClass(value, n[i]);
				
				start = System.currentTimeMillis();	//����
				mergeTest.MergeSortCall();
				end = System.currentTimeMillis();	//��

				System.out.print(end - start + "\t");//�� ����ð� ���
				resultM[i] += end - start;
			}
			
			System.out.print("\nQuick\t");
			
			for(int i = 0; i < nLength; i++) {
				value = new int[n[i] + 2];
				
				for(int j = 1; j < n[i] + 1; j++) {
					value[j] = (int) (Math.random() * n[i]);
				}
				
				quickTest = new QuickSortClass1(value, n[i]);
				
				start = System.currentTimeMillis();
				quickTest.QuickSortCall();
				end = System.currentTimeMillis();

				System.out.print(end - start + "\t");
				resultQ[i] += end - start;
			}
			System.out.println();
		}
		
		
		for(int i = 0; i < 6; i++) {
			System.out.println();
			System.out.println(resultM[i] + " " + resultQ[i]);
		}
		System.out.println("\n32152661 ����Ʈ�����а� ������");
	}
}
