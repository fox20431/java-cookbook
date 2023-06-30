1. Get in `native` directory

    ```ps
    cd native
    ```
   
2. Generate the header file, `javah` is not support in JDK 11, use `-h` option of `javac` instead.

    ```ps1
    javac -h . NativeDemo.java
    ```
   
3. Generate the shared library, make sure the `JAVA_HOME` environment variable is set.

    ```ps1
    gcc -I"$env:JAVA_HOME\include" -I"$env:JAVA_HOME\include\win32" -shared -o libNativeDemo.dll NativeDemo.c
    ```
   
4. Compile and run the java program

    ```ps1
    javac NativeDemo.java
    java NativeDemo
    ```

5. If successful, it will output `Hello from C/C++!`.