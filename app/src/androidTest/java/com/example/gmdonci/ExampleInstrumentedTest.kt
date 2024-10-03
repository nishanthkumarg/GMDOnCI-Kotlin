package com.example.gmdonci

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.gmdonci", appContext.packageName)
    }

    //Passing tests
    @Test
    fun passingTest1(){
        assert(true)
    }

    @Test
    fun passingTest2(){
        assert(true)
    }

    //Failing tests
    @Test
    fun failingTest1(){
        assert(true)
    }

    @Test
    fun failingTest2(){
        assert(true)
    }

    @Test
    fun failingTest3(){
        assert(true)
    }

    @Test
    fun failingTest4(){
        assert(true)
    }

    @Test
    fun failingTest5(){
        assert(true)
    }

    @Test
    fun failingTest6(){
        assert(true)
    }

    @Test
    fun failingTest7(){
        assert(true)
    }

    @Test
    fun failingTest8(){
        assert(true)
    }


}