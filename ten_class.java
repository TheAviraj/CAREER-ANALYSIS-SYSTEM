import java.util.Scanner;
public class ten_class {
    public void tenth_class(){
        Scanner ten = new Scanner(System.in);
        System.out.println("Enter your school name : ");
        String School = ten.nextLine();
        System.out.println("choose any one option \n 1--> Pass \n 2--> Fail");
        int opt_10=ten.nextInt();
        if (opt_10==1) {
            Scanner pass_10 = new Scanner(System.in);
            System.out.println("Enter your score :");
            double score_10 = pass_10.nextDouble();
            System.out.println("you are interested to do: \n 1 -->further study \n 2 -->job");
            int op = ten.nextInt();
            if (op == 1) {
                System.out.println("choose an option: \n1.Intermediate \n2 Diploma \n3.polytechnic \n4.paramedical courses \n5.ITI courses");
                int a1 = ten.nextInt();
                switch (a1) {
                    case 1: {
                        System.out.println("Intermediate is a General course which gives you the flexibility to do various graduation courses along with Engineering and Medical. " +
                                "\nMost of the schools and colleges accept all Class 10th passed students for enrolling in the Intermediate course. " +
                                "\nIf you opt to do Intermediate after class 10th then you will have several career paths. \n" +
                                "There are 5 groups mainly in Intermediate \n MPC - Maths Physics Chemistry for engineering roles \n BiPC - Biology Physics Chemistry  for medical roles\n CEC - Commerce Economics Civics for business roles" +
                                "\n MEC - Mathematics Economics Commerce for business roles \n HEC - History Economics Civics for arts ");
                        break;
                    }
                    case 2: {
                        System.out.println("Unlike Intermediate Courses, Diploma courses are specialized courses in a particular technical field. " +
                                "\nFor most of the college offering diploma courses, you should score a minimum of 50% marks to be eligible to do diploma courses." +
                                "\nIf you chose to do diploma courses after class 10th then " +
                                "\nyou will have several career path to follow such as:\n Diploma in Engineering\n" +
                                "Diploma in Hotel Management\n" +
                                "Diploma in Journalism\n" +
                                "Diploma in Education\n" +
                                "Diploma in Photography\n" +
                                "Diploma in Psychology\n" +
                                "Diploma in Elementary Education\n" +
                                "Diploma in Digital Marketing\n" +
                                "Diploma in Fine Arts\n" +
                                "Diploma in English\n" +
                                "Diploma in Fashion Designing\n" +
                                "Diploma in Graphic Designing\n" +
                                "Diploma in Web Development\n" +
                                "Diploma in Web Designing\n" +
                                "Diploma in Game Designing\n" +
                                "Diploma in Bakery & Confectionery\n" +
                                "Diploma in Hotel Reception & Book Keeping\n" +
                                "Diploma in Food Technology\n" +
                                "Diploma in Information Technology\n" +
                                "Diploma in Makeup and Beauty\n" +
                                "Diploma in Event Management\n" +
                                "Diploma in Business Management\n" +
                                "Diploma in Marine Engineering\n" +
                                "Diploma in Animation\n" +
                                "Diploma in Textile Designing\n" +
                                "Diploma in Leather Designing\n" +
                                "Diploma in Textile Engineering ");
                        break;
                    }
                    case 3: {
                        System.out.println("Admissions in polytechnic courses is through entrance examinations held by the state boards of technical education as well.\n" +
                                "The Polytechnical courses are : \n Diploma in Mechanical Engineering\n" +
                                "Diploma in Civil Engineering\n" +
                                "Diploma in Electrical Engineering\n" +
                                "Diploma in Computer Engineering\n" +
                                "Diploma in Electronics & Communication Engineering\n" +
                                "Diploma in Automobile Engineering\n" +
                                "Diploma in Aerospace Engineering\n" +
                                "Diploma in Biotechnology Engineering");
                        break;
                    }
                    case 4: {
                        System.out.println("Diploma courses after 10th in the paramedical range from healthcare up to technical field and the courses last from 6 months to 2 years is know as paramedical courses" +
                                "\n paramadical courses are :\nDiploma in hearing language and speech\n" +
                                "Diploma in Operation Theatre Technology \n" +
                                "Diploma in Medical Laboratory Technology\n" +
                                "Diploma in X-Ray Technology \n" +
                                "Diploma in Ophthalmic technology\n" +
                                "Diploma is ECG technology\n" +
                                "Diploma in physiotherapy \n" +
                                "Diploma in Radiography and Medical Imaging\n" +
                                " Diploma in anaesthesia technology\n" +
                                "Diploma in Dialysis Technology \n" +
                                "Diploma in Nursing Care Assistance \n" +
                                "Diploma in Medical Record Technology \n" +
                                "Diploma in Sanitary Inspection");
                        break;
                    }
                    case 5: {
                        System.out.println("Candidates seeking short-term job-oriented courses after passing class 10 board exams can apply for ITI courses after 10th class \n the ITI courses" +
                                "\nTool and Die Maker Engineering\n" +
                                "Draughtsman (Mechanical) Engineering\n" +
                                "Diesel Mechanic Engineering\n" +
                                "Fitter Engineering\n" +
                                "Motor Driving-cum-Mechanic Engineering\n" +
                                "Turner engineering\n" +
                                "Dress making\n" +
                                "Information Technology & E.S.M. Engineering\n" +
                                "Secretarial Practice\n" +
                                "Machinist Engineering\n" +
                                "Fruit and Vegetable Processing\n" +
                                "Mechanical Instrument Engineering\n" +
                                "Bleaching and Dyeing Calico Print\n" +
                                "Electrician Engineering\n" +
                                "Letterpress Machine Mender");
                        break;
                    }
                    default: System.out.println("Invalid Option !");
                }
            } else if (op == 2) {
                System.out.println("Enter your age:");
                int age = ten.nextInt();
                if (age>=18 & age<=65) {
                    System.out.println("The Jobs after 10th pass students are : \n constable" +
                            "\n Home Guards \n Driver \n Conductor \n Lift Operator \n Bus Driver" +
                            "\n Painter \n Forest Guard \n Sales man \n Sales Manager \n post man \n Staff nurse \n LIC agent");
                }
                else {
                    System.out.println("Sorry user! You are not eligible for doing job in accordance with the Constitution of India");
                }
            } else {
                System.out.println("Invalid Option!");
            }
        }
        else if (opt_10 == 2){
            System.out.println("Enter your age:");
            int age = ten.nextInt();
            if (age>=18 & age<=65){
                System.out.println("The Jobs for  10th fail students are : " +
                        "\n House Builder \n Driver \n Conductor \n Lift Operator \n Bus Driver" +
                        "\n Painter \n Forest Guard \n Sales man \n\t\t\tor\nSince your qualification is not that high," +
                        " we will suggest you to gain some practical experience \nlike in electrical work, plumbing, mechanical work," +
                        " \nas an office assistant, as a computer operator, etc for 6-12 months (like work without charging or do a practical certificate course)" +
                        " \nand then search the job");
            }
            else {
                System.out.println("Sorry user! You are not eligible for doing job in accordance with the Constitution of India");
            }
        }
        else{
            System.out.println("Invalid Option!");
        }
    }
}
