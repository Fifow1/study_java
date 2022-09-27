import com.company.study.ch08.RemoteControl;

RemoteControl 인터페이스를 생성.
상수 : max_volume, min_volume, 초기값 10, 0
추상메서드 : turnon, furnoff, setvolume(파라미터는 정수형 volume 사용)
디폴트메서드 : setmute(파라미터는 불리언 mute 사용)
mute 값에 따라 트루면 “무음처리합니다.” 반대면 “무음해제합니다.” 처리
정적메서드 : changeBattery(반환, 파라미터 없음)
“건전지를 교체를 교환합니다.” 출력만 수행
* 모든 항목은 생략 없이 사용하여야 함

Television 클래스는 RemoteControl를 구현
필드 : 정수형 volume 로 초기값은 없음, setvloume 의 파라미터로 사용
setvolume 은 파람으로 받은 값이 RemoteControl 의 max_volume 보다 크면 max_volume 으로 대입되며
min_volume 보다 작으면 min_volume으로 대입 되어 “현재 TV 볼륨: ” 그리고 대입된 값이 출력되도록 함수
구성
아래 RemoteControlExample 의 결과를 확인하여 각 함수들을 구성

RemoteControlExample 는 실행클래스 임

변수 100을 사용하였을 때 결과
remoteControl.turnOn();
remoteControl.setMute(true);
remoteControl.setMute(false);
remoteControl.setVolume(100);
RemoteControl.changeBattery();
remoteControl.turnOff();