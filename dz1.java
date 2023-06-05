import java.util.Arrays;

public class dz1 {
    public static void main(String[] args) {

//       1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

//        System.out.println(divZero(10,0));
        int[] arr = new int[]{1,8,9,5};
//        System.out.println(outBounds(arr,10));
//        System.out.println(formatExc("AA"));

//    2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
//        public static int sum2d(String[][] arr) {
//            int sum = 0;
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < 5; j++) {
//                    int val = Integer.parseInt(arr[i][j]);
//                    sum += val;
//                }
//            }
//            return sum;
//        }
//        Выход за границу массива во внутреннем цикле, нецифровое значение в массиве



//    3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов
//    не равны, необходимо как-то оповестить пользователя.
        int[]arr1 = new int[]{10,20,30,40};
        int[]arr2 = new int[]{1,2,3,4,8,5};
        int[]arrResult = new int[arr1.length];
//        arrResult = getSubsrtactArrays(arr1,arr2);
//        System.out.println(Arrays.toString(arrResult));

//    * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//    каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов
//    не равны, необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
//    которое пользователь может увидеть - RuntimeException, т.е. ваше.

        int[]arrDivisible = new int[]{10,20,30,40};
        int[]arrDivider = new int[]{1,2,3,4};
        double[] arrayResult = new double[arrDivisible.length];
//        arrayResult = getNewArray(arrDivisible,arrDivider);
//        System.out.println(Arrays.toString(arrayResult));
    }

    public static double divZero(int a, int b){
        return a/b;
    }
    public static int outBounds(int[] arr,int index){
        return arr[index];
    }
    public static Integer formatExc(String a){
        return Integer.parseInt(a);
    }
    public static int[] getSubsrtactArrays(int[]firstArr, int[]secondArr){
        int []array = new int[firstArr.length];
        if (isnotEqualLengts(firstArr, secondArr)) {
            throw new RuntimeException("Длины массивов не равны");
        }
        for (int i = 0; i < firstArr.length; i++) {
            array[i] = firstArr[i] - secondArr[i];
        }
        return array;
    }

    public static double[] getNewArray(int[]firstArr, int[]secondArr) {
        double [] array = new double[firstArr.length];
        if (isnotEqualLengts(firstArr, secondArr)) {
            throw new RuntimeException("Длины массивов не равны");
        }
        if (isNullSecondArrElement(secondArr)) {
            throw new RuntimeException("Деление на 0");
        }
        for (int i = 0; i < firstArr.length; i++) {
            array[i] = firstArr[i] / secondArr[i];
        }
        return array;
    }

    private static boolean isnotEqualLengts(int[] firstArr, int[] secondArr) {
        if (firstArr.length != secondArr.length) return true;
        return false;
    }
    private static boolean isNullSecondArrElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) return true;
        }
        return false;
    }


}
