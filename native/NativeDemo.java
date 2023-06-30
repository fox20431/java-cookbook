public class NativeDemo {
    // 声明本地方法
    public native void sayHello();

    // 加载本地库
    static {
        System.loadLibrary("libNativeDemo"); // 将NativeLibrary替换为你的本地库名
    }

    public static void main(String[] args) {
        NativeDemo demo = new NativeDemo();
        demo.sayHello();
    }
}
