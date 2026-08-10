class Disarium_Num {
    
    public static boolean isDisarium(int n) {

		int sum = 0;
		String s = Integer.toString(n);

		int size = s.length();

		for (int i = 0; i < size; i++) {

			int digit = Character.getNumericValue(s.charAt(i));

			sum += (int) Math.pow(digit, i + 1);

		}

		return sum == n;
	}
}
