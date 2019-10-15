package com.example.demo.model;
import java.math.BigDecimal;

public class Claim {
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    String no;
    BigDecimal amount;
}
