public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
//Задача 1
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        var sum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Сумма трат за месяц составила "+sum+ " рублей");

        //Задача 2
        var max=arr[0];
        var min=arr[0];
        for (int i = 0; i < arr.length; i++) {
           if (max<arr[i]){
               max=arr[i];
           }
           if (min>arr[i]){
               min=arr[i];
           }
        }
        System.out.println("Минимальная сумма трат за день составила "+min+" рублей. Максимальная сумма" +
                        " трат за день составила " + max +" рублей");
        //Задача 3
        float sum1=sum;
        var mean=(sum1/(arr.length));
        System.out.println("Средняя сумма трат за месяц составила "+ mean+" рублей");

        //Задача 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}