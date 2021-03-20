package com.example.tema1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class ThirdFragmentActivityTwo : Fragment() {

    companion object {
        fun newInstance(): Fragment {
            return ThirdFragmentActivityTwo()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_third_activity_two, container, false)

        return view
    }
}