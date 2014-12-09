package spielwiese;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 7, -2, 4, 1, 8, 3, 5, 9};
		boolean tausch = true;

		while (tausch) {
			tausch = false;

			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					int temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
					tausch = true;
				}
			}
		}
		for (int y : array)
			System.out.println(y);
	}
}
