package cn.how2j.springcloud.util.impl;

import cn.how2j.springcloud.util.IFactory;
import cn.how2j.springcloud.util.IProduct;

public class Factory implements IFactory {


    public IProduct createProduct() {
        return new Product();
    }
}
