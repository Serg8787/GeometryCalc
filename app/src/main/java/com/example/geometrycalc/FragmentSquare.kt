package com.example.geometrycalc

import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_square.*


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentSquare.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentSquare : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_square, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        squre_name_a.setOnKeyListener { v, keyCode, event ->
            if (event.action === KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                val s = squre_name_a.text.toString()
                val x: Int =  s.toInt()
                tvAnswerAreaSquare.text  ="S =" + (x * 2).toString()
                tvAnswerPerimetrSquare.text ="P = "+ (x *4).toString()
                true
            } else false
        }
    }

}