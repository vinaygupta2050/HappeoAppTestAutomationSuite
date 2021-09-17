package com.happeo.utils;

/**
 * @author in-vinaykumar.gupta on 17/09/21
 * @project IntelliJ IDEA
 */
public class Configuration {
    private static Configuration configuration;
    private final PropertiesReader propertiesReader;
    private Configuration() {
        propertiesReader = new PropertiesReader();
    }
    public static synchronized  Configuration getConfiguration(){
        if(configuration==null)
        {
            configuration=new Configuration();
        }
        return configuration;
    }
    public String getAppUrl(){
        return propertiesReader.getAppUrl();
    }
    public String getUserName(){
        return propertiesReader.getUserName();
    }
    public String getUserPassword(){
        return propertiesReader.getPassword();
    }
}
