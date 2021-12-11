package org.snut.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author curtis
 * @date 2021/12/11
 * @description
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto implements Serializable {

    private Long id;

    private String serial;
}
