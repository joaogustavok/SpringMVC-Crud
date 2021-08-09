package com.gft.mygamelist.services;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.gft.mygamelist.entities.Game;
import com.gft.mygamelist.entities.Plataform;


public class NewGameRequest {
	private String nameGame;
	private BigDecimal priceGame;
	private String urlGame;
	private String urlCoverImage;
	private String plataform;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date datePurchase;
	private Game game;
	
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
	public String getUrlCoverImage() {
		return urlCoverImage;
	}
	public void setUrlCoverImage(String urlCoverImage) {
		this.urlCoverImage = urlCoverImage;
	}

	public String getUrlGame() {
		return urlGame;
	}
	public void setUrlGame(String urlGame) {
		this.urlGame = urlGame;
	}
	public String getPlataform() {
		return plataform;
	}
	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}
	
	public Date getDatePurchase() {
		return datePurchase;
	}
	public void setDatePurchase(Date datePurchase) {
		this.datePurchase = datePurchase;
	}
	
	public Game toGame() {
		Game game = new Game();
		game.setNameGame(nameGame);
		game.setPriceGame(priceGame);
		game.setUrlGame(urlGame);
		game.setUrlCoverImage(urlCoverImage);
		game.setDatePurchase(datePurchase);
		game.setPlataform(Plataform.valueOf(plataform.toUpperCase()));
		return game;
	}
	
}
