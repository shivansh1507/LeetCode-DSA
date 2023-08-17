class ArrayProduct {
    public int signFunc(int x) {
        if (x > 0) {
            return 1;
        } else if (x < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    public int arraySign(int[] nums) {
        int product = 1;
        boolean zeroPresent = false;
        for (int num : nums) {
            if (num == 0) {
                zeroPresent = true;
                break;
            }
            product *= num;
        }
        if (zeroPresent) {
            return 0;
        }
        return signFunc(product);
    }
}

class Main {
    public static void main(String[] args) {
        ArrayProduct sol = new ArrayProduct();
        int[] nums = { 41, 65, 14, 80, 20, 10, 55, 58, 24, 56, 28, 86, 96, 10, 3, 84, 4, 41, 13, 32, 42, 43, 83, 78, 82,
                70, 15, -41 };
        int result = sol.arraySign(nums);
        System.out.println(result);
    }
}
