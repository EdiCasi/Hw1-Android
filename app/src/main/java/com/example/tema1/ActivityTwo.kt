package com.example.tema1

import android.app.PendingIntent.getActivity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.tema1.interfaces.ActivityFragmentCommunication

class ActivityTwo : AppCompatActivity(), ActivityFragmentCommunication {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        replaceWithFirstFragment()
    }

    fun replaceWithFirstFragment() {
        val fragmentManager = supportFragmentManager

        val transaction = fragmentManager.beginTransaction()

        val fragmentOneActivityOne = FirstFragmentActivityTwo.newInstance()

        val TAG = FirstFragmentActivityTwo::class.java.name

        val replaceTransaction = transaction.replace(
                R.id.fl_container,
                fragmentOneActivityOne,
                TAG
        )

        replaceTransaction.addToBackStack(TAG)

        replaceTransaction.commit()
    }

    override fun onReplaceFragment(TAG: String) {
        val fragmentManager = supportFragmentManager

        val transaction = fragmentManager.beginTransaction()


        val fragment = when (TAG) {
            FirstFragmentActivityTwo::class.java.name ->
                FirstFragmentActivityTwo.newInstance()

            SecondFragmentActivityTwo::class.java.name ->
                SecondFragmentActivityTwo.newInstance()

            ThirdFragmentActivityTwo::class.java.name ->
                ThirdFragmentActivityTwo.newInstance()

            else->ThirdFragmentActivityTwo.newInstance()
        }

        val replaceTransaction = transaction.replace(
                R.id.fl_container,
                fragment,
                TAG
        )

        replaceTransaction.commit()
    }

    override fun onAddFragment(TAG: String) {
        val fragmentManager = supportFragmentManager

        val transaction = fragmentManager.beginTransaction()


        val fragment = when (TAG) {
            FirstFragmentActivityTwo::class.java.name ->
                FirstFragmentActivityTwo.newInstance()

            SecondFragmentActivityTwo::class.java.name ->
                SecondFragmentActivityTwo.newInstance()

            ThirdFragmentActivityTwo::class.java.name ->
                ThirdFragmentActivityTwo.newInstance()

            else->ThirdFragmentActivityTwo.newInstance()
        }

        val addTransaction = transaction.add(
                R.id.fl_container,
                fragment,
                TAG
        )

        addTransaction.commit()
    }


    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}