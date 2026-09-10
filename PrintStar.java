public class PrintStar {

    public static void printStar(int n){

        for(int i = 0; i < n; i++){
            
            for(int j = 0; j <i; j++){
                System.out.print(" ");
            }

            if(i < n){
                System.out.print("*");
            }
            
            for(int k = 0; k < 2 * (n-i)-3; k++){
                System.out.print(" ");
            }
            
            if(i < n-1){
                System.out.print("*");
            }
            
            for(int j = 0; j <i; j++){
                System.out.print(" ");
            }

            System.out.println();
        }

        for(int i = 0; i < n-1; i++){

            for(int j = 0; j < ((n-1)-i)-1; j++){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int k = 0; k < 2*(i+1)-1; k++){
                System.out.print(" ");
            }
            System.out.print("*");

            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printStar(4);
    }
}
