package com.bluescript.projectdetails.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "purchase_order")
public class PurchaseOrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int purchaseOrderId;
    @ApiModelProperty(required = true)
    @NotNull
    private String projectId;
    @ApiModelProperty(required = true)
    @NotNull
    private long orderNumber;
    private Date orderDate;
    @ApiModelProperty(required = true)
    @NotNull
    private Date orderValidTillDate;


    public PurchaseOrderEntity() {
    }

    public PurchaseOrderEntity(int purchaseOrderId, String projectId, long orderNumber, Date orderDate, Date orderValidTillDate) {
        this.purchaseOrderId = purchaseOrderId;
        this.projectId = projectId;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.orderValidTillDate = orderValidTillDate;
    }

    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderValidTillDate() {
        return orderValidTillDate;
    }

    public void setOrderValidTillDate(Date orderValidTillDate) {
        this.orderValidTillDate = orderValidTillDate;
    }

    @Override
    public String toString() {
        return "PurchaseOrderModel{" +
                "purchaseOrderId=" + purchaseOrderId +
                ", projectId=" + projectId +
                ", orderNumber=" + orderNumber +
                ", orderDate=" + orderDate +
                ", orderValidTillDate=" + orderValidTillDate +
                '}';
    }
}
