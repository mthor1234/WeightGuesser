package com.thornton.weightguesser

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.Intents.intending
import androidx.test.espresso.intent.matcher.IntentMatchers.*
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.GrantPermissionRule
import androidx.test.runner.AndroidJUnit4
import com.thornton.weightguesser.views.MainActivity
import org.hamcrest.CoreMatchers.allOf
import org.hamcrest.CoreMatchers.not
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Created by MJ Thornton
 * 2019-09-07
 *
 */
//@RunWith(AndroidJUnit4::class)
//class GrantPermissionsActivityTest {
//
//    @get:Rule var permissionRule = GrantPermissionRule.grant(android.Manifest.permission.CAMERA)
//    @get:Rule var activityRule = IntentsTestRule(MainActivity::class.java)
//
//    @Before
//    fun stubAllExternalIntents(){
//        intending(not(isInternal())).respondWith(Instrumentation.ActivityResult(Activity.RESULT_OK, null))
//    }
//
//    @Test
//    fun callButtonIsDisplayed() {
//        onView(withId(R.id.capture_button)).check(matches(isDisplayed()))
//    }
//
//    @Test
//    fun callButtonOpensDialer(){
//        onView(withId(R.id.capture_button)).perform(click())
//
//        intended(allOf(hasAction(Intent.ACTION_CAMERA_BUTTON),
//                            hasData(GrantPermission)))
//    }
//
//}