
package net.mcreator.unbreakableconstructsmod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.unbreakableconstructsmod.block.UCDirtBlock;
import net.mcreator.unbreakableconstructsmod.UnbreakableConstructsModModElements;

@UnbreakableConstructsModModElements.ModElement.Tag
public class UCBreakablesItemGroup extends UnbreakableConstructsModModElements.ModElement {
	public UCBreakablesItemGroup(UnbreakableConstructsModModElements instance) {
		super(instance, 491);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabuc_breakables") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(UCDirtBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
