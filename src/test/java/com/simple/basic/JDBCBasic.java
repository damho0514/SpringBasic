//package com.simple.basic;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//import org.junit.Test;
//
//public class JDBCBasic {
//   
//   //Junit - 단위테스트환경(자바에서 작은단위만 분리해서 테스팅)
//   //@Test어노테이션이 붙은 메서드를 main메서드처럼 실행
//
//   @Test
//   public void test() {
//      //데이터베이스 연결 확인
//      String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
//      String uid = "spring";
//      String upw = "spring";
//      
//      try {
//         Class.forName("oracle.jdbc.driver.OracleDriver");
//         Connection conn = DriverManager.getConnection(url, uid, upw);
//         System.out.println("결과확인 : " + conn);
//      } catch (Exception e) {
//         e.printStackTrace();
//      }
//   }
//}