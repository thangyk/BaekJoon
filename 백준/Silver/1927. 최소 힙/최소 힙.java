import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<Integer> list;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        list = new ArrayList<>();
        list.add(0);


        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x > 0) {
                list.add(x);
                int curIdx = list.size() - 1;
                while (curIdx > 1 && list.get(curIdx / 2) > list.get(curIdx)) {
                    int parentVal = list.get(curIdx / 2);
                    list.set(curIdx / 2, x);
                    list.set(curIdx, parentVal);

                    curIdx /= 2;
                }
            } else {
                sb.append(remove() + "\n");
            }
        }

        System.out.println(sb);
        br.close();
    }

    private static int remove() {
        if (list.size() == 1) {
            return 0;
        }

        int data = list.get(1);

        list.set(1, list.get(list.size() - 1));
        list.remove(list.size() - 1);

        int cur = 1;
        while (true) {
            int leftIdx = cur * 2;
            int rightIdx = cur * 2 + 1;
            int targetIdx = -1;

            if (rightIdx < list.size()) {
                targetIdx = list.get(leftIdx) < list.get(rightIdx) ? leftIdx : rightIdx;
            } else if (leftIdx < list.size()) {
                targetIdx = leftIdx;
            } else {
                break;
            }

            if (list.get(cur) < list.get(targetIdx)) {
                break;
            } else {
                int parentVal = list.get(cur);
                list.set(cur, list.get(targetIdx));
                list.set(targetIdx, parentVal);
                cur = targetIdx;
            }
        }

        return data;
    }


}
