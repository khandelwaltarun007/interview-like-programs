package com.programs;

public class CardNumberMasking {
	private String cardNumber;
	private String mask;

	public CardNumberMasking() {
		this.cardNumber = null;
		this.mask = null;
	}

	public CardNumberMasking(String cardNumber, String mask) {
		super();
		this.cardNumber = cardNumber;
		this.mask = mask;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public String cardMasking(CardNumberMasking masking) {

		int index = 0;
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < masking.getMask().length(); i++) {
			char c = masking.getMask().charAt(i);
			if (c == '#') {
				builder.append(masking.cardNumber.charAt(index));
				index++;
			} else if (c == 'x' || c == 'X') {
				builder.append(c);
				index++;
			} else {
				builder.append(c);
			}

		}

		return builder.toString();
	}

	public static void main(String[] args) {
		CardNumberMasking masking = new CardNumberMasking("1234567890123456", "####-xxxx-xxxx-####");
		String maskedNumber = masking.cardMasking(masking);
		System.out.println(maskedNumber);
	}

}
