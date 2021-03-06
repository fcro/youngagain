//package fr.youngagain.test.admin;
//
//import static org.junit.Assert.*;
//
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import fr.youngagain.admin.ManageAccount;
//import fr.youngagain.utils.AccountBlockedException;
//import fr.youngagain.utils.AccountNotFoundException;
//import fr.youngagain.utils.LoginAlreadyUsedException;
//import fr.youngagain.utils.PasswordFormatException;
//
//public class ManageAccountsTest {
//
//	@BeforeClass
//	public static void init() throws LoginAlreadyUsedException {
//		
//			ManageAccount.createAccount("Dug", "dug", "dug", "pword");
//			ManageAccount.createAccount("Fu", "fu", "fu", "dfgjd");
//			ManageAccount.blockAccount("fu");
//		
//	}
//
//	@Test
//	public void createAccountTest() throws LoginAlreadyUsedException {
//		
//			assertTrue(ManageAccount.createAccount("Dupont", "Gabozumeu", "dupontg", "password"));
//		
//		
//	}
//
//	@Test(expected=LoginAlreadyUsedException.class)
//	public void LoginAlreadyUsedExceptionTest() throws LoginAlreadyUsedException {
//		
//			ManageAccount.createAccount("Dug", "dug", "dug", "pword");
//		
//	}
//
//	@Test
//	public void deleteAccountTest() throws AccountNotFoundException, LoginAlreadyUsedException {
//		assertFalse(ManageAccount.deleteAccount("totod"));
//		ManageAccount.createAccount("Dumond", "toto", "totod", "pswd");
//		assertTrue(ManageAccount.deleteAccount("totod"));
//		assertFalse(ManageAccount.deleteAccount("totod"));
//	}
//
//	@Test
//	public void modifyAccountPasswordTest() throws LoginAlreadyUsedException, AccountNotFoundException, PasswordFormatException {
//		ManageAccount.createAccount("Chose", "Truc", "mach", "ps");
//		assertTrue(ManageAccount.modifyPassword("mach", "peuceu", "peuceu", "ps"));
//	}
//
//	@Test(expected=AccountNotFoundException.class)
//	public void accountNotFoundExceptionTest() throws AccountNotFoundException, PasswordFormatException {
//		ManageAccount.modifyPassword("cecomptenexistepas", "abc", "abc", "def");
//		ManageAccount.deleteAccount("cecomptenexistepas");
//	}
//
//	@Test(expected=PasswordFormatException.class)
//	public void modifyAccountPasswordExceptionTest() throws AccountNotFoundException, LoginAlreadyUsedException, PasswordFormatException {
//		ManageAccount.createAccount("bidule", "agneugneu", "brlbrl", "secret");
//		ManageAccount.modifyPassword("brlbrl", "secret", "secret", "secret");
//		ManageAccount.modifyPassword("brlbrl", "secre", "secret", "secret");
//		ManageAccount.modifyPassword("brlbrl", "secret", "secret", "sret");
//	}
//
//	@Test
//	public void addAccountWarningTest() {
//		assertTrue(ManageAccount.sendWarning("dug"));
//		assertFalse(ManageAccount.sendWarning("gud"));
//	}
//
//	@Test
//	public void createProfileTest() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void blockAccountTest() {
//		assertTrue(ManageAccount.blockAccount("dug"));
//	}
//
//	@Test(expected=AccountBlockedException.class)
//	public void accountBlockedExceptionTest() {
//		ManageAccount.blockAccount("fu");
//	}
//}
