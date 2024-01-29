package tasks.task29_01_1.t1;

public class Main {
        public static void main(String[] args) {
        String[] cities = {"Astana", "Almaty", "Aqtobe"};

        String json = "cities=[";
        StringBuilder builder = new StringBuilder(json);

        int counter = 1;
        for (String city : cities) {
            builder.append("{");
            builder.append(counter);
            builder.append("=");
            builder.append(city);
            builder.append("} ");
            counter++;
        }
        builder.append("]");
        json = builder.toString();
        System.out.println(json);
// cities=[{1=Astana}, {2=Almaty}, {3=Aqtobe}]

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<numbers.length; i++){
            stringBuilder.append(numbers[i]);
            stringBuilder.append(", ");
        }
//  [1, 2, 3, 4, 5, 6, 7, 8, 9]
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
            System.out.println("["+stringBuilder+"]");

    }
}
