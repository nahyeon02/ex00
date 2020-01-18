package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
@RequiredArgsConstructor
//인스턴스 변수로 선언된 모든것을 파라미터로 받는 생성자 작성
//@NonNull이나 final이 붙은 인스턴스 변수에 대한 생성자 만듬
public class SampleHotel {

	@NonNull
	private Chef chef;

	private String name;
}

//생성자를 통한 주입
/*
 * @Component
 * 
 * @ToString
 * 
 * @Getter public class SampleHotel {
 * 
 * private Chef chef;
 * 
 * public SampleHotel(Chef chef) { this.chef = chef; }
 * 
 * }
 */
