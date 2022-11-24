package com.demoqa;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class FakerTest extends TestBase {
    Faker faker = new Faker();
    @Test
    protected void fillFormTest() {
        String userName = faker.name().firstName(),
                lastName = faker.name().lastName(),
                email = faker.internet().emailAddress(),
                gender = "Male",
                phone = faker.phoneNumber().subscriberNumber(10),
                day = "05",
                month = "January",
                year = "2000",
                subject = "Math",
                file = "C:/Users/User/IdeaProjects/HW2-demoqa/src/test/resources/test.jpg",
                hobbies = "Sports",
                address = faker.address().fullAddress(),
                state = "NCR",
                city = "Gurgaon";

        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender(gender)
                .setNumber(phone)
                .setBirthDate(day, month, year)
                .setSubject(subject)
                .setHobby(hobbies)
                .setUploadPicture(file)
                .setAddress(address)
                .setStateAndCity(state , city)
                .getSubmit();

        registrationPage.verifyResultsModalAppears()
                .verifyResult("Student Name", userName+" "+lastName)
                .verifyResult("Student Email", email)
                .verifyResult("Gender", gender)
                .verifyResult("Mobile", phone)
                .verifyResult("Date of Birth", day+" "+month+","+year)
                .verifyResult("Subjects", subject)
                .verifyResult("Hobbies", hobbies)
                .verifyResult("Address", address)
                .verifyResult("State and City", state+" "+city);

    }
}

