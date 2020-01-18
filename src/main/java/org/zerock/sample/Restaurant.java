package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
//이 클래스가 스프링에서 관리해야하는 대상임을 표시
//root-context.xml의 component-scan를 통해 해당 패키지에 있는 클래스를 조사, 
//@Component가 존재하는 클래스를 객체로 생성, 빈으로관리함.

@Data
//한번에 자주 사용되는 모든메서드 생성 세부적인 설정이 필요없는경우에 자주사용
//@ToString, @EqualsAndHashCode, @Getter/@Setter @RequiredArgsConstructor
public class Restaurant {

 @Setter(onMethod_ = @Autowired)
 //Setter - 자동으로 setChef()를 컴파일시 생성
 //onMethod - 생성되는 setChef()에 @Autowired 어노테이션을  추가함.
 //onMethod_ = setter메서드 생성시 추가할 어노테이션 지정
 //'_'표기는 jdk버전에 따라 차이있음
 
 private Chef chef;

}

