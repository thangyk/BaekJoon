import java.util.Arrays;
class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length - 1; i++) {
            String p = participant[i];

            for (int j = 0; j < completion.length; j++) {
                String c = completion[i];

                if (p.equals(c)) {
                    break;
                } else {
                    return p;
                }
            }
        }

        return participant[participant.length - 1];
    }
}