package sample.java;

public class ChoseCaptain {
    public static void main(String[] args) {
        int m = 20;  // 一共7人
        int n = 3;  // 报到3淘汰
        int ans = choseCaptain(m, n);
        int ans2 = josephusIterate(m, n);
        System.out.println(ans);
        System.out.println(ans2);
    }

    /**
     * 模拟法，好久没写这么恶心的代码了
     *
     * @return 返回位置（索引）
     */
    public static int choseCaptain(int m, int n) {
        int length = m;
        int count = 1;
        int idx = 0;
        int[] array = new int[m];
        for (int i = 0; i < m; i++) {
            array[i] = 1;
        }
        while (length > 1) {
            count += 1;
            idx = getIdx(m, idx, array);

            if (count == n) {
                while (array[idx] == 0) {
                    idx += 1;
                    if (idx >= m) {
                        idx %= m;
                    }
                }
                array[idx] = 0;
                idx = getIdx(m, idx, array);
                count = 1;
                length -= 1;

            }
        }

        for (int i = 0; i < m; i++) {
            if (array[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    private static int getIdx(int m, int idx, int[] array) {
        idx += 1;
        if (idx >= m) {
            idx %= m;
        }
        while (array[idx] == 0) {
            idx += 1;
            if (idx >= m) {
                idx %= m;
            }
        }
        return idx;
    }

    /**
     * 约瑟夫环，去百度一下吧
     * @return 返回位置（索引）
     */
    public static int josephusIterate(int m, int n) {
        int p = 0;
        for (int i = 2; i <= m; i++) {
            p = (p + n) % i;
        }
        return p;
    }

}
