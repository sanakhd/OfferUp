package com.offerup.paymentservice.datatransferobjects;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Document(value="payments")
public class Payment {
	@Id
	private ObjectId paymentID;
	private String userID;
	private String cardNumber;
	private String cardCVV;
	private String cardExpirationDate;
	private String totalPrice;
	private String itemID;
	
	public Payment(String userID, String cardNumber, String cardCVV, String cardExpirationDate, String totalPrice, String itemID) {
		this.userID = userID;
		this.cardNumber = cardNumber;
		this.cardCVV = cardCVV;
		this.cardExpirationDate = cardExpirationDate;
		this.totalPrice = totalPrice;
		this.itemID = itemID;	
	}
	
	public String toString() {
		return String.format("{"
				+ "'userID'=%s," 
				+ "'cardNumber'=%s,"
				+ "'cardCVV'=%s,"
				+ "'cardExpirationDate'=%s,"
				+ "'totalPrice'=%s,"
				+ "'itemID'=%s"
				+ "}", userID, cardNumber, cardCVV, cardExpirationDate, totalPrice, itemID);	
	}
}
