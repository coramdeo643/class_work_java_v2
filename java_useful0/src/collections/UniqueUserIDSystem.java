package collections;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueUserIDSystem {

//### **예제 개념: 고유 사용자 ID 관리 시스템**
//**상황 설명**: 웹사이트에 접속하는 사용자의 ID를 관리하는 시스템을 개발합니다.
// 사용자 ID는 고유해야 하며 중복을 허용하지 않습니다.
// 시스템은 사용자가 로그인할 때마다 ID를 체크하고, 새로운 사용자 ID를 등록할 때 중복을 방지합니다.
    // 상황 : 사용자가 키보드로 입력한 ID 데이터를 많이 저장해야함
    // 고유한 값이어야함. 메모리상으로 관리할 예정
    private HashSet<String> registeredIDs;
    public UniqueUserIDSystem() {
        registeredIDs = new HashSet<>();
        // printAllIDs method test, sample data prepare
//        // TODO sample data preparation, will be deleted
//        registeredIDs.add("Hong");
//        registeredIDs.add("Teemo");
//        registeredIDs.add("Lee");
    }

    // 사용자 ID를 등록하는 메서드
    public boolean addUserID(String userID) {
        return registeredIDs.add(userID);
    }

    // 사용자 ID를 출력하는 메서드 직접 만들어보자 - 전체출력
    // 메서드 이름은 동사로 시작하는것이 권장사항
    public void printAllUserID () { // 1. 함수 이름 고민하기
        // System.out.println("List of all IDs : " + registeredIDs.toString());
        // registeredIDs 순회해서 콘솔창에 출력하고자한다
        // 초기화 for, Iterator 형변환해서 순회가능
        // HashSet 안에 요소가 아무것도 없다면
        if (registeredIDs.isEmpty()) {
            System.out.println("There is no UserID");
            return; // 실행의 제어권 반납
        }
        for(String id : registeredIDs) {
            System.out.println("id : " + id);
        }
        System.out.println("총 등록된 id 개수 : " + registeredIDs.size());
    }

    // 시스템을 실행할 메서드
    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("사용하고싶은 ID를 입력하세요(종료하려면 'exit' 입력 / ID 목록 보기 = 'list' 입력) : ");
            String input = scanner.nextLine().trim(); // .trim() 공백 제거

            // 사용자가 키보드에서 값을 넣지않고 바로 enter 누르는 경우
            // 빈 입력 처리
            if(input.isEmpty()) {
                System.out.println("ID 를 입력해주세요");
                continue; // 스킵하고 다시 진행
            }

            if ("list".equals(input)) {
                printAllUserID();
                continue;
            }
            if("exit".equals(input)) {
                System.out.println("System exit");
                break;
            } // end of if

            boolean isRegistered = addUserID(input);
            if(isRegistered) {
                System.out.println("새로운 사용자 ID 가 등록되었습니다");
            } else {
                System.out.println("이미 등록된 사용자 ID 입니다");
            }

        } // end of while
        scanner.close(); // 자원해제
    } // end of start()

    // main
    public static void main(String[] args) {
        UniqueUserIDSystem idSystem = new UniqueUserIDSystem();
        idSystem.start();
        // idSystem.printAllUserID();

    } // end of main
} // end of class
