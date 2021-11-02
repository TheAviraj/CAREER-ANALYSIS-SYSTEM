import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t>>> Welcome  to  Kalasalingam  career  plans <<<");
        System.out.println("\t\t\t          *** JAVA MINI PROJECT ***");
        System.out.println("\t\t\t      >>>  CAREER  ANALYSIS  SYSTEM  <<<\n");

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = in.nextLine();
        Scanner in1 =new Scanner(System.in);
        System.out.println("Enter your Date of Birth :");
        String age = in1.nextLine();
        Scanner a = new Scanner(System.in);
        System.out.println("Enter your email ID :");
        String mail = a.nextLine();
        System.out.println("Enter the phone number :");
        long phone = in.nextLong();
        System.out.println("Address :");
        Scanner Address = new Scanner(System.in);
        String Add = Address.nextLine();
        System.out.println("Enter your pin code :");
        int pin = in.nextInt();
        System.out.println("Choose your Qualification \n 1 --> 10th class \n 2 --> 12th class \n 3 --> under Graduation ");
        int opt = in.nextInt();
        if (opt == 1){
            ten_class a5=new ten_class();
            a5.tenth_class();
        }
        else if (opt == 2){
            Intermediate a6=new Intermediate();
            a6.Inter();
        }
        else if (opt == 3){
            Graduation a7=new Graduation();
            a7.Gradu();
        }
        else {
            System.out.println("invalid option!");
        }
        System.out.println("\nThis mini project done by : " +
                "\n--> IMMADISETTY BALA VENKATA RAMA SAI - 9920004051" +
                "\n--> PENDYALA RAJA YASWANTH - 992000103" +
                "\n--> JINKA THE AVIRAJ - 9920004055" +
                "\n\n Guide:" +
                "\n     Dr.SURYA SELWIN madam");
    }
}
