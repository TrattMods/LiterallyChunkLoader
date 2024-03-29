package net.literally.chunk.loader.initializer;

import net.literally.chunk.loader.block.ChunkLoaderBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public final class LCLBlocks {
    public static final ChunkLoaderBlock CHUNK_LOADER_BLOCK = new ChunkLoaderBlock();

    public static void initialize() {
        Registry.register(Registries.BLOCK, ChunkLoaderBlock.ID, CHUNK_LOADER_BLOCK);
    }
}
