package com.example.examen2and;

import java.io.Serializable;

public class produit implements Serializable {

    public produit() {
        this.idProduit = idProduit;
        this.Libelle = Libelle;
        this.Famille = Famille;
        this.PrixAchat = PrixAchat;
        this.PrixVente = PrixVente;
    }

    private int idProduit;
    private String Libelle;
    private String Famille;
    private Double PrixAchat;
    private Double PrixVente;

    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    public String getLibelle() {
        return Libelle;
    }

    public void setLibelle(String libelle) {
        Libelle = libelle;
    }

    public String getFamille() {
        return Famille;
    }

    public void setFamille(String famille) {
        Famille = famille;
    }

    public Double getPrixAchat() {
        return PrixAchat;
    }

    public void setPrixAchat(Double prixAchat) {
        PrixAchat = prixAchat;
    }

    public Double getPrixVente() {
        return PrixVente;
    }

    public void setPrixVente(Double prixVente) {
        PrixVente = prixVente;
    }


}
