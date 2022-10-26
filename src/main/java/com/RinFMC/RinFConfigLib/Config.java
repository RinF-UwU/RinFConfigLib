package com.RinFMC.RinFConfigLib;

import net.minecraft.client.MinecraftClient;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Config {
    public static final Path CONFIG_DIR_PATH = Paths.get(MinecraftClient.getInstance().runDirectory.getPath() + "/config");
    public Config(String FilePath) {
        Path CONFIG_FILE_PATH = Paths.get(CONFIG_DIR_PATH + FilePath);
        if (!Files.exists(CONFIG_FILE_PATH)) {
            CreateConfigFile(CONFIG_FILE_PATH);
        }
    }

    public Config setByteConfig(String CONFIG_NAME, byte config) {
        return this;
    }
    public Config setShortConfig(String CONFIG_NAME, short config) {
        return this;
    }
    public Config setIntConfig(String CONFIG_NAME, int config) {
        return this;
    }
    public Config setLongConfig(String CONFIG_NAME, long config) {
        return this;
    }
    public Config setFloatConfig(String CONFIG_NAME, float config) {
        return this;
    }
    public Config setDoubleConfig(String CONFIG_NAME, double config) {
        return this;
    }
    public Config setCharConfig(String CONFIG_NAME, char config) {
        return this;
    }
    public Config setBooleanConfig(String CONFIG_NAME, boolean config) {
        return this;
    }
    public Config setStringConfig(String CONFIG_NAME, String config) {
        return this;
    }
    private void CreateConfigFile(Path CONFIG_FILE_PATH) {
        try {
            Files.createDirectories(CONFIG_DIR_PATH);
            Files.createFile(CONFIG_FILE_PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
