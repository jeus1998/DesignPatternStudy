package com.example.desginpatternstudy._02_structural_patterns._10_facade._02_after;

public class Client {
    public static void main(String[] args) {

        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = EmailMessage.builder()
                .to("baejeu@naver.com")
                .from("whiteship@whiteship.me")
                .subject("제목")
                .text("내용")
                .build();

        emailSender.sentEmail(emailMessage);
    }
}
