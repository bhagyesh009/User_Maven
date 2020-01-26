package com.bitwise.dto;

public class Validation {

	public boolean mobnoValidation(long mobno) {

		if ((int) (Math.log10(mobno) + 1) == 10) {

			return true;
		} else
			return false;
	}

	public boolean nameValidation(String name) {
		if (name != "" && !name.isEmpty()) {
			for (char ch : name.toCharArray()) {
				if (Character.isDigit(ch)) {
					return false;
				}
			}
			return true;
		} else
			return false;

	}

}
