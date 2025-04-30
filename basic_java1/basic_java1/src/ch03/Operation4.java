package ch03;

/**
 * 비교 연산자 2
 * true or false
 */
public class Operation4 {
    // main entry
    public static void main(String[] args) {

        // 게임 캐릭터 상태 설정
        int playerHealth = 50; // 플레이어의 체력
        int playerLevel = 10; // 플레이어의 레벨
        int enemyHealth = 30; // 적의 체력
        int requiredLevel = 15; // 특정퀘스트 수행가능한 최저레벨

        // 1. 플레이어의 체력이 적 체력보다 높은지 확인 --> T/F
        boolean isStronger = playerHealth > enemyHealth;
        System.out.println("is Stronger : " + isStronger);
        
        // 2. 플레이어의 체력이 위험 수준(20이하)인지 확인
        boolean isInDanger = playerHealth <= 20;
        System.out.println("player is in danger : " + isInDanger);
        
        // 3. 플레이어 레벨이 퀘스트 수행가능한 레벨이상인지 확인
        boolean canDoQuest = playerLevel >= requiredLevel;
        System.out.println("player can do quest : " + canDoQuest);

        // 4. 플레이어와 적의 체력이 같은지?
        boolean isSameHealth = playerHealth == enemyHealth;
        System.out.println("isSameHealth = " + isSameHealth);
        // 5. 플레이어 레벨이 특정 레벨과 같은지 확인?
        boolean isSameLevel = playerLevel == 10;
        System.out.println("isSameLevel = " + isSameLevel);
        // 6. 플레이어 레벨이 특정 레벨과 다른지 확인?
        boolean isDifferentLevel = playerLevel != 10;
        System.out.println("isDifferentLevel = " + isDifferentLevel);



    } // end of main
} // end of class