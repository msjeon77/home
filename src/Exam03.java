public class Exam03 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 7, 1, 4, 7, 3, 1, 9, 0, 7, 3};

        // 최대값을 저장할 변수 (초기값은 배열의 첫 번째 값)
        int max = nums[0];

        // 배열을 처음부터 끝까지 반복하면서 최대값 찾기
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println(max + "입니다.");  // 출력: 9
    }
}