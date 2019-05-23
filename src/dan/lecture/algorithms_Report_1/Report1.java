/*  
 *  Algorithm report
 *  Date    : 2019-03-19
 *  Dankook UNIV.
 *  Computer Science
 *  Oh Donggeon
 */

package dan.lecture.algorithms_Report_1;

import java.util.Scanner;

public class Report1 {

	public static void main(String[] args) {
		
		Scanner	input = new Scanner(System.in);
		int inputN;
		int[] num;
		
		System.out.println("32152661 ����Ʈ�����а� ������");
		
		System.out.print("n�� ���� �Է��Ͻÿ� : ");
		inputN = input.nextInt();
		num = new int[inputN];
		
		System.out.print(inputN + "���� ������ �Է��Ͻÿ� : ");
		for(int i = 0; i < inputN; i++) {
			num[i] = input.nextInt();
		}
		
		input.close();
		
		for(int i = 0; i < inputN; i++) {		//sort
			for(int j = i; j < inputN; j++) {
				if(num[i] > num[j]) {
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.print("�Է� ���� ���� ��� : ");
		for(int i = 0; i < inputN; i++) System.out.print(num[i] + " ");
		
		System.out.println("\n32152661 ����Ʈ�����а� ������");
	}
}
