import java.util.Scanner;
public class Graduation {
    public void Gradu(){
        Scanner ten = new Scanner(System.in);
        System.out.println("Enter your College/university name : ");
        String School = ten.nextLine();
        Scanner pass_10 = new Scanner(System.in);
        System.out.println("Enter your score :");
        double score_10 = pass_10.nextDouble();
        System.out.println("you are interested to do: \n 1 -->study \n 2 -->job");
        int op = ten.nextInt();
        if (op == 1) {
            System.out.println("choose an option which stream are you coming from  : \n1.Technical Science Graduates  \n2 Arts graduates \n3.Commerce gradutes \n4.Medical Science Graduates");
            int a1 = ten.nextInt();
            switch (a1) {
                case 1: {
                    System.out.println("Choose your department in B.Tech : \n1.Computer Science and Engineering\n2.Information Technology\n3.Industrial Engineering\n" +
                            "4.Software Engineering\n5.Mechanical Engineering\n6.Electronics and communication Engineering\n7.Computer Science\n8.Aerospace Engineering\n" +
                            "9.Electronics Engineering\n10.Architecture Engineering");
                    int a3 = ten.nextInt();
                    switch (a3){
                        case 1:{
                            System.out.println("For securing admission to any of the master’s program in Computer Science and Engineering, " +
                                    "\nthe aspirants should have successfully completed bachelor degree in their subjects with a minimum aggregate of 60%. " +
                                    "\nFor the various Master of Technology (M.Tech) courses, the candidate should have a valid GATE score.\n"+
                                    "Higher study options after B.Tech Computer Science:\n" +
                                    "Master of Technology in Computer Science\n" +
                                    "Master of Technology in Information Technology\n" +
                                    "Master of Technology in Information Security\n" +
                                    "Master of Technology in Software Engineering\n" +
                                    "Master of Technology in Distributed Computing\n" +
                                    "Master of Technology in Image Processing\n" +
                                    "Master of Technology in Industrial Management\n" +
                                    "Master of Technology in Network Engineering\n" +
                                    "Master of Technology in  Software analysis Engineering\n" +
                                    "Master of Technology in Electronics\n" +
                                    "Master of Technology in VLSI System Design\n" +
                                    "Master of Technology in Robotics\n" +
                                    "Master of Technology in Nano Technology\n" +
                                    "Master of Technology in Signal Processing\n" +
                                    "Master of Technology in Electronic Instrumentation\n" +
                                    "Master of Business Application (MBA)\n" +
                                    "M.Phil in Advanced Computer Science\n" +
                                    "M.Phil in Computer Science and Information Technology\n" +
                                    "Master of Science (MS) in Computer Science\n" +
                                    "Doctor of Philosophy (Ph.D)");
                            break;
                        }case 2:{
                            System.out.println("For securing admission to any of the master’s program in Information Technology, " +
                                    "\nthe aspirants should have successfully completed bachelor degree in their subjects with a minimum aggregate of 60%. " +
                                    "\nFor the various Master of Technology (M.Tech) courses, the candidate should have a valid GATE score.\n"+
                                    "Higher study options after B.Tech Computer Science:\n" +
                                    "Master of Technology in Computer Science\n" +
                                    "Master of Technology in Information Technology\n" +
                                    "Master of Technology in Information Security\n" +
                                    "Master of Technology in Software Engineering\n" +
                                    "Master of Technology in Distributed Computing\n" +
                                    "Master of Technology in Image Processing\n" +
                                    "Master of Technology in Industrial Management\n" +
                                    "Master of Technology in Network Engineering\n" +
                                    "Master of Technology in  Software analysis Engineering\n" +
                                    "Master of Technology in Electronics\n" +
                                    "Master of Technology in VLSI System Design\n" +
                                    "Master of Technology in Robotics\n" +
                                    "Master of Technology in Nano Technology\n" +
                                    "Master of Technology in Signal Processing\n" +
                                    "Master of Technology in Electronic Instrumentation\n" +
                                    "Master of Business Application (MBA)\n" +
                                    "M.Phil in Advanced Computer Science\n" +
                                    "M.Phil in Computer Science and Information Technology\n" +
                                    "Master of Science (MS) in Computer Science\n" +
                                    "Doctor of Philosophy (Ph.D)");
                            break;
                        }case 3:{
                            System.out.println("The candidates who have completed bachelor of technology course in Industrial Engineering. " +
                                    "\nThose who want to pursue Master of Engineering or Master of Technology courses should qualify Graduate Aptitude Test in Engineering (GATE)." +
                                    "\nMost of the technical institutions insist GATE score for the admission to various post graduation courses in engineering." +
                                    "\nCandidates who have completed any graduation can apply for any MBA course.\nThey should also qualify the concerned entrance test to get admission to the desired MBA course. " +
                                    "\nList of different higher studies options available after B.Tech in Industrial Engineering is given below\n" +
                                    "Master of Engineering Advanced Production System\n" +
                                    "Master of Engineering in Production Engineering\n" +
                                    "Master of Technology in Production Technology and Management\n" +
                                    "Master of Technology in Product Design and Manufacturing\n" +
                                    "Master of Technology in Production and Industrial Engineering\n" +
                                    "Master of Technology in Production Engineering and System Technology\n" +
                                    "Master of Technology in Production Engineering\n" +
                                    "Master of Technology in Production Management\n" +
                                    "Master of Technology in Production Technology\n" +
                                    "Master in Quality and Productivity Management\n" +
                                    "Master of Business Administration in Production and Materials Management\n" +
                                    "Master of Business Administration in Production Management\n" +
                                    "Master of Science in Production Engineering");
                            break;
                        }case 4:{
                            System.out.println("For securing admission to any of the master’s program in Software Engineering, " +
                                    "\nthe aspirants should have successfully completed bachelor degree in their subjects with a minimum aggregate of 60%. " +
                                    "\nFor the various Master of Technology (M.Tech) courses, the candidate should have a valid GATE score.\n"+
                                    "Higher study options after B.Tech Computer Science:\n" +
                                    "Master of Technology in Computer Science\n" +
                                    "Master of Technology in Information Technology\n" +
                                    "Master of Technology in Information Security\n" +
                                    "Master of Technology in Software Engineering\n" +
                                    "Master of Technology in Distributed Computing\n" +
                                    "Master of Technology in Image Processing\n" +
                                    "Master of Technology in Industrial Management\n" +
                                    "Master of Technology in Network Engineering\n" +
                                    "Master of Technology in Software analysis Engineering\n" +
                                    "Master of Technology in Electronics\n" +
                                    "Master of Technology in VLSI System Design\n" +
                                    "Master of Technology in Robotics\n" +
                                    "Master of Technology in Nano Technology\n" +
                                    "Master of Technology in Signal Processing\n" +
                                    "Master of Technology in Electronic Instrumentation\n" +
                                    "Master of Business Application (MBA)\n" +
                                    "M.Phil in Advanced Computer Science\n" +
                                    "M.Phil in Computer Science and Information Technology\n" +
                                    "Master of Science (MS) in Computer Science\n" +
                                    "Doctor of Philosophy (Ph.D)");
                            break;
                        }case 5:{
                            System.out.println("For getting admission in Master’s course in Mechanical Engineering, one should have pursued B.Tech in Mechanical Engineering. \n" +
                                    "The candidate should have secured more than 60% marks in graduation. \nCandidates must also have a valid GATE score for getting admission to the Masters program." +
                                    "\nHigher study options after B.Tech mechanical\n" +
                                    "Master of Technology in Aerodynamics\n" +
                                    "Master of Technology in Aerospace Propulsion\n" +
                                    "Master of Technology in Aerospace Structure\n" +
                                    "Master of Technology in Computer aided designing\n" +
                                    "Master of Technology in Design Engineering\n" +
                                    "Master of Technology in Dynamics & Control\n" +
                                    "Master of Technology in Hydraulics\n" +
                                    "Master of Technology in IC engines\n" +
                                    "Master of Technology in Industrial Engineering\n" +
                                    "Master of Technology in Machine Design\n" +
                                    "Master of Technology in Manufacturing Engineering\n" +
                                    "Master of Technology in Manufacturing Systems Engineering\n" +
                                    "Master of Technology in Mechanical Handling and Automation\n" +
                                    "Master of Technology in Mechanical Handling and Automation\n" +
                                    "Master of Technology in Mechanical Systems Design\n" +
                                    "Master of Technology in Metallurgical Engineering\n" +
                                    "Master of Technology in Production Engineering\n" +
                                    "Master of Technology in Refrigeration and air conditioning\n" +
                                    "Master of Technology in Thermal and Fluids Engineering\n" +
                                    "Master of Technology in Thermal Energy and Environmental Engineering\n" +
                                    "Master of Technology in Thermal Engineering\n");
                            break;
                        }case 6:{
                            System.out.println("B.Tech graduates in ECE can pursue desired M.E/M.Tech course in India after qualifying entrance tests like Graduate Aptitude Test in Engineering (GATE)," +
                                    "Tamil Nadu Common Entrance Test (TANCET) etc." +
                                    "\nAt the same time, they can seek direct admission to Post Graduate Diploma course. " +
                                    "\nForeign Universities considers the score obtained in Graduate Record Examination (GRE) and" +
                                    "\n  Test of English as a Foreign Language (TOEFL)/ International English Language Testing System (IELTS) for M.S admission." + "\n" +
                                    "Higher Study Options available in India\n" +
                                    "Master of Engineering in Digital Systems Engineering\n" +
                                    "Master of Engineering in Electronics and Telecommunication Engineering\n" +
                                    "Master of Engineering in Microwave and Radar Engineering\n" +
                                    "Master of Engineering in Electronics and Communication\n" +
                                    "Masters of Engineering in Micro Electronics Systems\n" +
                                    "Master of Engineering Electronic Product Design and Technology\n" +
                                    "Master of Technology in Advanced Communication Systems\n" +
                                    "Master of Technology in Digital Communication Engineering\n" +
                                    "Master of Technology in Digital Electronics and Communication\n" +
                                    "Master of Technology in Electronics Circuit and System\n" +
                                    "Master of Technology in Industrial Electronics\n" +
                                    "Master of Technology in Micro Electronics and Control Systems\n" +
                                    "Master of Technology in Network and Internet Engineering\n" +
                                    "Master of Technology in Communication Systems\n" +
                                    "Master of Technology in Electronics and Communication Engineering\n" +
                                    "Master of Technology in Electronics Design and Technology\n" +
                                    "Master of Technology in Information and Communication System\n" +
                                    "Master of Technology in Microwave Electronics\n" +
                                    "Master of Technology in Optics and Opto electronics\n" +
                                    "Master of Technology in Digital Electronics and Communication Systems\n" +
                                    "Post Graduate Diploma in Communication Design\n" +
                                    "Post Graduate Diploma in Photogrammetry and Remote Sensing\n" +
                                    "\nHigher Study Option available abroad\n" +
                                    "Master of Engineering in Electronics\n" +
                                    "Master of Engineering in Digital Electronics\n" +
                                    "Master of Engineering in Digital Media Engineering\n" +
                                    "Master of Engineering (by Research) in Photovoltaic and Renewable Energy Engineering\n" +
                                    "Master of Engineering in VLSI Systems\n" +
                                    "Master of Engineering in Industrial Electronics and Control\n" +
                                    "Master of Engineering in Semiconductor Materials and Devices\n" +
                                    "Master of Engineering in Micro/Nanofabrication and Micro Systems\n" +
                                    "Master of Engineering in Biomedical, Audio and Image Signal Processing\n" +
                                    "Master of Technology in Microsystems and Nanotechnology\n" +
                                    "Master of Science in Electro-Optics\n" +
                                    "Master of Science in Electronic Circuit and System\n" +
                                    "Master of Science in Electronic Warfare Systems Engineering\n" +
                                    "Master of Science in Robust, Large Scale and Multivariable Systems\n" +
                                    "Master of Science in Computer-Aided Design of Integrated Circuits and Systems\n" +
                                    "Master of Science in Sensors and Sensing Systems");
                            break;
                        }case 7:{
                            System.out.println("For securing admission to any of the master’s program in Computer Science, " +
                                    "\nthe aspirants should have successfully completed bachelor degree in their subjects with a minimum aggregate of 60%. " +
                                    "\nFor the various Master of Technology (M.Tech) courses, the candidate should have a valid GATE score.\n"+
                                    "Higher study options after B.Tech Computer Science:\n" +
                                    "Master of Technology in Computer Science\n" +
                                    "Master of Technology in Information Technology\n" +
                                    "Master of Technology in Information Security\n" +
                                    "Master of Technology in Software Engineering\n" +
                                    "Master of Technology in Distributed Computing\n" +
                                    "Master of Technology in Image Processing\n" +
                                    "Master of Technology in Industrial Management\n" +
                                    "Master of Technology in Network Engineering\n" +
                                    "Master of Technology in Software analysis Engineering\n" +
                                    "Master of Technology in Electronics\n" +
                                    "Master of Technology in VLSI System Design\n" +
                                    "Master of Technology in Robotics\n" +
                                    "Master of Technology in Nano Technology\n" +
                                    "Master of Technology in Signal Processing\n" +
                                    "Master of Technology in Electronic Instrumentation\n" +
                                    "Master of Business Application (MBA)\n" +
                                    "M.Phil in Advanced Computer Science\n" +
                                    "M.Phil in Computer Science and Information Technology\n" +
                                    "Master of Science (MS) in Computer Science\n" +
                                    "Doctor of Philosophy (Ph.D)");
                            break;
                        }case 8:{
                            System.out.println("Several Higher studies options are available for the graduates in B.Tech Aeronautical Engineering. " +
                                    "\nAfter obtaining any post graduation degree, these graduates can look for better opportunities in the aeronautical engineering field. \n" +
                                    "Some of the higher studies options available after B.Tech in Aeronautical Engineering are given below\n" +
                                    "Master of Engineering (M.E) in Aeronautical Engineering\n" +
                                    "Master of Technology (M.Tech) in Aerospace Engineering\n" +
                                    "Master of Technology (M.Tech) in Aeronautical Engineering\n" +
                                    "Master of Technology (M.Tech) in Aeronautics\n" +
                                    "Master of Science (M.S) in Aerospace Engineering\n" +
                                    "Master of Business Administration (MBA)\n" +"Candidates who wish to do Master of Engineering or Master of Technology course should qualify the Graduate Aptitude Test in Engineering (GATE)"+
                                    "\nThose who qualify this exam with high score can get admission to Master of Engineering or Master of Technology course in the subjects related to aeronautical engineering.");
                            break;
                        }case 9:{
                            System.out.println("Candidates who aspire to do Master degree courses in Electrical and Electronic Engineering should complete their B.Tech course in Electrical and Electronics Engineering." +
                                    "\nThey should also have valid GATE score to join such courses." +
                                    "\nCandidates who wish to do other Masters degree or higher diploma courses should complete their graduation and qualify the corresponding entrance test.\n" +
                                    "Some of the higher studies options available after B.Tech in Electrical and Electronics Engineering are given below.\n" +
                                    "Master of Technology in Power Electronics and Drives\n" +
                                    "Master of Technology in Power Systems\n" +
                                    "Master of Technology in Electrical Machines\n" +
                                    "Master of Technology in Control and Instrumentation\n" +
                                    "Master of Technology in Applied Electronics\n" +
                                    "Master of Technology in Embedded Systems\n" +
                                    "Master of Technology in VLSI Design\n" +
                                    "Master of Technology in Nanotechnology\n" +
                                    "Master of Technology in Nano Medical Sciences\n" +
                                    "Master of Technology in Remote Sensing\n" +
                                    "Master of Technology in Geo-information systems\n" +
                                    "Master of Business Administration\n" +
                                    "Master of Computer Application\n" +
                                    "Advanced Diploma in DSP System Design\n" +
                                    "Advanced Diploma in Real Time Operating Systems\n");
                            break;
                        }case 10:{
                            System.out.println("Those who have completed their bachelor degree in Architecture can appear for examinations such as CEED (Common Entrance Examination for Design), GATE etc" +
                                    "\n to pursue higher studies. Those who can obtain sufficient marks in CEED examination can expect admission in to higher study courses such as Master of Design." +
                                    "\n This Master of design, which is offered by IIT’s of Delhi and Mumbai, is a better study option for aspirants. " +
                                    "\nMaster of design is offered on subjects such as Industrial Design, Visual communication, Product design engineering etc\n" +
                                    "Aspirants with high score in GATE examination can get an admission in Master of Architecture program or M.Arch.\n" +
                                    "After completion of bachelor degree in Architecture, students can apply for Postgraduate Diploma Program in Design (PGDPD) offered by the National Institute of Design (NID) located in Ahmedabad. Other higher study options for B. Arch include:\n" +
                                    "Master of Technology in Urban and Regional Planning (M.Tech. - URP)\n" +
                                    "Master of Technology in Housing (M.Tech. - HSG)\n" +
                                    "Master of Technology in Environmental Planning (M.Tech – EP)\n" +
                                    "Master of Technology in Infrastructure Planning (M.Tech – IP) (Self financing)\n" +
                                    "Master of Technology in Construction of Project Management (M.Tech - CPM)");
                            break;
                        }
                        default:System.out.println("Invalid Option!");
                    }
                    break;
                }
                case 2: {
                    System.out.println("\nThe most preferred career option after doing B.Com is CA. CA exam is conducted by the Institute of Chartered Accountants (ICAI)" +
                            "\n and it has a three level module that are CPT, IPCC and Final CA. " +
                            "\nHowever, for B.Com Graduates, candidates are eligible to directly appear for IPCC exam. " +
                            "\nAnother option for B.Com Graduates is M.Com programme. " +
                            "\nIt is a two year programme and is offered by every recognized university. " +
                            "\nThis programme focuses on the study of Business, Accounting, Finance, Statistics, Economics, Marketing and Management.\n" +
                            "\nAnother option is MBA in Finance. " +
                            "\nThis is the most popular career option for B.com Graduates. " +
                            "\nIf you want to see yourself as a Chief Financial Officer of any company in future, " +
                            "\n this course will do the job for you." +
                            "\n CAT, XAT, MAT and MHCET are some of the popular entrance tests through" +
                            "\n which candidates are shortlisted for admission in prestigious MBA colleges.");
                    break;
                }
                case 3: {
                    System.out.println("Students after completing their B.Sc. can straightway go for" +
                            "\n M.Sc. programmes in fields of their choice. " +
                            "\nStudents who would like to go for Research and Doctorate level study, " +
                            "\nM.Sc. will open new doors of employment for them. \n" +
                            "Besides, B.Sc. students can also opt for MBA programmes to boost their career in the field of management." +
                            "\nNow-a-days, MBA courses are offered with specializations in Hospital Management, IT Management and Laboratory Management, " +
                            "\n which will be an ideal course module for Science Graduates.\n" +
                            "Moreover, B.Sc. students can also do B.Ed and move into the teaching profession.");
                    break;
                }
                case 4:{
                    System.out.println("Completing your degree, \nyou can choose from various career options and job opportunities as well as courses for higher studies. " +
                            "\nThe best courses after Graduation are :\n MD (Doctor of Medicine), \nMasters in Hospital Administration, \nMS in Clinical Pathology, " +
                            "\nMasters in Public Health, \nMTech in Biomedical Engineering, \nBiological Sciences and " +
                            "\ndiploma courses in Sports Medicine, Pediatrics, Psychology, Occupational Health, etc. " +
                            "\nYou can also find various alternative career options after Graduation like Teaching, Clinical Forensics, Medical Researcher, Academic Medicine, to name a few.");
                    break;
                }
                default:{ System.out.println("Invalid Option !");}
            }
        } else if (op == 2) {
            System.out.println("Enter your age:");
            int age = ten.nextInt();
            if (age>=18 & age<=65){
                System.out.println("choose an option which stream are you coming from  : \n1.ARTS Graduates  \n2 Medical Science Graduates\n3.COMMERCE Graduates \n4. Technological Science Graduates");
                int a2 = ten.nextInt();
                switch (a2) {
                    case 1: {
                        System.out.println("There are lots of lucrative job prospects for Arts Graduates. " +
                                "\n The first being Government jobs in Banking, Agriculture, Central Secretariat, Railways and many more." +
                                "\n They conduct their separate entrance tests like IBPS and SSC exam." +
                                "\n Then, if you have good communication skills and personality traits," +
                                "\n you can join a BPO as Customer Service Associate or a Relationship Executive." +
                                "\n Another option for Arts Graduates with great personality and outgoing character is Public Relation." +
                                "\n This field offers great job prospects along-with lucrative salaries." +
                                "\n If you are good in writing," +
                                "\n  you can join any media house as a Sub-Editor or an Ad Agency as a Copywriter.\n");
                        break;
                    }
                    case 2: {
                        System.out.println("\n" +
                                "There are plenty of job opportunities for Science Graduates." +
                                "\n Science Graduates can find jobs in Education Institutes, Space Research Institutes, Hospitals, Health Service Providers," +
                                "\n Chemical Industries, Testing Laboratories, Geological Survey Institutes and many more right after completing their Graduation." +
                                "\n Apart from technical fields, Science Graduates can also work in Marketing, Business and other Research Field as well." +
                                "\n Science Graduates can work as Medical Representative, Consultant, Junior Clinical Research Engineer, Teachers and many more.");
                        break;
                    }
                    case 3: {
                        System.out.println("After doing B.Com, you can apply in any company for the post of Accountant." +
                                "\n Every company needs an accountant to maintain the balance sheet of their business." +
                                "\n If you have good in knowledge in Cost Accounting, Basic Principles of Accounting and Management Accounting," +
                                "\n you can easily find a job in the financial sector.\n" +
                                "You can also find job as an auditor, junior financial analyst, tax accountant, business analyst in areas" +
                                "\n  such as business consultancy, industrial houses and public accounting firms.\n");
                        break;
                    }
                    case 4: {
                        System.out.println("Choose your department in B.Tech : \n1.Computer Science and Engineering\n2.Information Technology\n3.Industrial Engineering\n" +
                                "4.Software Engineering\n5.Mechanical Engineering\n6.Electronics and communication Engineering\n7.Computer Science\n8.Aerospace Engineering\n" +
                                "9.Electronics Engineering\n10.Architecture Engineering");
                        int b=ten.nextInt();
                        switch (b){
                            case 1:{
                                System.out.println("The candidates after completion of their graduation can secure a good job in both governmental as well as in private sector companies." +
                                        "\nFor government jobs, the candidate has to attend various entrance exams conducted by UPSC, SSC, etc." +
                                        "\nThe exams will be conducted every year.\n" +
                                        "\nThe Public Service Commission (PSC) conducts the entrance tests on the basis of the vacancies in various governmental firms." +
                                        "Jobs after B.Tech in Computer Science & Engineering\n" +
                                        "Professor\nComputer Programmer\n" +
                                        "Engineering Support Specialist\nR&D Applications Engineer\n" +
                                        "Academic Researcher\nVoice Engineer\n" +
                                        "Software Engineer");
                                break;
                            }
                            case 2:{
                                System.out.println("The candidates after completion of their graduation can secure a good job in both governmental as well as in private sector companies." +
                                        "\nFor government jobs, the candidate has to attend various entrance exams conducted by UPSC, SSC, etc." +
                                        "\nThe exams will be conducted every year.\n" +
                                        "Jobs after B.Tech in Information Technology\n" +
                                        "Information Technology Officer\nLecturer\n" +
                                        "Database Manager\nWeb Developer\n" +
                                        "Web Designer\nData Security Officer\n" +
                                        "Software Developer\nInformation Technology Engineer\n" +
                                        "Testing Engineer\nIT Coordinator\n" +
                                        "System Analyst\nApplications Developer\n" +
                                        "IT Technical Content Developer");
                                break;
                            }
                            case 3:{
                                System.out.println("The candidates after completion of their graduation can secure a good job in both governmental as well as in private sector companies." +
                                        "\nFor government jobs, the candidate has to attend various entrance exams conducted by UPSC, SSC, etc." +
                                        "\nThe exams will be conducted every year.\n" +"Jobs after B.Tech in Industrial Engineering\n" +
                                        "Ergonomist\nProcess Engineer\n" +
                                        "Quality Engineer\nIndustrial Manager\n" +
                                        "Operations Analyst\nManagement Engineer\n" +
                                        "Plant Engineer\nManufacturing Engineer\n" +
                                        "Quality Control Technician\nProject Engineer\n" +
                                        "Operations Manager\nFacilities Engineer\n" +
                                        "Industrial Engineering Technician");
                                break;
                            }
                            case 4:{
                                System.out.println("The candidates after completion of their graduation can secure a good job in both governmental as well as in private sector companies." +
                                        "\nFor government jobs, the candidate has to attend various entrance exams conducted by UPSC, SSC, etc." +
                                        "\nThe exams will be conducted every year.\n" +"Jobs after B.Tech in Software Engineering\n" +
                                        "Software Engineer\nMultimedia Display Software Engineer\n" +
                                        "Software Quality Engineer\nSoftware Testing Engineer");
                                break;
                            }
                            case 5:{
                                System.out.println("The candidates after completion of their graduation can secure a good job in both governmental as well as in private sector companies." +
                                        "\nFor government jobs, the candidate has to attend various entrance exams conducted by UPSC, SSC, etc." +
                                        "\nThe exams will be conducted every year.\n" +"Jobs after B.Tech in Mechanical Engineering\n" +
                                        "Mechanical Engineer\nProcess Development Technologist\n" +
                                        "Design Engineer\nResearcher\n" +
                                        "Analyst\nTester");
                                break;
                            }
                            case 6:{
                                System.out.println("The candidates after completion of their graduation can secure a good job in both governmental as well as in private sector companies." +
                                        "\nFor government jobs, the candidate has to attend various entrance exams conducted by UPSC, SSC, etc." +
                                        "\nThe exams will be conducted every year.\n" +"Jobs after B.Tech in Electronics and Communication Engineering\n" +
                                        "Electronics Technician\nField Technician\n" +
                                        "Test Technician\nFirstline Technician\n" +
                                        "Battery Test Technician ");
                                break;
                            }
                            case 7:{
                                System.out.println("The candidates after completion of their graduation can secure a good job in both governmental as well as in private sector companies." +
                                        "\nFor government jobs, the candidate has to attend various entrance exams conducted by UPSC, SSC, etc." +
                                        "\nThe exams will be conducted every year.\n" +"Jobs after B.Tech in Computer Science\n" +
                                        "Computer Engineer\nComputer Network Engineer\n" +
                                        "Researcher\nSoftware Engineer");
                                break;
                            }
                            case 8:{
                                System.out.println("The candidates after completion of their graduation can secure a good job in both governmental as well as in private sector companies." +
                                        "\nFor government jobs, the candidate has to attend various entrance exams conducted by UPSC, SSC, etc." +
                                        "\nThe exams will be conducted every year.\n" +"Jobs after B.Tech in Aerospace Engineering\n" +
                                        "Aerospace Engineer\nAerospace Designer Checker\n" +
                                        "Design Engineer\nManufacturing Engineer\n" +
                                        "Aircraft Production Manager\nMechanical Design Engineer\n" +
                                        "Assistant Technical Officer\nDevelopment Engineer");
                                break;
                            }
                            case 9:{
                                System.out.println("The candidates after completion of their graduation can secure a good job in both governmental as well as in private sector companies." +
                                        "\nFor government jobs, the candidate has to attend various entrance exams conducted by UPSC, SSC, etc." +
                                        "\nThe exams will be conducted every year.\n" +"Jobs after B.Tech in Electronics Engineering\n" +
                                        "Electronics Engineer\nElectrical Manager\n" +
                                        "Professor\nMaintenance Engineer\n" +
                                        "Power Electronics Engineer\nTest Engineer\n" +
                                        "Design Release Engineer\nExhibits Electronics Engineer\n" +
                                        "Product Engineer\nNetwork Specialist\n" +
                                        "Electronic Support Engineer\nSystems Developer");
                                break;
                            }
                            case 10:{
                                System.out.println("The candidates after completion of their graduation can secure a good job in both governmental as well as in private sector companies." +
                                        "\nFor government jobs, the candidate has to attend various entrance exams conducted by UPSC, SSC, etc." +
                                        "\nThe exams will be conducted every year.\n" +"Jobs after B.Tech in Architecture Engineering\n" +
                                        "Construction Estimator\nDrafter\n" +
                                        "Building Inspector\nTechnical Architect\n" +
                                        "Consultant\nConsulting Engineer\n" +
                                        "Professor\nConstruction Project Manager");
                                break;
                            }
                            default:System.out.println("Invalid Option!");
                        }
                    }
                }
            }else {
                System.out.println("Sorry user! You are not eligible for doing job in accordance with the Constitution of India");
            }
        }else {
            System.out.println("Invalid Option!");
        }
    }
}

