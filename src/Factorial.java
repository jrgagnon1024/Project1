

public class Factorial {

    public static void main(String[] args) {
        int factor = 10;
        interview();
        oK();
        mainStream(factor);
        System.out.println(hardwareChecker(factor, false));
        System.out.println(Japan(factor));
        System.out.println(factorial(factor));
    }
    static void interview(){
        System.out.println("Hello");
    }
    static void oK(){
        System.out.println("Goodbye");
    }
    static void mainStream(int factor){

        int [] numbers = new int[factor];
       int running_total = 0;
        for(int i = 0; i < factor; i++){
            numbers[i] = i + 1;
            running_total += numbers[i];

        }
        System.out.println(running_total);
    }
    public static int factorial(int number){
        if (number == 0){
            return 1;
        }
        else {
            return number * factorial(number -1);
        }

    }
    public static int Japan(int num){
        if (num == 0){
            return num;
        }
        else{
            System.out.println(num);

            return Japan(--num);
        }
    }
    public static boolean hardwareChecker(int number, boolean checker){


        
        if (number >= 1){
            checker = true;
            System.out.println(checker);

        }
            System.out.println(checker);

        return checker;



    }
}
