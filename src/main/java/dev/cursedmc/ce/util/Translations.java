package dev.cursedmc.ce.util;

import net.minecraft.client.resource.language.TranslationStorage;
import net.minecraft.util.Language;

public final class Translations {
	private Translations() {}
	
	public static String get(String key) {
		return getLang().get(key);
	}
	
	public static Language getLang() {
		return TranslationStorage.getInstance();
	}
}
