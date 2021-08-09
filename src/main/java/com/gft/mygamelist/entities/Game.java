package com.gft.mygamelist.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nameGame;
	private BigDecimal priceGame;
	private String urlGame;
	private String urlCoverImage;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date datePurchase;

	public Date getDatePurchase() {
		return datePurchase;
	}

	public void setDatePurchase(Date datePurchase) {
		this.datePurchase = datePurchase;
	}

	@Enumerated(EnumType.STRING)
	private Plataform plataform;

	public Plataform getPlataform() {
		return plataform;
	}

	public void setPlataform(Plataform plataform) {
		this.plataform = plataform;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameGame() {
		return nameGame;
	}

	public void setNameGame(String nameGame) {
		this.nameGame = nameGame;
	}

	public BigDecimal getPriceGame() {
		return priceGame;
	}

	public void setPriceGame(BigDecimal priceGame) {
		this.priceGame = priceGame;
	}

	public String getUrlGame() {
		return urlGame;
	}

	public void setUrlGame(String urlGame) {
		this.urlGame = urlGame;
	}

	public String getUrlCoverImage() {
		return urlCoverImage;
	}

	public void setUrlCoverImage(String urlCoverImage) {
		this.urlCoverImage = urlCoverImage;
	}
}
