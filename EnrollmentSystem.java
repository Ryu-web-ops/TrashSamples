
import java.util.Scanner;
import java.util.ArrayList;

public class EnrollmentSystem {
    public void enroll() {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> stdata = new ArrayList<>();

        String students;
        stdata.add(0, " ");
        while (true) {
            System.out.println("1. Add student ||  2. List student || 3. Remove || 4. Search || 5. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter student name: ");
                    students = sc.nextLine();

                    stdata.add(students);
                    break;

                case 2:

                    //function to print all the students added
                    if (!stdata.isEmpty()) {
                        System.out.println("------------------Student list------------------");
                        System.out.println("No Data");
                    }else {
                        System.out.println("------------------Student list------------------");
                        int j = 0;
                        for (int i = 0; i < stdata.size(); i++) {
                            System.out.println(j++ + ". " + stdata.get(i));
                        }
                        System.out.println("");
                    }
                    break;

                case 3:
                    System.out.println("Enter the index of the student you wan to remove: ");
                    int remove = sc.nextInt();

                    if (remove <=0 || remove >= stdata.size()) {
                        System.out.println("Enter valid index");
                    }else {
                        stdata.remove(remove);
                    }
                //function to lis the remaining students
                    if (stdata.isEmpty()) {
                        System.out.println("------------------Student list------------------");
                        System.out.println("No Data");
                    }else {
                        int x = 0;
                        //System.out.println("--Student list---");
                        for (int i = 0; i < stdata.size(); i++) {
                            System.out.println(x++ + ". " + stdata.get(i));
                        }
                        System.out.println("");
                    }
                    break;

                case 4:
                    System.out.println("Enter the index of the student you want to search: ");
                    int search = sc.nextInt();
                    System.out.println("Search result: " + stdata.get(search));
                    break;
                default:
                    System.out.println("Thank you");
                    return;

            //switch close bracket
            }
            //while close bracket
        }

    }
}
