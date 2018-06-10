package com.newtech.vo;

public class CreditCardBean {

	private String card_id;
	private byte card_type;
	private int card_user_id;
	
	public String getCard_id() {
		return card_id;
	}
	public void setCard_id(String card_id) {
		this.card_id = card_id;
	}
	public byte getCard_type() {
		return card_type;
	}
	public void setCard_type(byte card_type) {
		this.card_type = card_type;
	}
	public int getCard_user_id() {
		return card_user_id;
	}
	public void setCard_user_id(int card_user_id) {
		this.card_user_id = card_user_id;
	}
}
