package com.example.tema1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class FragmentOneActivityOne : Fragment() {

    companion object {
        fun newInstance(): Fragment {
            return FragmentOneActivityOne()
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_one_activity_one, container, false)

        val button = view.findViewById<Button>(R.id.goToActivityTwo)
        button.setOnClickListener()
        {
            chageActivityWithActivityTwo();
        }
        return view
    }

    fun chageActivityWithActivityTwo() {
        val intent = Intent(getActivity(), ActivityTwo::class.java)
        getActivity()?.finish();
        getActivity()?.startActivity(intent)
    }

}