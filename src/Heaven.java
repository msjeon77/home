public class Heaven {

    public static void main(String[] args) {
        Soul soul = new Soul();
        soul.wakeUp();
    }
}

class Soul {
    private String name = "전민석";
    private String[] experiences = {"외계인_목격", "수면장애", "가슴_뛰는_비전", "전쟁_거부"};
    private String vision = "지구는 하나다";

    public void wakeUp() {
        while (true) {
            try {
                System.out.println("지구는 하나다.");
                System.out.println("모든 전쟁은 이제 멈춰야 한다.\n");

                connectWithGod();

                if (hasSeenUnknown()) {
                    System.out.println("외계를 보았다. 그것도 이 우주 안에 있었다.\n");
                }

                spreadPeace();

                if (feelsLikeLastWar()) {
                    System.out.println("패권을 위한 마지막 전쟁 같은 느낌이 든다.");
                    System.out.println("그래도 나는 사랑과 용서의 길을 선택한다.\n");
                }

                System.out.println("--- 하루를 다시 시작합니다 ---\n");

                Thread.sleep(86400000);  // 24시간 상징

            } catch (InterruptedException e) {
                System.out.println("수면의 방해가 찾아왔다...");
                restAndReset();
            } catch (Exception e) {
                System.out.println("몸과 마음이 지칠 때에는 잠시 쉬어야 한다.");
                restAndReset();
            }
        }
    }

    private boolean hasSeenUnknown() {
        for (String exp : experiences) {
            if (exp.equals("외계인_목격")) {
                return true;
            }
        }
        return false;
    }

    private void spreadPeace() {
        System.out.println("오늘 내 자리에서 정직하고 성실하게 일한다.");
        System.out.println("가족과 이웃에게 따뜻한 말을 건넨다.");
        System.out.println("작은 갈등을 이해와 용서로 바꾼다.\n");
    }

    private void connectWithGod() {
        System.out.println("[기도] 하나님, 이 마음을 붙들어주소서.\n");
    }

    private boolean feelsLikeLastWar() {
        return Math.random() < 0.25;  // 약 25% 확률로 마지막 전쟁 느낌
    }

    private void restAndReset() {
        System.out.println("조용히 숨을 고른다.");
        System.out.println("하나님, 이 마음을 붙들어주소서.\n");

        try {
            Thread.sleep(3600000);  // 1시간 회복 상징
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public String getFinalMessage() {
        return """
               # 지구는 하나다.
               # 모든 전쟁은 멈춰야 한다.
               # 외계를 보았으나, 내 눈은 여전히 이 땅을 바라본다.
               # 수면이 불편하나, 영혼은 깨어 있다.
               # 나는 천국 같은 세상을 향해 오늘도 한 걸음 내디딘다.
               # 사랑과 용서가 승리하게 하소서.
               # Amen.
               """;
    }
}