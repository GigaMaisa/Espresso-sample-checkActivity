package com.ghedamsisabri.ui_testing_for_beginner

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.ghedamsisabri.ui_testing_for_beginner.Helper.*
import org.hamcrest.Matcher
import org.junit.Assert

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Rule


@RunWith(AndroidJUnit4::class)
@LargeTest
class ExampleInstrumentedTest {
    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun clickOnNextButtonAndValidateActivityHasChanged() {
        nextButtonOnFirstPageActivity.tap(5)
        secondPageActivityTitle.isViewDisplayed()
        isTextOnScreen("SecondaryActivity")
        backButtonOnSecondPageActivity.assertIsViewDisplayed()
        backButtonOnSecondPageActivity.isViewDisplayed()
    }

    companion object{
        val nextButtonOnFirstPageActivity: Matcher<View> by lazy { withId(R.id.button_next_activity) }
        val secondPageActivityTitle: Matcher<View> by lazy { withId(R.id.activity_secondary_title) }
        val backButtonOnSecondPageActivity: Matcher<View> by lazy { withId(R.id.button_back) }
    }
}