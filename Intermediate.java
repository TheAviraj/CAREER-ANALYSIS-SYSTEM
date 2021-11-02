import java.util.Scanner;
public class Intermediate {
    public void Inter(){
        Scanner ten = new Scanner(System.in);
        System.out.println("Enter your College name : ");
        String School = ten.nextLine();
        Scanner pass_10 = new Scanner(System.in);
        System.out.println("Enter your score :");
        double score_10 = pass_10.nextDouble();
        System.out.println("you are interested to do: \n 1 -->study \n 2 -->job");
        int op = ten.nextInt();
        if (op == 1) {
            System.out.println("choose an option which stream are you coming from  : \n1.Science  \n2 Arts \n3.Commerce");
            int a1 = ten.nextInt();
            switch (a1) {
                case 1: {
                    System.out.println(" choose your subjects: \n 1 -> Maths Physics Chemistry \n 2-> Biology Physics Chemistry \n 3-> Maths Biology Physics Chemistry");
                    int a3 = ten.nextInt();
                    switch (a3){
                        case 1:{
                            System.out.println("After completing 12th with science stream, there are a variety of options available for an undergraduate course." +
                                    "\n Students who have an interest in technical learning, they can choose engineering courses and the rest can choose from the courses listed below. \nBE/B.Tech- Bachelor of Technology\n" +
                                    "B.Arch- Bachelor of Architecture\n" +
                                    "BCA- Bachelor of Computer Applications\n" +
                                    "B.Sc.- Information Technology\n" +
                                    "BPharma- Bachelor of Pharmacy\n" +
                                    "B.Sc- Interior Design\n" +
                                    "Animation, Graphics and Multimedia\n" +
                                    "B.Sc- Applied Geology\n" +
                                    "BA/B.Sc. Liberal Arts\n" +
                                    "B.Sc.- Physics\n" +
                                    "B.Sc. Chemistry\n" +
                                    "B.Sc. Mathematics " +
                                    "\n Do your bachelor's degree in best colleges. write JEE Mains, JEE Adv exam to get seat in  IITs,NITs  \n For top college click the below link \n " +
                                    "https://engineering.careers360.com/colleges/ranking");
                            break;
                        }
                        case 2:{
                            System.out.println("You can do this courses: \n" +
                                    "B.Sc- Nursing\n" +
                                    "BPharma- Bachelor of Pharmacy\n" +
                                    "B.Sc- Interior Design\n" +
                                    "BDS- Bachelor of Dental Surgery\n" +
                                    "Animation, Graphics and Multimedia\n" +
                                    "B.Sc. – Nutrition & Dietetics\n" +
                                    "BPT- Bachelor of Physiotherapy\n" +
                                    "B.Sc- Applied Geology\n" +
                                    "BA/B.Sc. Liberal Arts\n" +
                                    "B.Sc.- Physics\n" +
                                    "B.Sc. Chemistry\n" +
                                    "You can opt for a Bachelor’s degree in Science, Physics or Chemistry according to your interest."+
                                    "\n Do your bachelor's degree in best colleges. write NEET, JIPMER exam to get free MBBS seats in AIIMS  \n For top colleges click the below link \n " +
                                    "https://medicine.careers360.com/colleges/ranking");
                            break;
                        }
                        case 3:{
                            System.out.println("You can do this courses \nBE/B.Tech- Bachelor of Technology\n" +
                                    "B.Arch- Bachelor of Architecture\n" +
                                    "BCA- Bachelor of Computer Applications\n" +
                                    "B.Sc.- Information Technology\n" +
                                    "BPharma- Bachelor of Pharmacy\n" +
                                    "B.Sc- Interior Design\n" +
                                    "Animation, Graphics and Multimedia\n" +
                                    "B.Sc- Applied Geology\n" +
                                    "BA/B.Sc. Liberal Arts\n" +
                                    "B.Sc.- Physics\n" +
                                    "B.Sc. Chemistry\n" +
                                    "B.Sc. Mathematics " +
                                    "\n Do your bachelor's degree in best colleges. write JEE Mains, JEE Adv exam to get seat in  IITs,NITs  \n For top engineering college click the below link \n " +
                                    "https://engineering.careers360.com/colleges/ranking" +"\nwrite NEET, JIPMER exam to get free MBBS seats in AIIMS  \n For top medical colleges click the below link \n " +
                                    "https://medicine.careers360.com/colleges/ranking");
                            break;
                        }
                        default:System.out.println("Invalid Option! 1");
                    }
                    break;
                }
                case 2: {
                    System.out.println("they will have less career opportunities than science and commerce, but after completing 12th from arts,\n there is a list of courses which will provide you good career opportunities.\n" +
                            "\n" +
                            "BBA- Bachelor of Business Administration\n" +
                            "BMS- Bachelor of Management Science\n" +
                            "BFA- Bachelor of Fine Arts\n" +
                            "BEM- Bachelor of Event Management\n" +
                            "Integrated Law Course- BA + LL.B\n" +
                            "BJMC- Bachelor of Journalism and Mass Communication\n" +
                            "BFD- Bachelor of Fashion Designing\n" +
                            "BSW- Bachelor of Social Work\n" +
                            "BBS- Bachelor of Business Studies\n" +
                            "BTTM- Bachelor of Travel and Tourism Management\n" +
                            "Aviation Courses\n" +
                            "B.Sc- Interior Design\n" +
                            "B.Sc.- Hospitality and Hotel Administration\n" +
                            "Bachelor of Design (B. Design)\n" +
                            "Bachelor of Performing Arts\n" +
                            "BA in History\n");
                    break;
                }
                case 3: {
                    System.out.println("Students who want to learn about financial and management, can opt commerce stream after 10th. " +
                            "\nFor commerce students, mathematics is an optional subject, thus students who have an interest in mathematics \nbut do not want to go with science stream can take commerce with maths.\n" +
                            "\n" +
                            "B.Com- Bachelor of Commerce\n" +
                            "BBA- Bachelor of Business Administration\n" +
                            "B.Com (Hons.)\n" +
                            "BA (Hons.) in Economics\n" +
                            "Integrated Law Program- B.Com LL.B.\n" +
                            "Integarted Law Program- BBA LL.B");
                    break;
                }
                default: System.out.println("Invalid Option !");
            }
        } else if (op == 2) {
            System.out.println("Enter your age:");
            int age = ten.nextInt();
            if (age>=18 & age<=65){
                System.out.println("choose an option which stream are you coming from  : \n1.ARTS  \n2 SCIENCE \n3.COMMERCE");
                int a2 = ten.nextInt();
                switch (a2){
                    case 1:{
                        System.out.println("The jobs for ARTs students are : \n Accountant \n Financial Analyst and Advisor\n" +
                                "Investment Banking Analyst\n Chartered Accountant\n Company Secretary\n Human Resources\n " +
                                "Tax Auditor and Consultant\n Event Manager\n Entrepreneur \n Banking jobs \n OR \n" +
                                "Since your qualification is not that high, we will suggest you to gain some practical experience " +
                                "\nlike in electrical work, plumbing, mechanical work, as an office assistant, as a computer operator, etc\n" +
                                " for 6-12 months (like work without charging or do a practical certificate course) and then search the job or start your own business.\n" +
                                " You have to see what you are good at and accordingly opt for the stream. Like some people are not formally educated but they are good in arts" +
                                " \nlike singing, painting, dancing or sports. " +
                                "\nThey can start coaching children in the subject of their strength. So you can decide accordingly.");
                        break;
                    }
                    case 2: {
                        System.out.println("The jobs for SCIENCE students are : \n Teacher \n Data Operator \n Sales Manager \n Government clerks \n LIC agent " +
                                "\n Head constable \n receptionist \n computer operator \n Data Entry \n real estate \n OR \n" +
                                "Since your qualification is not that high, we will suggest you to gain some practical experience " +
                                "\nlike in electrical work, plumbing, mechanical work, as an office assistant, as a computer operator, etc\n" +
                                " for 6-12 months (like work without charging or do a practical certificate course) and then search the job or start your own business.\n" +
                                " You have to see what you are good at and accordingly opt for the stream. Like some people are not formally educated but they are good in arts" +
                                " \nlike singing, painting, dancing or sports. " +
                                "\nThey can start coaching children in the subject of their strength. So you can decide accordingly.");
                        break;

                    }
                    case 3:{
                        System.out.println("The jobs for COMMERCE students are : \n Content Writer/Blogger \n SEO Analyst \n Fashion/Interior Designer "+
                                " \n Creative Director/Media Manager/Journalist \n Growth Hacker \n Social Worker \n Wildlife Photography \n Social Media Manager\n OR \n" +
                                "Since your qualification is not that high, we will suggest you to gain some practical experience " +
                                "\nlike in electrical work, plumbing, mechanical work, as an office assistant, as a computer operator, etc\n" +
                                " for 6-12 months (like work without charging or do a practical certificate course) and then search the job or start your own business.\n" +
                                " You have to see what you are good at and accordingly opt for the stream. Like some people are not formally educated but they are good in arts" +
                                " \nlike singing, painting, dancing or sports. " +
                                "\nThey can start coaching children in the subject of their strength. So you can decide accordingly.");
                        break;
                    }
                    default:System.out.println("Invalid option!");
                }
            }else {
                System.out.println("Sorry user! You are not eligible for doing job in accordance with the Constitution of India");
            }
        } else {
            System.out.println("Invalid Option!");
        }
    }
}

