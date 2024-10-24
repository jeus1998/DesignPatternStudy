package com.example.desginpatternstudy._02_structural_patterns._07_bridge._03_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/*
Driver
JDBC 드라이버는 Java 애플리케이션과 데이터베이스 간의 연결을 처리하는 컴포넌트
데이터베이스와의 통신을 가능하게 하며, JDBC API를 통해 SQL 쿼리를 실행하고 결과를 반환
예: MySQL 드라이버, Oracle 드라이버 등

DriverManager JDBC 드라이버 관리 클래스
애플리케이션이 데이터베이스에 연결할 때 드라이버를 로드하고, 등록된 드라이버 중에서 적절한 드라이버를 선택하여 연결을 생성
드라이버 등록: DriverManager.registerDriver()
데이터베이스 연결: DriverManager.getConnection(url, user, password)

각 Driver 3개의 인터페이스를 구현
Connection
Statement
ResultSet
 */

public class JdbcExample {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("org.h2.Driver");

        try(Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")){
            String sql = "";
            Statement statement = conn.createStatement();
            statement.execute(sql);
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
