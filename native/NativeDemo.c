#include "NativeDemo.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_NativeDemo_sayHello(JNIEnv *env, jobject obj) {
    printf("Hello from C/C++!\n");
}