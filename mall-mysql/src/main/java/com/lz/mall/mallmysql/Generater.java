package com.lz.mall.mallmysql;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Generater {
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        File file= new File("mall-mysql/src/main/resources/generatorConfig.xml");
        List<String> warnings  = new ArrayList<>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration configuration = cp.parseConfiguration(file);
        DefaultShellCallback callback =new DefaultShellCallback(true);
        MyBatisGenerator generator = new MyBatisGenerator(configuration,callback,warnings);
        generator.generate(null);
        System.out.println("执行成功");
    }
}
