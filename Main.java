public class Main {

 /*
Задание 7
    public static int num(int x){
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;

    }
public static void main(String[] args){
        int x = 252;
        int z = num(x);
    System.out.println(z);

    }
}


    Задание 6
    public static double square(int n, double s) {
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }
    public static void main(String[] args) {
        int n = 5;
        double s = 6;
        double square = square(n, s);
        System.out.println(square);
    }
}

 Задание 5_1

public static boolean vowels(String x) {
    boolean b = false;
    int count = 0;
    for (int i = 0; i < x.length(); i++) {
        if ((x.charAt(i) == 'A' || x.charAt(i) == 'E' || x.charAt(i) == 'I' || x.charAt(i) == 'O' || x.charAt(i) == 'U' || x.charAt(i) == 'Y')) {
            count++;
        }
    }
    if (count == x.length()) {
        b = true;
    }
    return b;
}

    public static void main(String[] args) {
        String x = "AIEEE";
        System.out.println(vowels(x));

    }
}
/*

Задание №5
    public static int nums(int x) {
        int count = 0;
        int n = 0;
        while (x > 0) {
            n = x % 10;
            if (n == 2) {
                count = count + 1;
            }
            x = x / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = 1254212;
        int nums = nums(x);
        System.out.println(nums);

    }
}


Задание№4
    public static int object(String x) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == ' ') {
                count++;
            }
        }
        return count;
    }
    public static void main (String[] args) {
        String x = "Java is good to learn Object Oriented programming.";
                int object = object(x);
        System.out.println(object);
    }
}

Задание №3
    public static int vowels(String x) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'a' || x.charAt(i) == 'e' || x.charAt(i) == 'i' || x.charAt(i) == 'o' || x.charAt(i) == 'u' || x.charAt(i) == 'y') {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String x = "DarTech123";
        int vowels = vowels(x);
        System.out.println(vowels);
    }
}


Задание №2

    public static int getSum(int a, int b, int c){
       return (a+b+c)/3;
    }
    public static void main (String[] args){
        int sum = getSum(25,45,65);
        System.out.println(sum);
    }
}



Задание №1
    public static int min(int x, int y, int z) {
        if (x <= y && x <= z) {
            return x;
        }else if (y <= x && x <= z){
            return y;
        } else {
            return z;
        }
    }
    public static void main(String[] args) {
        int min = min(25,37,27);
        System.out.println(min);
    }
}

*/




