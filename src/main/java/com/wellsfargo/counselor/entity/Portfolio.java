package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {


    @Id
    @GeneratedValue()
    private Long portfolioId;

    @Id
    private Long clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Client() {}

    public Client(String creationDate) {
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() { return portfolioId; }

    public Long getClientId() { return clientId; }

    public String getCreationDate() { return creationDate; }

    public String setCreationDate(String creationDate) { this.creationDate = creationDate; }


}
