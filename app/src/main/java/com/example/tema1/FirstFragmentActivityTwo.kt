package com.example.tema1

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.tema1.interfaces.ActivityFragmentCommunication

class FirstFragmentActivityTwo : Fragment() {

    var activityFragmentCommunication: ActivityFragmentCommunication? = null

    companion object {
        fun newInstance(): Fragment {
            return FirstFragmentActivityTwo()
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
        val view = inflater.inflate(R.layout.fragment_one_activity_two, container, false)

        val button = view.findViewById<Button>(R.id.goToFragmentTwo)
        button.setOnClickListener{
            activityFragmentCommunication?.onAddFragment(SecondFragmentActivityTwo::class.java.name)
        }
        return view
    }


}