package com.hihusky.stringconstruction;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Hello, "); // 添加字符串
        stringBuilder.append("World!");  // 继续添加字符串

        String finalString = stringBuilder.toString(); // 将 StringBuilder 转换为 String
        System.out.println(finalString); // 输出：Hello, World!
    }
}
