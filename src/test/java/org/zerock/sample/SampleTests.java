
package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
//현재 테스트코드가 스프링을 실행하는 역할을 할것이라는것을 표시
//테스트시 필요한 클래스 지정

@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//지정된 클래스나 문자열을 이용해서 필요한 객체들을 스프링내에 객체로 등록함.
//스프링이 실행되면서 어떤 설정 정보를 읽어들여야하는지 명시함. 


@Log4j
//log객체 생성 Log4j 설정을 이용함. Log4j없을경우 @Log 사용
public class SampleTests {
  
  @Setter(onMethod_ = { @Autowired })
  //@Autowired 해당 인스턴스 변수를 스프링이 자동주입해 달라는 표시
  //자신이 특정한 객체에 의존적이므로 자신에게 해당 타입의 빈을 주입해달라는 표시
  //ex) Chef클래스에 @Component가 없다면 스프링이 chef객체를 관리하지않게됨
  // 따라서 제대로 실행되지않음.
  
  private Restaurant restaurant;  

  @Test
  //테스트 대상임을 표시
  public void testExist() {
    
    assertNotNull(restaurant);
    //restaurant변수가 null이 아니어야만 성공한다는 의미
    
    log.info(restaurant);
    log.info("----------------------------------");
    log.info(restaurant.getChef());
    
  }
  
  
}
