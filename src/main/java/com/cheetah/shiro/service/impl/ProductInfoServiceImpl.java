package com.cheetah.shiro.service.impl;

import com.cheetah.shiro.entity.ProductInfo;
import com.cheetah.shiro.mapper.ProductInfoMapper;
import com.cheetah.shiro.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: ProductInfoServiceImpl
 * @Description: TODO
 * @Date: 2020/9/27
 * @Author: cheetah
 * @Version: 1.0
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public List<ProductInfo> getProductInfoList() {
        return productInfoMapper.getProductInfoList();
    }
}
