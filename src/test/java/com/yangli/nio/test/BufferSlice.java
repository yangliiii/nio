package com.yangli.nio.test;

import java.nio.ByteBuffer;

/**
 * Test子缓冲区
 *
 * Created by Administrator on 2017/12/18.
 */
public class BufferSlice {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        for(int i = 0;i<buffer.capacity();i++){
            buffer.put((byte)i);
        }

        buffer.position(3);
        buffer.limit(8);

        //子缓冲区
        ByteBuffer buffer1 = buffer.slice();
        for (int i = 0; i < buffer1.capacity(); i++) {
            byte b = buffer1.get(i);
            b *= 10;
            buffer1.put(i,b);
        }

//        buffer.position(0);
//        buffer.limit(buffer.capacity());

        while(buffer.remaining()>0){
            System.out.print(buffer.get() + "\t");
        }

    }
}
