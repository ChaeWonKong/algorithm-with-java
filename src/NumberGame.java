public class NumberGame {
    public static void main(String[] args) {
        System.out.println(solution("one4seveneight"));
    }
    public static int solution(String s) {
        int answer = 0;
        String[] numberWords = new String[] {
                "zero",
                "one",
                "two",
                "three",
                "four",
                "five",
                "six",
                "seven",
                "eight",
                "nine"
        };
        for (int i = 0; i < numberWords.length; i++) {
            s = s.replace(numberWords[i], Integer.toString(i));
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
