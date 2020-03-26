package cn.likewindz.cloud.api.order.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author likeWind
 * @date created in 21:38 2020/3/26
 * @description
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {

    private String orderId;

    private Long userId;

    private String productName;

    private Double total;

}
