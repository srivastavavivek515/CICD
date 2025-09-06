package com.example.cicdkotlin

import android.app.Activity
import androidx.test.core.app.ActivityScenario

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class CheckWithInstrumation {

    @Test
    fun launchActivity(){
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.name))
            .perform(typeText("vivek"),closeSoftKeyboard() )

        onView(withId(R.id.on_click)).perform(click())

        onView(withId(R.id.passed_name)).check(matches(withText("vivek")))
    }


}