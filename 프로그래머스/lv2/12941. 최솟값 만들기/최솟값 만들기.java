import java.util.Arrays;
class Solution
{
    public int solution(int []A, int []B)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        int result = 0;

        int bIdx = B.length - 1;
        for (int i = 0; i < A.length; i++) {
            result += A[i] * B[bIdx--];
        }

        return result;
    }
}