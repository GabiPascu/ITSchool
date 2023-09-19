package session6.practice;

public class StringVsStringBuilder {

    public static void main(String[] args) {

        //using String - you create multiple strings

        String str = "";
        for (int index = 0; index < 10; index++) {
            str += "word" + index + " ";
        }
        System.out.println("Final string using String: " + str);

        //using StringBuilder - you create 1 string and keep on updating it

        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            stringBuilder.append("word").append(index).append(" ");
        }
        System.out.println("Final string builder using StringBuilder: " + stringBuilder);

        String name = "John";
        name.replace('o', 'a');
        System.out.println(name); // prints John - due to strings being immutable
    }

}

