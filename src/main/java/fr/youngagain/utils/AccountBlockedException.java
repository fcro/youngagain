package fr.youngagain.utils;

public class AccountBlockedException extends Exception{
	private String message;
	public AccountBlockedException() {
		// TODO Auto-generated constructor stub
	}
	public AccountBlockedException(String message) {
		this.message=message;
	}
}
