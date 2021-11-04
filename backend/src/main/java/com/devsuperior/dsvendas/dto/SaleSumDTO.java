package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
    
    private String sellerName;
    private Double sum;

    public SaleSumDTO() {
    }

    public SaleSumDTO(Seller sellerName, Double sum) {
        this.sellerName = sellerName.getName();
        this.sum = sum;
    }

    public String getSellerName() {
        return this.sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSum() {
        return this.sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }
}
