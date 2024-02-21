package com.hihusky.stringconstruction;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("Hello, "); // 添加字符串
        stringBuffer.append("World!");  // 继续添加字符串

        String finalString = stringBuffer.toString(); // 将 StringBuffer 转换为 String
        System.out.println(finalString); // 输出：Hello, World!
    }
}
