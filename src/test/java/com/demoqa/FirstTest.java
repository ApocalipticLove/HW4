package com.demoqa;

import org.junit.jupiter.api.Test;

public class FirstTest extends TestBase {

    @Test
    protected void fillFormTest() {

        registrationPage.openPage()
                .setFirstName("Dmitrii")
                .setLastName("Aleksandrov")
                .setEmail("123@mail.com")
                .setGender("Male")
                .setNumber("1234567899")
                .setBirthDate("05", "January", "2000")
                .setSubject("Math")
                .setHobby("Sports")
                .setUploadPicture("C:/Users/User/IdeaProjects/HW2-demoqa/src/test/resources/test.jpg")
                .setAddress("Lenina street 1")
                .setStateAndCity("NCR", "Gurgaon")
                .getSubmit();

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", "Dmitrii Aleksandrov")
                .verifyResult("Student Email", "123@mail.com")
                .verifyResult("Gender", "Male")
                .verifyResult("Mobile", "1234567899")
                .verifyResult("Date of Birth", "05 January,2000")
                .verifyResult("Subjects", "Math")
                .verifyResult("Hobbies", "Sports")
                .verifyResult("Address", "Lenina street 1")
                .verifyResult("State and City", "NCR Gurgaon");

    }
}

