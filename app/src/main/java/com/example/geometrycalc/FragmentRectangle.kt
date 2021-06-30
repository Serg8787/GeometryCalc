package com.example.geometrycalc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import kotlinx.android.synthetic.main.fragment_rectangle.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankRectangle.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentRectangle : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rectangle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rectangle_name_l.doAfterTextChanged {
            if(  rectangle_name_l.text!!.isNotEmpty() && rectangle_name_w.text!!.isNotEmpty()) {
                perimetrRectangle()
                areaRectangle()
            }
        }
        rectangle_name_w.doAfterTextChanged {
            if( rectangle_name_l.text!!.isNotEmpty() && rectangle_name_w.text!!.isNotEmpty()) {
                perimetrRectangle()
                areaRectangle()
            }
        }

    }
    fun perimetrRectangle(){
        val a = rectangle_name_l.text.toString().toInt()
        val b = rectangle_name_w.text.toString().toInt()

        tvAnswerPerimetrRectangle.text ="P =" + ((a+b)*2).toString()
    }
    fun areaRectangle(){
        val a = rectangle_name_l.text.toString().toInt()
        val b = rectangle_name_w.text.toString().toInt()
        val area = a * b
        tvAnswerAreaRectangle.text = "S =" + area.toString()
    }


}