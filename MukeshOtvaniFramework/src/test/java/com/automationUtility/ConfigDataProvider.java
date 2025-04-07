package com.automationUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
    private Properties pro; // Ensure 'pro' is initialized properly

    // Constructor to load the properties file
    public ConfigDataProvider() {
        File src = new File("src/main/resources/Config.properties");
        
        try (FileInputStream fis = new FileInputStream(src)) {
            pro = new Properties();
            pro.load(fis);
            System.out.println("Config.properties loaded successfully!");
        } catch (IOException e) {
            System.out.println("Failed to load Config.properties. Check the file path.");
            e.printStackTrace();
        }
    }

    // Getter method for browser
    public String getBrowser() {
        if (pro != null) {
            return pro.getProperty("Browser");
        } else {
            throw new NullPointerException("Properties file not loaded. 'pro' is null.");
        }
    }

    // Getter method for URL
    public String getStagingURL() {
        if (pro != null) {
            return pro.getProperty("qaURL");
        } else {
            throw new NullPointerException("Properties file not loaded. 'pro' is null.");
        }
    }
}
