package ù��°����;

//10000������ ���� 200, 300, 500 �� ¥�� ������ �� �� �ִ� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class ù��°���� {
	public static void main (String args[]){
		int have = 10000; //������ �ݾ�
		int max_200 = have/200; //�����ݾ����� �� ������ �� �� �ִ� �ִ� ����
		int max_300 = have/300;
		int max_500 = have/500;

		for (int i = 0; i <= max_200; i++){
			for (int j = 0; j <= max_300; j++){
				for (int k = 0; k <= max_500; k++){
					if ((i * 200) + (j * 300) + (k * 500) == have)
						System.out.println ("(" + i + ", " + j + ", " + k + ")");
					
					else
						continue;
					
				}
			}
		}
	}
}