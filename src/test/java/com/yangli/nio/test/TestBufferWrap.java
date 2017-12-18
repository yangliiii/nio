package com.yangli.nio.test;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * Created by Administrator on 2017/12/18.
 */
public class TestBufferWrap {

    public void myMethod(){

        //初始化缓冲区大小
        ByteBuffer buffer1 = ByteBuffer.allocate(10);

        //包装一个指定的数组
        byte array[] = new byte[10];
        ByteBuffer buffer2 = ByteBuffer.wrap(array);
    }
}
