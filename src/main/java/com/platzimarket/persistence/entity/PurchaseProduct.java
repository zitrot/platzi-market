package com.platzimarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")
public class PurchaseProduct {
    @EmbeddedId
    private PurchaseProductPK id;
    private Integer cantidad;
    private Double total;
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "purchase_id_compra", insertable = false, updatable = false)
    private Purchase purchase;

    @ManyToOne
    @JoinColumn(name = "product_id_producto" ,insertable = false, updatable = false)
    private Product product;

    public Product getProduct() {
        return product;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public PurchaseProductPK getId() {
        return id;
    }

    public void setId(PurchaseProductPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
