package com.demoqa;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FirstTest {
    @Test
    void fillFormTest() {
        open("https://demoqa.com/automation-practice-form");

        $("#firstname").setValue("Dmitrii");
        $("#lastname").setValue("Aleksandrov");
        $("#userEmail").setValue("123@mail.com");
        $("#gender-radio-1").click();
        $("#userNumber").setValue("1234567899");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption("January");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__year-select").selectOption("2000");
        $(".react-datepicker__year-select").click();
        $(".react-datepicker__day--005").click();
        $("#subjectsInput").setValue("Math");




    }
}

