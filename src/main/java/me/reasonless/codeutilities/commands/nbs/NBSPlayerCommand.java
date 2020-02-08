package me.reasonless.codeutilities.commands.nbs;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.realmsclient.gui.ChatFormatting;

import io.github.cottonmc.clientcommands.CottonClientCommandSource;
import me.reasonless.codeutilities.util.TemplateNBT;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.LiteralText;

public class NBSPlayerCommand {
	public static int execute(MinecraftClient mc, CommandContext<CottonClientCommandSource> ctx) throws Exception {
		ItemStack stack = new ItemStack(Items.JUKEBOX);

		TemplateNBT.setTemplateNBTGZIP(stack, "Music Player", "CodeUtilities", "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");
		stack.setCustomName(new LiteralText(ChatFormatting.DARK_PURPLE + "" + ChatFormatting.BOLD + "MUSIC PLAYER PACK"));

		mc.interactionManager.clickCreativeStack(stack, 36 + mc.player.inventory.selectedSlot);
		
		mc.player.sendMessage(new LiteralText(ChatFormatting.GOLD + " - " + ChatFormatting.YELLOW + "You have been given a music player pack!"));
		mc.player.sendMessage(new LiteralText(ChatFormatting.GOLD + " - " + ChatFormatting.YELLOW + "Place this in your codespace and open the chest to get music functions!"));
		mc.player.sendMessage(new LiteralText(ChatFormatting.DARK_PURPLE + " - " + ChatFormatting.LIGHT_PURPLE + "If you don't know how to use, check our discord!"));
		mc.player.sendMessage(new LiteralText(ChatFormatting.DARK_AQUA + " - " + ChatFormatting.AQUA + "" + ChatFormatting.UNDERLINE + "https://discord.gg/QBmXaGb"));

		return 1;
	}
}
