
public class ExceptionProblem3 {

	public static void main(String[] args) {
		int ar[] = {10, 20, 30};
		
		try {
			for (int i = 0; i <= ar.length; i++) {
				System.out.println("ar[" + i + "] : " + ar[i]);
			}
		}
		catch (Exception e) {
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		finally {
			System.out.println("=========================");
			System.out.println("���� �߻����ο� ������� ����˴ϴ�.");
		}
	}

}