import java.util.Scanner;

public class Week1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ----------------------
        while (true) {

            System.out.println("아기사자 수를 입력하세요.");

            int numOfLions;

            while (true) {
                String temp = sc.nextLine();
                boolean isInt = false;

                try {
                    Integer.parseInt(temp);
                    isInt = true;
                }
                catch (NumberFormatException ex) {
                }

                if (isInt){
                    numOfLions = Integer.parseInt(temp);
                    if (numOfLions < 5)
                    {
                        System.out.println("[오류] 5 이상의 값을 입력하세요.");
                    }
                    else break;
                }
                else System.out.println("[오류] 숫자만 입력할 수 있습니다.");
            }
            // ----------------------


            System.out.println("아기사자 이름을 입력해주세요.");

            String[] lions = new String[numOfLions];
            String lion;
            for (int i = 0; i < numOfLions; i++) {

                while (true) {
                    lion = sc.nextLine();
                    boolean isDuplicate = false;

                    if (lion.isEmpty()) {
                        System.out.println("이름이 비어있습니다. 다시 입력하세요.");
                        continue;
                    }

                    for (String s : lions) {
                        if (s != null && s.equals(lion)) {
                            System.out.println("중복입니다. 다시 입력하세요.");
                            isDuplicate = true;
                            break;
                        }
                    }

                    if (isDuplicate) continue;


                    break;

                }
                lions[i] = lion;
            }

            System.out.println("아기사자 명단을 최종적으로 출력합니다.");

            for (int i = 0; i < numOfLions; i++) {
                System.out.printf("%d. %s\n", i + 1, lions[i]);
            }

            System.out.println("==============================");
            System.out.println("프로그램을 종료하려면 'exit'를 입력하세요.");
            System.out.println("계속 아기사자를 등록하려면 'restart'를 입력하세요.");


            boolean flag = false;
            String cmd = "";

            while (!cmd.equals("exit") && !cmd.equals("restart")) {
                cmd = sc.nextLine();

                if (cmd.equals("exit")) {
                    System.out.println("아기사자 명단 관리 프로그램을 종료합니다.");
                    flag = true;
                    break;
                }
                else if (cmd.equals("restart")){
                    System.out.println("프로그램을 재시작합니다.");
                    break;
                }

                System.out.println("다시 입력해주세요.");
            }

            if (flag){
                break;
            }
        }
    }
}
