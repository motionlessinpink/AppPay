package com.arquiteam.entities.payment;

import javax.persistence.*;

@Entity
@Table
public class Cellphone {
    @Id
    @GeneratedValue
    @Column
    private long idCellPhone;
    @Column
    private long cellphoneNumber;

    public Cellphone() {

    }

    public Cellphone(long cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public long getIdCellPhone() {
        return idCellPhone;
    }

    public void setIdCellPhone(long idCellPhone) {
        this.idCellPhone = idCellPhone;
    }

    public long getNumberCellPhone() {
        return cellphoneNumber;
    }

    public void setNumberCellPhone(long cellphoneNumber) {
        this.cellphoneNumber = Cellphone.this.cellphoneNumber;
    }
}
