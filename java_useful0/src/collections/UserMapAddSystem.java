package collections;

import java.util.HashMap;
import java.util.Map;

public class UserMapAddSystem {

    private Map<String, User> users;

    public UserMapAddSystem() {
        users = new HashMap<>();
    }

    // users 접근, 데이터 추가 기능
    public void addUser(String name, String email) {
        // 1. map 자료구조에 넣어야함
        // 2. 키값 명시, User obj --> value
        // User user1 = new User(name, email);
        users.put(name, new User(name, email));
    }

    // users 접근, 전체 데이터 출력 기능
    public void printAllUser() {
        for (User u : users.values()) {
            System.out.println("u.toString() = " + u.toString());
        } // for
    }

    public static void main(String[] args) {
        UserMapAddSystem userMapAddSystem = new UserMapAddSystem();
        userMapAddSystem.addUser("Hong", "hong123@gmail.com");
        userMapAddSystem.addUser("Lee", "lee987@gmail.com");

        userMapAddSystem.printAllUser();
    } // end of main
} // end of class

class User {
    String name;
    String email;

    // Alt + Insert
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Alt + Insert
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

// 자료구조
// - 배열 :
// - 자바 컬렉션 프레임워크
// -- List / Set / Map
// - List : 순서있고 중복가능
// - Set : 주머니, 순서없고 중복 불가
// - Map : Pair; Key + value
// .