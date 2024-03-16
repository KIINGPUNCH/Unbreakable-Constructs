
package net.mcreator.unbreakableconstructsmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Blocks;

import net.mcreator.unbreakableconstructsmod.UnbreakableConstructsModModElements;

@UnbreakableConstructsModModElements.ModElement.Tag
public class UCUnbreakablesItemGroup extends UnbreakableConstructsModModElements.ModElement {
	public UCUnbreakablesItemGroup(UnbreakableConstructsModModElements instance) {
		super(instance, 490);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabuc_unbreakables") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(Blocks.BEDROCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
