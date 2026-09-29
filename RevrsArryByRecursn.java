public class RevrsArryByRecursn {

	public static int[] reversArrayByRecurs(int[] arr, int left, int right) {

		if (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			return reversArrayByRecurs(arr, left + 1, right - 1);
		} else {
			return arr;
		}
	}// Method-closing

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(reversArrayByRecurs(arr, 0, arr.length - 1)));
	}
}
