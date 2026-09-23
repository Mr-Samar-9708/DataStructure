public class LargeOddNum {

	public static String largeOddNum(String s) {
		int n = s.length();
		int ind = -1;

		for (int i = n - 1; i >= 0; i--) {

			if ((s.charAt(i) - '0') % 2 != 0) {
				ind = i;
				break;
			}

		}

		if (ind > -1) {
			int left = 0;
			for (int i = 0; i < n; i++) {
				if (s.charAt(i) != '0') {
					left = i;
					break;
				}
			}

			return s.substring(left, ind + 1);
		}

		return "";
	}

	public static void main(String[] args) {
		System.out.println(largeOddNum("0214638"));
	}
}
