package com.example.tema1

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.tema1.interfaces.ActivityFragmentCommunication

class SecondFragmentActivityTwo : Fragment() {
    var activityFragmentCommunication: ActivityFragmentCommunication? = null

    companion object {
        fun newInstance(): Fragment {
            return SecondFragmentActivityTwo()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        when (context) {
            is ActivityFragmentCommunication ->
                activityFragmentCommunication = context
        }
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_two_activity_two, container, false)


        val button1 = view.findViewById<Button>(R.id.button1)
        button1.setOnClickListener {
            activityFragmentCommunication?.onReplaceFragment(ThirdFragmentActivityTwo::class.java.name)
        }

        val button2 = view.findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            activityFragmentCommunication?.onReplaceFragment(FirstFragmentActivityTwo::class.java.name)
        }

        val button3 = view.findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            getActivity()?.finish();
        }
        return view
    }
}