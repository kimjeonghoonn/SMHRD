
public class Ex05_�迭����2 {

	public static void main(String[] args) {
		
		int[] arr = {43,15,5,20,13,35,31,17,47,8};
		// arr�迭 �ȿ��� �ִ�(���� ū ��) ���
		// ���� ���� ����
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i<arr.length;i++) {
			//���� ������ ������ max�� arr�ȿ� �ִ� ���ڵ���
			//�ϳ��� �������鼭 �񱳸�
			// max���� ū���� �ִ� max ����
			if(max<arr[i]) {
				max=arr[i];
				}
			if(min>arr[i]) {
				min = arr[i];
			}
			}//��¹��� ���� max�� ���
		System.out.println(max);
		System.out.println(min);
		}
		

}

