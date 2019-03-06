package com.group1;

public class Tasks {
    public static void main(String[] args) {
        int num = 123;
        String str = "Hello World";
        System.out.println(StringTransformer.transform(num));
        System.out.println(StringTransformer.individualize(str));
    }

}

class StringTransformer {

    static String transform(int num) {
        int temp = num;
        String code = "";
        do {
            code = (temp % 2) + code;
            temp /= 2;
            if (temp == 1) {
                code = 1 + code;
                break;
            }
        } while (true);
        return code;
    }

    static String individualize(String str) {
        StringBuilder code = new StringBuilder();
        int i = 0;
        while (i<str.length()) {
            if ( str.indexOf( str.charAt(i) ) ==  str.lastIndexOf( str.charAt(i) ) ) {
                code.append(str.charAt(i));
            }
            i++;
        }
        return code.toString();
    }
}