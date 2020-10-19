package com.arquiteam.entities.payment;


import javax.persistence.*;

@Entity
@Table
public class Card {
    @Id
    @GeneratedValue
    @Column
    private long cardId;
    @Column
    private String cardOwner;
    @Column
    private long cardNumber;
    @Column
    private short cardMonthExp;
    @Column
    private short cardYearExp;
    @Column
    private short cardCVC;
    @Column
    private long cardCellphoneNumber;

    public Card() {

    }

    public Card(String cardOwner, String cardNumber, String cardMonthExp, String cardYearExp, String cardCVC, String cardCellphone) {
        this.cardOwner = cardOwner;
        this.cardNumber = Long.parseLong(cardNumber);
        this.cardMonthExp = Short.parseShort(cardMonthExp);
        this.cardYearExp = Short.parseShort(cardYearExp);
        this.cardCVC = Short.parseShort(cardCVC);
        this.cardCellphoneNumber = Long.parseLong(cardCellphone);
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public short getCardMonthExp() {
        return cardMonthExp;
    }

    public void setCardMonthExp(short cardMonthExp) {
        this.cardMonthExp = cardMonthExp;
    }

    public short getCardYearExp() {
        return cardYearExp;
    }

    public void setCardYearExp(short cardYearExp) {
        this.cardYearExp = cardYearExp;
    }

    public short getCardCVC() {
        return cardCVC;
    }

    public void setCardCVC(short cardCVC) {
        this.cardCVC = cardCVC;
    }

    public long getCardCellphoneNumber() {
        return cardCellphoneNumber;
    }

    public void setCardCellphoneNumber(long cardCellphoneNumber) {
        this.cardCellphoneNumber = cardCellphoneNumber;
    }
}
