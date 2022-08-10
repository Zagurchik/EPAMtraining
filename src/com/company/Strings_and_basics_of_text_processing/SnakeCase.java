package com.company.Strings_and_basics_of_text_processing;

//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
public class SnakeCase {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "camelCase";
        strings[1] = "toString";
        strings[2] = "isLowerCase";
        strings[3] = "charAt";
        strings[4] = "isEmpty";

        String [] snake_case = toSnake_case(strings);
        System.out.println(String.join(", ", strings));
        System.out.println(String.join(", ", snake_case));

    }

    public static String[] toSnake_case(String[] camelCase) {
        String[] snake_case = new String[camelCase.length];
        for (int i = 0; i < snake_case.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < camelCase[i].length(); j++) {
                char letter = camelCase[i].toCharArray()[j];
                if (Character.isLowerCase(letter)) {
                    stringBuilder.append(letter);
                } else {
                    stringBuilder.append('_');
                    stringBuilder.append(Character.toLowerCase(letter));
                }
            }
            snake_case[i]= stringBuilder.toString();
        }
        return snake_case;
    }
}
