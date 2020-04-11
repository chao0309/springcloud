package cn.how2j.springcloud.test;

import cn.how2j.springcloud.util.IFactory;
import cn.how2j.springcloud.util.IProduct;
import cn.how2j.springcloud.util.impl.Factory;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        CountDownLatch count = new CountDownLatch(5);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5);
        Semaphore semaphore = new Semaphore(5);
        System.out.println(Integer.MAX_VALUE);
//        ThreadPoolExecutor threadpool = new ThreadPoolExecutor();
    }
}
