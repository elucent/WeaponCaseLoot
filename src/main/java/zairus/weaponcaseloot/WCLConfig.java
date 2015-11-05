package zairus.weaponcaseloot;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public final class WCLConfig
{
	public static Configuration configuration;
	
	public static int durability_common_broken = 490;
	public static int durability_common_crude = 760;
	public static int durability_common_good = 1500;
	public static int durability_common_flawless = 1820;
	public static int durability_common_perfect = 2150;
	
	public static int durability_uncommon_broken = 650;
	public static int durability_uncommon_crude = 760;
	public static int durability_uncommon_good = 1700;
	public static int durability_uncommon_flawless = 2050;
	public static int durability_uncommon_perfect = 2150;
	
	public static int durability_rare_broken = 750;
	public static int durability_rare_crude = 1160;
	public static int durability_rare_good = 1850;
	public static int durability_rare_flawless = 2180;
	public static int durability_rare_perfect = 2400;
	
	public static int durability_legendary_broken = 850;
	public static int durability_legendary_crude = 1260;
	public static int durability_legendary_good = 2000;
	public static int durability_legendary_flawless = 2500;
	public static int durability_legendary_perfect = 3000;
	
	public static float damage_common_broken = 7;
	public static float damage_common_crude = 7;
	public static float damage_common_good = 7;
	public static float damage_common_flawless = 7;
	public static float damage_common_perfect = 7;
	
	public static float damage_uncommon_broken = 9;
	public static float damage_uncommon_crude = 9;
	public static float damage_uncommon_good = 9;
	public static float damage_uncommon_flawless = 9;
	public static float damage_uncommon_perfect = 9;
	
	public static float damage_rare_broken = 11;
	public static float damage_rare_crude = 11;
	public static float damage_rare_good = 11;
	public static float damage_rare_flawless = 11;
	public static float damage_rare_perfect = 11;
	
	public static float damage_legendary_broken = 13;
	public static float damage_legendary_crude = 13;
	public static float damage_legendary_good = 13;
	public static float damage_legendary_flawless = 13;
	public static float damage_legendary_perfect = 13;
	
	public static String[] sword_names = {"Balance Sword", "Decorated Blue", "Warrior's Blade", "Stun Cut", "Thin Spike"};
	
	public static void init(File cFile)
	{
		configuration = new Configuration(cFile);
		configuration.load();
		
		durability_common_broken = configuration.getInt("durability_common_broken", "Durability", durability_common_broken, 0, 5000, "Durability value for Broken Common weapon");
		durability_common_crude = configuration.getInt("durability_common_crude", "Durability", durability_common_crude, 0, 5000, "Durability value for Crude Common weapon");
		durability_common_good = configuration.getInt("durability_common_good", "Durability", durability_common_good, 0, 5000, "Durability value for Good Common weapon");
		durability_common_flawless = configuration.getInt("durability_common_flawless", "Durability", durability_common_flawless, 0, 5000, "Durability value for Flawless Common weapon");
		durability_common_perfect = configuration.getInt("durability_common_perfect", "Durability", durability_common_perfect, 0, 5000, "Durability value for Perfect Common weapon");
		durability_uncommon_broken = configuration.getInt("durability_uncommon_broken", "Durability", durability_uncommon_broken, 0, 5000, "Durability value for Broken Uncommon weapon");
		durability_uncommon_crude = configuration.getInt("durability_uncommon_crude", "Durability", durability_uncommon_crude, 0, 5000, "Durability value for Crude Uncommon weapon");
		durability_uncommon_good = configuration.getInt("durability_uncommon_good", "Durability", durability_uncommon_good, 0, 5000, "Durability value for Good Uncommon weapon");
		durability_uncommon_flawless = configuration.getInt("durability_uncommon_flawless", "Durability", durability_uncommon_flawless, 0, 5000, "Durability value for Flawless Uncommon weapon");
		durability_uncommon_perfect = configuration.getInt("durability_uncommon_perfect", "Durability", durability_uncommon_perfect, 0, 5000, "Durability value for Perfect Uncommon weapon");
		durability_rare_broken = configuration.getInt("durability_rare_broken", "Durability", durability_rare_broken, 0, 5000, "Durability value for Broken Rare weapon");
		durability_rare_crude = configuration.getInt("durability_rare_crude", "Durability", durability_rare_crude, 0, 5000, "Durability value for Crude Rare weapon");
		durability_rare_good = configuration.getInt("durability_rare_good", "Durability", durability_rare_good, 0, 5000, "Durability value for Good Rare weapon");
		durability_rare_flawless = configuration.getInt("durability_rare_flawless", "Durability", durability_rare_flawless, 0, 5000, "Durability value for Flawless Rare weapon");
		durability_rare_perfect = configuration.getInt("durability_rare_perfect", "Durability", durability_rare_perfect, 0, 5000, "Durability value for Perfect Rare weapon");
		durability_legendary_broken = configuration.getInt("durability_legendary_broken", "Durability", durability_legendary_broken, 0, 5000, "Durability value for Broken Legendary weapon");
		durability_legendary_crude = configuration.getInt("durability_legendary_crude", "Durability", durability_legendary_crude, 0, 5000, "Durability value for Crude Legendary weapon");
		durability_legendary_good = configuration.getInt("durability_legendary_good", "Durability", durability_legendary_good, 0, 5000, "Durability value for Good Legendary weapon");
		durability_legendary_flawless = configuration.getInt("durability_legendary_flawless", "Durability", durability_legendary_flawless, 0, 5000, "Durability value for Flawless Legendary weapon");
		durability_legendary_perfect = configuration.getInt("durability_legendary_perfect", "Durability", durability_legendary_perfect, 0, 5000, "Durability value for Perfect Legendary weapon");
		
		damage_common_broken = configuration.getFloat("damage_common_broken", "Damage", damage_common_broken, 0, 5000, "Damage value for Broken Common weapon");
		damage_common_crude = configuration.getFloat("damage_common_crude", "Damage", damage_common_crude, 0, 5000, "Damage value for Crude Common weapon");
		damage_common_good = configuration.getFloat("damage_common_good", "Damage", damage_common_good, 0, 5000, "Damage value for Good Common weapon");
		damage_common_flawless = configuration.getFloat("damage_common_flawless", "Damage", damage_common_flawless, 0, 5000, "Damage value for Flawless Common weapon");
		damage_common_perfect = configuration.getFloat("damage_common_perfect", "Damage", damage_common_perfect, 0, 5000, "Damage value for Perfect Common weapon");
		damage_uncommon_broken = configuration.getFloat("damage_uncommon_broken", "Damage", damage_uncommon_broken, 0, 5000, "Damage value for Broken Uncommon weapon");
		damage_uncommon_crude = configuration.getFloat("damage_uncommon_crude", "Damage", damage_uncommon_crude, 0, 5000, "Damage value for Crude Uncommon weapon");
		damage_uncommon_good = configuration.getFloat("damage_uncommon_good", "Damage", damage_uncommon_good, 0, 5000, "Damage value for Good Uncommon weapon");
		damage_uncommon_flawless = configuration.getFloat("damage_uncommon_flawless", "Damage", damage_uncommon_flawless, 0, 5000, "Damage value for Flawless Uncommon weapon");
		damage_uncommon_perfect = configuration.getFloat("damage_uncommon_perfect", "Damage", damage_uncommon_perfect, 0, 5000, "Damage value for Perfect Uncommon weapon");
		damage_rare_broken = configuration.getFloat("damage_rare_broken", "Damage", damage_rare_broken, 0, 5000, "Damage value for Broken Rare weapon");
		damage_rare_crude = configuration.getFloat("damage_rare_crude", "Damage", damage_rare_crude, 0, 5000, "Damage value for Crude Rare weapon");
		damage_rare_good = configuration.getFloat("damage_rare_good", "Damage", damage_rare_good, 0, 5000, "Damage value for Good Rare weapon");
		damage_rare_flawless = configuration.getFloat("damage_rare_flawless", "Damage", damage_rare_flawless, 0, 5000, "Damage value for Flawless Rare weapon");
		damage_rare_perfect = configuration.getFloat("damage_rare_perfect", "Damage", damage_rare_perfect, 0, 5000, "Damage value for Perfect Rare weapon");
		damage_legendary_broken = configuration.getFloat("damage_legendary_broken", "Damage", damage_legendary_broken, 0, 5000, "Damage value for Broken Legendary weapon");
		damage_legendary_crude = configuration.getFloat("damage_legendary_crude", "Damage", damage_legendary_crude, 0, 5000, "Damage value for Crude Legendary weapon");
		damage_legendary_good = configuration.getFloat("damage_legendary_good", "Damage", damage_legendary_good, 0, 5000, "Damage value for Good Legendary weapon");
		damage_legendary_flawless = configuration.getFloat("damage_legendary_flawless", "Damage", damage_legendary_flawless, 0, 5000, "Damage value for Flawless Legendary weapon");
		damage_legendary_perfect = configuration.getFloat("damage_legendary_perfect", "Damage", damage_legendary_perfect, 0, 5000, "Damage value for Perfect Legendary weapon");
		
		sword_names = configuration.getStringList("sword_names", "names", sword_names, "Names for swords, must be " + WCLConstants.totalSwords);
		
		configuration.save();
	}
}