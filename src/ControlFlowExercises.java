import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//while
//        int i = 5;
//        while (i < 15) {
//            i++;
//            System.out.println(i);
//        }
        //do while loops
        int a = 0;
        int b = 100;
        int c = 2;
//        do {
//            System.out.println(a);
//            a += 2;
//        }while (a <= 100);
//        do{
//            System.out.println(b);
//            b -=5;
//        }while (b>= -10);
//        do{
//            System.out.println(c);
//            c *=2;
//        }while(c <= 100000000);

// for loops
        int num = 5;
//        for (int i = 100; i >= 1; i-=5 ){
//            System.out.println(i);

//            for(int i= 5; i<=15;i++) {
//                ;
//                System.out.println(i);

//            }
//        for(int i = 1; i<101; i++){
//            if(i % 15  ==0){
//                System.out.println("FizzBuzz");
//            }else if(i % 3 == 0){
//                System.out.println("Fizz");
//            }else if(i % 5 ==0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }
        Scanner scanner = new Scanner(System.in);

        final int nMax= 3;
        final double xMax=10;

      for(int i = 1;i<=nMax; i++ ){
          System.out.printf("%10d",i);
      }
        System.out.println();
      for(int i=1; i<nMax; i++) {
            System.out.printf("%10s", "x");
        }
      System.out.println();

      for(double x =1; x< xMax; x++){
          for(int i=1; i<=nMax;i++){
              System.out.printf("%10.0f", Math.pow(x,i));
          }
          System.out.println();
      }
        System.out.println("Please enter a while number");
        int first =Integer.parseInt(scanner.next());
        }
        }



