package com.ren.test;

import com.ren.service.GetModel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        /* TODO:
            - get arguments from commandline
         */
        String database = "databaseName";
        String user = "root";
        String pass = "passwd";
        Class.forName("com.mysql.cj.jdbc.Driver");
        //java文件输出路径
        String path = "/path/to/target/files";

        String url = "jdbc:mysql://localhost:3306/"+ database +"?useSSL=false&serverTimezone=GMT&allowPublicKeyRetrieval=true";
        Connection conn  =  DriverManager.getConnection(url,  user,  pass);
        GetModel getModel  = new GetModel(conn);
        /*
        使用：
            pojo: 包含属性与getter、setter
            bean: 包含属性与getter、setter与无参构造器，并实现Serializable接口
         */
        //生成pojo到path
        //getModel.generatePojo(path);
        //生成pojo到path，在pojo中添加包信息"package com.example.model"
        //getModel.generatePojo(path, "com.example.model");
        //生成Bean到path
        //getModel.generateBean(path);
        //生成Bean到path，在Bean中添加包信息"package com.example.bean"
        //getModel.generateBean(path, "com.example.bean");
    }
}
