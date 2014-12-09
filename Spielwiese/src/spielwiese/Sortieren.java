package spielwiese;

public class Sortieren {

	public void sortiere(int[] array) {

		boolean tausch = false;

		while (!tausch) {
			tausch = true;

			for (int i = 1; i < array.length; i++) {
				if (array[i] < array[i - 1]) {
					int temp = array[i];
					array[i] = array[i - 1];
					array[i - 1] = temp;
					tausch = false;
				}
			}
		}
	}
}
