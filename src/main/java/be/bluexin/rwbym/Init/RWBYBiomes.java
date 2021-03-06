package be.bluexin.rwbym.Init;

import be.bluexin.rwbym.world.biome.BiomeForeverFall;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class RWBYBiomes {

    public static final Biome FOREVER_FALL = new BiomeForeverFall();

    public static void registerBiomes() {
        initBiome(FOREVER_FALL, "forever_fall", BiomeType.WARM, Type.FOREST);
    }

    private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... types) {
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        BiomeDictionary.addTypes(biome, types);
        System.out.println("Registered Biome: " + name);
        BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 20));
        BiomeManager.addSpawnBiome(biome);
        return biome;
    }
}
