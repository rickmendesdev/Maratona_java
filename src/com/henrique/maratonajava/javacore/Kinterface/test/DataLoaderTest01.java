package com.henrique.maratonajava.javacore.Kinterface.test;
import com.henrique.maratonajava.javacore.Kinterface.domain.DataBaseLoader;
import com.henrique.maratonajava.javacore.Kinterface.domain.DataFileLoader;
import com.henrique.maratonajava.javacore.Kinterface.domain.DataRemove;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        dataBaseLoader.load();
        
        DataFileLoader dataFileLoader = new DataFileLoader();
        dataFileLoader.load();
        
        DataRemove.remove();
    }
    
}
