package vb.$playerwariii;
import java.io.*;
import java.nio.file.*;
import java.util.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.plugin.java.*;

public class PluginMain extends JavaPlugin implements Listener {

	private static PluginMain instance;

	@Override
	public void onEnable() {
		instance = this;
		getServer().getPluginManager().registerEvents(this, this);
		saveDefaultConfig();
		getServer().getPluginManager().registerEvents(GUIManager.getInstance(), this);
		GUIManager.getInstance().register("pw1", guiPlayer -> {
			try {
				org.bukkit.inventory.Inventory guiInventory = Bukkit.createInventory(new GUIIdentifier("pw1"),
						((int) (27d)), "Select your warrior type");
				guiInventory.setItem(((int) (10d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.DIAMOND_SWORD),
						ChatColor.translateAlternateColorCodes('&', "&2&lSwords Man"),
						new ArrayList(Arrays.asList("",
								ChatColor.translateAlternateColorCodes('&', "&7Swords Man Warrior have the following:"),
								"", ChatColor.translateAlternateColorCodes('&', "&7- Diamond Sword (x2)"),
								ChatColor.translateAlternateColorCodes('&', "&7- Lava Bucket"),
								ChatColor.translateAlternateColorCodes('&', "&7- Golden Apples (x64)"),
								ChatColor.translateAlternateColorCodes('&', "&7- Cooked Beef (x64)"),
								ChatColor.translateAlternateColorCodes('&', "&7- Shield"),
								ChatColor.translateAlternateColorCodes('&', "&7- Full set armor (Iron)")))));
				guiInventory.setItem(((int) (12d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.DIAMOND_AXE),
						ChatColor.translateAlternateColorCodes('&', "&2&lAxe Professional"),
						new ArrayList(Arrays.asList("",
								ChatColor.translateAlternateColorCodes('&',
										"&7Axe Professional Warrior have the following:"),
								"", ChatColor.translateAlternateColorCodes('&', "&7- Diamond Axe (x2)"),
								ChatColor.translateAlternateColorCodes('&', "&7- Fire Charge (x64)"),
								ChatColor.translateAlternateColorCodes('&', "&7- Enchanted Golden Apples (x16)"),
								ChatColor.translateAlternateColorCodes('&', "&7- Cooked Chicken (x64)"),
								ChatColor.translateAlternateColorCodes('&', "&7- Full set armor (Chainmail)")))));
				guiInventory.setItem(((int) (14d)),
						PluginMain.getNamedItemWithLore(((org.bukkit.Material) org.bukkit.Material.TRIDENT),
								ChatColor.translateAlternateColorCodes('&', "&2&lDrowned Official"),
								new ArrayList(Arrays.asList("",
										ChatColor.translateAlternateColorCodes('&',
												"&7Drowned Official Warrior have the following:"),
										"", ChatColor.translateAlternateColorCodes('&', "&7- Trident (x2)"),
										ChatColor.translateAlternateColorCodes('&', "&7- Snow Balls (x64)"),
										ChatColor.translateAlternateColorCodes('&', "&7- Golden Carrot (x64)"),
										ChatColor.translateAlternateColorCodes('&', "&7- Cooked Cod (x64)"),
										ChatColor.translateAlternateColorCodes('&', "&7- Full set armor (Gold)")))));
				guiInventory.setItem(((int) (16d)), PluginMain.getNamedItemWithLore(
						((org.bukkit.Material) org.bukkit.Material.BOW),
						ChatColor.translateAlternateColorCodes('&', "&2&lArcher Hood"),
						new ArrayList(Arrays.asList("",
								ChatColor.translateAlternateColorCodes('&', "&7Swords Man Warrior have the following:"),
								"", ChatColor.translateAlternateColorCodes('&', "&7- Bow"),
								ChatColor.translateAlternateColorCodes('&', "&7- Crossbow"),
								ChatColor.translateAlternateColorCodes('&', "&7- Spectral Arrow (x64)"),
								ChatColor.translateAlternateColorCodes('&', "&7- Arrow (x64)"),
								ChatColor.translateAlternateColorCodes('&', "&7- Cooked Mutton (x64)"),
								ChatColor.translateAlternateColorCodes('&', "&7- Cooked Rabbot (x64)"),
								ChatColor.translateAlternateColorCodes('&', "&7- Full set armor (Diamond)")))));
				return guiInventory;
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}, true);
	}

	@Override
	public void onDisable() {
	}

	@Override
	public boolean onCommand(CommandSender commandSender, Command command, String label, String[] commandArgs) {
		if (command.getName().equalsIgnoreCase("mpw-axeprofessional")) {
			try {
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).clear();
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (0d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_AXE)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (1d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_AXE)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (2d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.FIRE_CHARGE), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(
								((int) (3d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.ENCHANTED_GOLDEN_APPLE),
										((int) (16d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (4d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.COOKED_CHICKEN), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (39d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.CHAINMAIL_HELMET)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (38d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.CHAINMAIL_CHESTPLATE)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (37d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.CHAINMAIL_LEGGINGS)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (36d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.CHAINMAIL_BOOTS)));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("mpw-swordsman")) {
			try {
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).clear();
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (0d)),
								((org.bukkit.inventory.ItemStack) (Object) ((org.bukkit.Material) org.bukkit.Material.DIAMOND_SWORD)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (1d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_SWORD)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (2d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.LAVA_BUCKET)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (3d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.GOLDEN_APPLE), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (4d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.COOKED_BEEF), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (40d)),
								new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.SHIELD)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (39d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.IRON_HELMET)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (38d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.IRON_CHESTPLATE)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (37d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.IRON_LEGGINGS)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (36d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.IRON_BOOTS)));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("mpw-drownedofficial")) {
			try {
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).clear();
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (0d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.TRIDENT)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (1d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.TRIDENT)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (2d)),
								new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.SNOWBALL),
										((int) (64d)), ((short) (25d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (3d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.GOLDEN_CARROT), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (4d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.COOKED_COD), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (39d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.GOLDEN_HELMET)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (38d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.GOLDEN_CHESTPLATE)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (37d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.GOLDEN_LEGGINGS)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (36d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.GOLDEN_BOOTS)));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("mpw-archerhood")) {
			try {
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).clear();
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (0d)),
								new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.BOW)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (1d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.CROSSBOW)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (2d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.SPECTRAL_ARROW), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (3d)),
								new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.ARROW),
										((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (4d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.COOKED_MUTTON), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (5d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.COOKED_RABBIT), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (39d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_HELMET)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (38d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_CHESTPLATE)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (37d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_LEGGINGS)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) commandSender)
						.getInventory()).setItem(((int) (36d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_BOOTS)));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("")) {
			try {
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("mpw-reload")) {
			try {
				PluginMain.getInstance().reloadConfig();
				commandSender.sendMessage(
						((java.lang.String[]) new ArrayList(Arrays.asList(ChatColor.translateAlternateColorCodes('&',
								"&7&l<<|&2&lPlayerWarIII&7&l|>> &fConfigs have been reloaded successfully! ")))
										.toArray(new java.lang.String[]{})));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("mpw-gui")) {
			try {
				GUIManager.getInstance().open("pw1", ((org.bukkit.entity.Player) (Object) commandSender));
				commandSender.sendMessage(((java.lang.String[]) new ArrayList(Arrays.asList(
						ChatColor.translateAlternateColorCodes('&', "&7Select your warrior to fight with the rebels!")))
								.toArray(new java.lang.String[]{})));
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		if (command.getName().equalsIgnoreCase("")) {
			try {
			} catch (Exception e) {
				e.printStackTrace();
			}
			return true;
		}
		return true;
	}

	public static void procedure(String procedure, List procedureArgs) throws Exception {
	}

	public static Object function(String function, List functionArgs) throws Exception {
		return null;
	}

	public static List createList(Object obj) {
		if (obj instanceof List) {
			return (List) obj;
		}
		List list = new ArrayList<>();
		if (obj.getClass().isArray()) {
			int length = java.lang.reflect.Array.getLength(obj);
			for (int i = 0; i < length; i++) {
				list.add(java.lang.reflect.Array.get(obj, i));
			}
		} else if (obj instanceof Collection<?>) {
			list.addAll((Collection<?>) obj);
		} else if (obj instanceof Iterator) {
			((Iterator<?>) obj).forEachRemaining(list::add);
		} else {
			list.add(obj);
		}
		return list;
	}

	public static void createResourceFile(String path) {
		Path file = getInstance().getDataFolder().toPath().resolve(path);
		if (Files.notExists(file)) {
			try (InputStream inputStream = PluginMain.class.getResourceAsStream("/" + path)) {
				Files.createDirectories(file.getParent());
				Files.copy(inputStream, file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static PluginMain getInstance() {
		return instance;
	}

	@EventHandler
	public void onGUIClick(GUIClickEvent event) throws Exception {
		if (event.getID().equalsIgnoreCase("pw1")) {
			if (PluginMain.checkEquals(((java.lang.Object) (Object) event.getSlot()),
					((java.lang.Object) (Object) (10d)))) {
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).clear();
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (0d)),
								((org.bukkit.inventory.ItemStack) (Object) ((org.bukkit.Material) org.bukkit.Material.DIAMOND_SWORD)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (1d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_SWORD)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (2d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.LAVA_BUCKET)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (3d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.GOLDEN_APPLE), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (4d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.COOKED_BEEF), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (40d)),
								new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.SHIELD)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (39d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.IRON_HELMET)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (38d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.IRON_CHESTPLATE)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (37d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.IRON_LEGGINGS)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (36d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.IRON_BOOTS)));
			}
			if (PluginMain.checkEquals(((java.lang.Object) (Object) event.getSlot()),
					((java.lang.Object) (Object) (12d)))) {
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).clear();
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (0d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_AXE)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (1d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_AXE)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (2d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.FIRE_CHARGE), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(
								((int) (3d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.ENCHANTED_GOLDEN_APPLE),
										((int) (16d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (4d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.COOKED_CHICKEN), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (39d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.CHAINMAIL_HELMET)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (38d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.CHAINMAIL_CHESTPLATE)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (37d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.CHAINMAIL_LEGGINGS)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (36d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.CHAINMAIL_BOOTS)));
			}
			if (PluginMain.checkEquals(((java.lang.Object) (Object) event.getSlot()),
					((java.lang.Object) (Object) (14d)))) {
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).clear();
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (0d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.TRIDENT)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (1d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.TRIDENT)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (2d)),
								new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.SNOWBALL),
										((int) (64d)), ((short) (25d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (3d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.GOLDEN_CARROT), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (4d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.COOKED_COD), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (39d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.GOLDEN_HELMET)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (38d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.GOLDEN_CHESTPLATE)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (37d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.GOLDEN_LEGGINGS)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (36d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.GOLDEN_BOOTS)));
			}
			if (PluginMain.checkEquals(((java.lang.Object) (Object) event.getSlot()),
					((java.lang.Object) (Object) (16d)))) {
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).clear();
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (0d)),
								new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.BOW)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (1d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.CROSSBOW)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (2d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.SPECTRAL_ARROW), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (3d)),
								new org.bukkit.inventory.ItemStack(((org.bukkit.Material) org.bukkit.Material.ARROW),
										((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (4d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.COOKED_MUTTON), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (5d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.COOKED_RABBIT), ((int) (64d))));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (39d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_HELMET)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (38d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_CHESTPLATE)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (37d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_LEGGINGS)));
				((org.bukkit.inventory.Inventory) ((org.bukkit.inventory.InventoryHolder) (Object) ((org.bukkit.entity.Player) event
						.getWhoClicked())).getInventory()).setItem(((int) (36d)),
								new org.bukkit.inventory.ItemStack(
										((org.bukkit.Material) org.bukkit.Material.DIAMOND_BOOTS)));
			}
			return;
		}
	}

	public static org.bukkit.inventory.ItemStack getNamedItemWithLore(Material material, String name,
			List<String> lore) {
		org.bukkit.inventory.ItemStack item = new org.bukkit.inventory.ItemStack(material);
		org.bukkit.inventory.meta.ItemMeta itemMeta = item.getItemMeta();
		if (itemMeta != null) {
			itemMeta.setDisplayName(name);
			itemMeta.setLore(lore);
			item.setItemMeta(itemMeta);
		}
		return item;
	}

	public static boolean checkEquals(Object o1, Object o2) {
		if (o1 == null || o2 == null) {
			return false;
		}
		return o1 instanceof Number && o2 instanceof Number
				? ((Number) o1).doubleValue() == ((Number) o2).doubleValue()
				: o1.equals(o2);
	}
}
