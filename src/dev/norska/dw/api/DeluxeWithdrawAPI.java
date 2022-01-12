package dev.norska.dw.api;

import java.util.UUID;

import org.bukkit.inventory.ItemStack;

public class DeluxeWithdrawAPI {
	
	/** 
	* Check if an ItemStack is a redeemable experience item.
	* @param ItemStack
	* @return Boolean
	*/
	public static Boolean isExperienceNoteItem(ItemStack item) {
		return null;
	}
	
	/** 
	* Check if an ItemStack is a redeemable money item.
	* @param ItemStack
	* @return Boolean
	*/
	public static Boolean isMoneyNoteItem(ItemStack item) {
		return null;
	}
	
	/** 
	* Get the value of a redeemable item (should be checked with #isExperienceNoteItem or #isMoneyNoteItem first).
	* @param ItemStack
	* @return Double
	*/
	public static Double getNoteValue(ItemStack item) {
		return null;
	}
	
	/** 
	* Get the tax percentage of a redeemable item (should be checked with #isExperienceNoteItem or #isMoneyNoteItem first).
	* @param ItemStack
	* @return Double
	*/
	public static Double getNoteTax(ItemStack item) {
		return null;
	}
	
	/** 
	* Get the creator name of a redeemable item (should be checked with #isExperienceNoteItem or #isMoneyNoteItem first).
	* @param ItemStack
	* @return String
	*/
	public static String getNoteCreatorName(ItemStack item) {
		return null;
	}
	
	/** 
	* Get the creator uuid of redeemable item (should be checked with #isExperienceNoteItem or #isMoneyNoteItem first).
	* @param ItemStack
	* @return UUID
	*/
	public static UUID getNoteCreatorUUID(ItemStack item) {
		return null;
	}
	
	/** 
	* Get the creation date of a redeemable item (should be checked with #isExperienceNoteItem or #isMoneyNoteItem first).
	* @param ItemStack
	* @return String
	*/
	public static String getNoteCreationDate(ItemStack item) {
		return null;
	}
	
	/** 
	* Get the tier of a redeemable item (should be checked with #isExperienceNoteItem or #isMoneyNoteItem first).
	* @param ItemStack
	* @return String
	*/
	public static String getNoteTier(ItemStack item) {
		return null;
	}

}
