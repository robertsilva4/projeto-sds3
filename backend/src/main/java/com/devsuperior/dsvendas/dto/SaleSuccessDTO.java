package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class SaleSuccessDTO implements Serializable {
    private static final long serialVersionDTO = 1L;
    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        this.sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }
}
