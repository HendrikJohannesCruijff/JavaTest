import java.util.ArrayList;

public class GreedyAlgorithm {
    public static void main(String[] args) {

        ArrayList<Integer> CoinList = new ArrayList<>();
        CoinList.add(500);
        CoinList.add(100);
        CoinList.add(50);
        CoinList.add(10);
        int price = 4720;
        int totalCoinCount = 0;
        int coinNum = 0; // 코인수

        for (int i = 0; i < CoinList.size(); i++) {
            coinNum = price / CoinList.get(i); // 각 동전의 개수
            totalCoinCount += coinNum; // 총 동전의 개수
            price -= coinNum * CoinList.get(i); // 동전금액과 개수 곱해서 price에서 빼기
            System.out.println(CoinList.get(i) + "원" + coinNum + "개");
        }
        System.out.println("총 사용한 코인의 개수는 " + totalCoinCount + "개 입니다");
    }
}
