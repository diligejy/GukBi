package sample13;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class MemberInfo implements MessageSourceAware {
	private MessageSource messages;

	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println("컨테이너가 메시지 설정을 수신합니다.");
		messages = messageSource;
	}

	public void display(Locale locale) {
		String name = messages.getMessage("member.name", null, locale);
		String birthplace = messages.getMessage("member.birthplace", null, locale);
		String hobby = messages.getMessage("member.hobby", null, locale);
		String age = messages.getMessage("member.age", new Object[] {"13"}, null, locale);

		System.out.println(name);
		System.out.println(birthplace);
		System.out.println(hobby);
		System.out.println(age);
	}

}
