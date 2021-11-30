package leetcode;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class maxNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums=new int[4];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < nums[i + 1]) {
                System.out.println(nums[i + 1] - nums[i]);
            } else System.out.println(-1);

        }
    }
}

