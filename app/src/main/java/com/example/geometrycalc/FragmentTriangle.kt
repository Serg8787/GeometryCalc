package com.example.geometrycalc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.doAfterTextChanged
import kotlinx.android.synthetic.main.fragment_triangle.*


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentTriangle.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentTriangle : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_triangle, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        triangle_name_a.doAfterTextChanged {
            if(triangle_name_a.text!!.isNotEmpty()&& triangle_name_b.text!!.isNotEmpty() && triangle_name_c.text!!.isNotEmpty()) {
                areaTriangle()
                perimetrTrianglr()
            }
        }
        triangle_name_b.doAfterTextChanged {
            if(triangle_name_b.text!!.isNotEmpty()&& triangle_name_c.text!!.isNotEmpty() && triangle_name_a.text!!.isNotEmpty()) {
                areaTriangle()
                perimetrTrianglr()
            }
        }
        triangle_name_c.doAfterTextChanged {
            if( triangle_name_a.text!!.isNotEmpty() && triangle_name_b.text!!.isNotEmpty()&& triangle_name_c.text!!.isNotEmpty()) {
                perimetrTrianglr()
                areaTriangle()
            }
        }
    }
    fun perimetrTrianglr(){
        val a = triangle_name_a.text.toString().toInt()
        val b = triangle_name_b.text.toString().toInt()
        val c = triangle_name_c.text.toString().toInt()
        tvAnswerPerimetrTriangle.text ="S = " + (a+b+c).toString()
    }
    fun areaTriangle(){
        val a = triangle_name_a.text.toString().toInt()
        val b = triangle_name_b.text.toString().toInt()
        val c = triangle_name_c.text.toString().toInt()
        val semiPerimeter = (a+b+c) /2
        val area = Math.sqrt((semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c)).toDouble())
        tvAnswerAreaTriangle.text = "P = "+ semiPerimeter.toString()
    }

}