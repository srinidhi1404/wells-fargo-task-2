package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long portfolioId;

    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name ="clientId")
    Client client;

    @Column(nullable = false)
    private Date creationDate;

    public Portfolio(long portfolioId, Client client, Date creationDate) {
        this.portfolioId = portfolioId;
        this.client = client;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
