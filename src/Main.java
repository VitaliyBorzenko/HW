public class Main {
    public static void main(String[] args) {
/*
`Задание №13
        int[][] array = new int[3][2];
        array[0][0] = 10;
        array[0][1] = 20;
        array[1][0] = 30;
        array[1][1] = 40;
        array[2][0] = 50;
        array[2][1] = 60;
        int min =  array[0][0];
        int max =  array[0][0];
        for(int i = 0; i <  array.length; i++) {
            for (int j = 0; j <  array[0].length; j++) {
                if (min >  array[i][j]) {
                    min =  array[i][j];
                }
                if (max <  array[i][j]) {
                    max =  array[i][j];
                }
            }
        }
            System.out.print("Максимальный элемент "+max+" Минимальный элемент "+min);
 /*
Задание №12

        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println("");
        }


Задание 11

2)      int [][] array = {{10, 20},{40, 50}};
        boolean isSquare = false;
        for (int i = 0; i < array.length; i++) {
            if (array.length == array[i].length) {
                isSquare = true;
            }
        }
        System.out.println(isSquare);

1)
        int [][] array = {{10, 20, 30},{40, 50, 60}};
        boolean isSquare = false;
        for (int i = 0; i < array.length; i++) {
            if (array.length == array[i].length) {
                isSquare = true;
            }
        }
        System.out.println(isSquare);

Задание 10

        int [][] array = {{10, 20, 30},{40, 50, 60}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма всех элементов двумерного массива = "+sum);


Задание 9 - Честно говоря сутки сидел над заданием №9, так и не сделал)
        взял с интернета, впринципе примерно понятно что откуда берется,но сам бы так не сделал т.к. методы еще не проходили.
2)
        int[][] array = {
                {4, 2, 1},
                {2, 7, 2}
        };
        System.out.println("До изменения:");
        print_array(array);
        System.out.println("После изменения:");
        transpose(array);
    }

    private static void transpose(int[][] array) {

        int[][] newarray = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newarray[j][i] = array[i][j];
            }
        }

        print_array(newarray);
    }
    private static void print_array(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


1)
        int[][] array = {
                {10, 20, 30},
                {40, 50, 60}
        };
        System.out.println("До изменения:");
        print_array(array);
        System.out.println("После изменения:");
        transpose(array);
    }

    private static void transpose(int[][] array) {

        int[][] newarray = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newarray[j][i] = array[i][j];
            }
        }

        print_array(newarray);
    }
    private static void print_array(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

Задание №8
        Integer[] array = {1, 2, 3, 0, 4, 6};

        Arrays.sort(array, Comparator.reverseOrder());
        System.out.println(Arrays.toString(array));



Задание №7


        int[] array = {1, 3, -6, 23, 14, 2};
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min2 = min;
                min = array[i];
            } else if (array[i] < min2 && array[i] != min)
                min2 = array[i];
        }

        if (min2 != Integer.MAX_VALUE) {
            System.out.println("Второй по минимальности элемент в массиве: " + min2);
        } else {
            System.out.println("Второй по минимальности элемента нет: ");
        }
        System.out.println("Минимальный элемент в массиве " + min);






Задание №6
        int[] array = {1, 3, -6, 23, 14, 2};
        int n = 1;
        int m = 3;
        for (int i = 0; i < array.length; i++) {
            if (i >= n && i <= m) {
                System.out.println(array[i]);
            }
        }

Задание №5
        int[] array = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3;
        int m = 8;
        for (int i = 0; i < array.length; i++) {
            if (i >= n && i <= m) {
                System.out.println(array[i]);
            }
      }

Задание №4
2)
        int[] array = new int[6];
        array[0] = 1;
        array[1] = 3;
        array[2] = -6;
        array[3] = 23;
        array[4] = 14;
        array[5] = 2;
        int x = 5;
        for (int i=0; i < array.length; i++) {
            if (array[i] == x)
                System.out.println("Индекс искомого элемента массива - " + i);
        else {
            System.out.println("Элемент не найден ");
            break;
        }
        }

1)       int[] array = new int[6];
        array[0] = 1;
        array[1] = 3;
        array[2] = -6;
        array[3] = 23;
        array[4] = 14;
        array[5] = 2;
        int x = 23;
        for (int i=0; i < array.length; i++) {
            if (array[i] == x)
                    System.out.println("Индекс искомого элемента массива - " + i);
                }



Задание №3
2)
        int[] array = {1, 3, -6, 23, 14, 2};
        int x = 0;
        boolean y = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != x) {
                y = false;
                System.out.println(y);
            }

        }
1)
        int[] array = {1, 3, -6, 23, 14, 2};
        int x = 23;
        boolean y = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == x) {
                y = true;
                System.out.println(y);
            }
        }


Задание №2

        int [] array = {1, 3, 4, 1, 5, 5};
        for (int i = 0; i < array.length; i++) {
           for (int j = i+1; j < array.length; j++) {
               if (array[i] == array[j]) {
                   System.out.println(array[i]);
               }
           }

        }



Задание №1

        int [] array = {1, 3, 4, 1, 5, 5};
        double sum = 0;
        double x =0;
        for (int i = 0; i < array.length; i++){
         sum += array[i];

        }
        x = sum / array.length;
        System.out.println(x);

*/
    }
}