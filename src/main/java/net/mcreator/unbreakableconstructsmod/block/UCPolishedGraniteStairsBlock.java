
package net.mcreator.unbreakableconstructsmod.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.unbreakableconstructsmod.itemgroup.UCUnbreakablesItemGroup;
import net.mcreator.unbreakableconstructsmod.UnbreakableConstructsModModElements;

import java.util.List;
import java.util.Collections;

@UnbreakableConstructsModModElements.ModElement.Tag
public class UCPolishedGraniteStairsBlock extends UnbreakableConstructsModModElements.ModElement {
	@ObjectHolder("unbreakable_constructs_mod:uc_polished_granite_stairs")
	public static final Block block = null;

	public UCPolishedGraniteStairsBlock(UnbreakableConstructsModModElements instance) {
		super(instance, 244);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(UCUnbreakablesItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(() -> new Block(Block.Properties.create(Material.BARRIER, MaterialColor.AIR).sound(SoundType.STONE)
					.hardnessAndResistance(-1, 3600000).setLightLevel(s -> 0)).getDefaultState(),
					Block.Properties.create(Material.BARRIER, MaterialColor.AIR).sound(SoundType.STONE).hardnessAndResistance(-1, 3600000)
							.setLightLevel(s -> 0));
			setRegistryName("uc_polished_granite_stairs");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public MaterialColor getMaterialColor() {
			return MaterialColor.AIR;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
