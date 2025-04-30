package ch09;

public class Bus {

    // 속성
    int busId; // 버스 ID
    String busType; // 버스 종류; 시내/시외/고속/마을/좌석...
    String company; // 운영회사

    // 생성자
    // 생성자가 여러개 있으면 생성자 오버로딩
    // 매개변수 1 받는 생성자
//    public Bus(int id) {
//        busId = id;
//    }
//
//    public Bus(int id, String type) {
//        busId = id;
//        busType = type;
//    }

    public Bus(int id, String type, String com) {
        busId = id;
        busType = type;
        company = com;
    }

    // 메서드
    public void showInfo() {
        System.out.println("--------------Status-----------------");
        System.out.println("Bus Id = " + busId);
        System.out.println("Bus Type = " + busType);
        System.out.println("Bus Company = " + company);
    }


} // end of class
