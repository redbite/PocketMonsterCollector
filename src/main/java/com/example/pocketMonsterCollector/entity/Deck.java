package com.example.pocketMonsterCollector.entity;

import java.util.HashMap;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "deck")
public class Deck {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int idDeck;
	private String name;
	/*
	 * Card: card data
	 * Integer: quantity of card existing in the deck (under quantity rules check)
	 */
//	private HashMap<Card, Integer> cards = new HashMap<>();
	private HashMap<String, Integer> cards = new HashMap<>();
	private String creator; //username
	private String notes;

	public Deck(int idDeck, String name, HashMap<Card, Integer> cards, String creator, String notes) {
		this.idDeck = idDeck;
		this.creator = creator;
		this.notes = notes;
		this.name=name;
	}

	public Deck() {
		super();
	}

	public int getIdDeck() {
		return idDeck;
	}

	public void setIdDeck(int idDeck) {
		this.idDeck = idDeck;
	}

	public HashMap<String, Integer> getCards() {
		return cards;
	}

	public void setCards(HashMap<String, Integer> cards) {
		this.cards = cards;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
