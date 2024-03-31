class Solution {
    public int romanToInt(String s) {
        char[] sa = s.toCharArray();
        char[] ca = {'I','V','X','L','C','D','M'};
        int[] arr = new int[sa.length];

        for (int i = 0; i < s.length(); i++) {
            switch (sa[i]) {
                case 'I' : {arr[i] = 1; break;}
                case 'V' : {arr[i] = 5; break;}
                case 'X' : {arr[i] = 10; break;}
                case 'L' : {arr[i] = 50; break;}
                case 'C' : {arr[i] = 100; break;}
                case 'D' : {arr[i] = 500; break;}
                case 'M' : {arr[i] = 1000; break;}
            }
        }

        int sum = 0;
        int prev = arr[arr.length-1];
        for (int i = arr.length-1; i >= 0; i--) {
            
            if (arr[i] < sum && arr[i] != prev) {
                sum -= arr[i];
            } else {
                sum += arr[i];
            }
            prev = arr[i];
        }
        return sum;
    }
}