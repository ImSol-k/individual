package operator.bit;

public class SortingXOR {

	public static void main(String[] args) {
		
		int[] num = new int[6];
		
		System.out.println("============ 정렬전 =============================");
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 30) + 10;
			for (int j = 0; j < i; j++) {
				if(num[i] == num[j]) {
					i--;
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(" | " + num[i] + " | ");
		}
		System.out.println();
		
		System.out.println("============ 낮은순 =============================");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < i; j++) {
				if(num[i] < num[j]) {
					num[i] ^= num[j];
					num[j] ^= num[i];
					num[i] ^= num[j];
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(" | " + num[i] + " | ");
		}
		System.out.println();
		
		System.out.println("============ 높은순 ============================");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < i; j++) {
				if(num[i] > num[j]) {
					num[j] ^= num[i];
					num[i] ^= num[j];
					num[j] ^= num[i];
				}
			}
		}
		for (int i = 0; i < num.length; i++) {
			System.out.print(" | " + num[i] + " | ");
		}
	}

}
