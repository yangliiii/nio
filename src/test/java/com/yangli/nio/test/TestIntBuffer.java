package com.yangli.nio.test;

import java.nio.IntBuffer;

/**
 * Created by Administrator on 2017/12/18.
 */
public class TestIntBuffer {

    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);

        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i);
        }

        buffer.flip();
        //limit  position  capacity
        //判断当前位置和限制位置之间是否存在元素（default:0<=position<=limit<=capacity）
        while(buffer.hasRemaining()){
            System.out.print(buffer.get() + "\t");
        }
    }

}
