class ReversCharByRecursion {
    int left = 0;
    int right = 0;

    public ArrayList<Character> reverseString(ArrayList<Character> s) {
        
        if(right == 0){
            right = s.size() - 1;
        }

        if(left <= right){
            char temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right, temp);

            left++;
            right--;

            return reverseString(s);
        }else{
            return s;
        }

    }
}
