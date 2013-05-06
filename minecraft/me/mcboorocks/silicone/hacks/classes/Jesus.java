package me.mcboorocks.silicone.hacks.classes;

import net.minecraft.client.Minecraft;

public class Jesus {
	public static boolean jesus = false;
	public Jesus(Minecraft mc){if(Jesus.jesus){if(mc.thePlayer.isInWater()){mc.thePlayer.jump();}}}
}
