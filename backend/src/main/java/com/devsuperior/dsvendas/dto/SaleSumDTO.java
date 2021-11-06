package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SaleSumDTO implements Serializable {
    private static final long serialVersionDTO = 1L;
    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }
}
