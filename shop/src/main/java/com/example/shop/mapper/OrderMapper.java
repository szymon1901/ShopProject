package com.example.shop.mapper;

import com.example.shop.dto.OrderDto;
import com.example.shop.models.User;
import com.example.shop.models.UserOrder;


public class OrderMapper {

    public static OrderDto toDTO(UserOrder order){
        OrderDto orderDto = new OrderDto();
        User user = order.getUser();
        orderDto.setCustomerName(user.getName());
        orderDto.setCustomerEmail(user.getEmail());
        orderDto.setCustomerPhone(user.getPhoneNumber());
        orderDto.setAddress(orderDto.getAddress());
        orderDto.setTotalCost(order.getTotalCost());
        orderDto.setOrderData(order.getOrderData());
        orderDto.setStatus(order.getStatus());
        return orderDto;
    }
}
