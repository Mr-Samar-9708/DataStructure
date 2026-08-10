class Armstrong_Num {

    static boolean armstrongNumber(int n) {
        int size = 0;
		    int sum = 0;
		    int temp = n;

		    while (temp > 0) {
		    	size++;
			    temp = temp / 10;
		    }

		    temp = n;

		    while (temp > 0) {

			    int digit = temp % 10;
          int pow = 1;
			    for (int i = 0; i < size; i++) {
				      pow *= digit;
			    }

			    sum += pow;

			    temp = temp / 10;
		    }

		    return n == sum;
    }
}
