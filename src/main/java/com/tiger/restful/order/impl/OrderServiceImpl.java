package com.tiger.restful.order.impl;

import com.tiger.restful.order.mapper.TOrderMapper;
import com.tiger.restful.order.model.TOrder;
import com.tiger.restful.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private TOrderMapper orderMapper;

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void addOrder() throws Exception {
        TOrder order = new TOrder();
        order.setUid(1);
        order.setBid(1);
        orderMapper.insert(order);
    }

}
