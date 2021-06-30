package com.example.geometrycalc

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val fragmenLayout = inflater.inflate(R.layout.fragment_main,fragmentContainerView,false)
        val navController = NavHostFragment.findNavController(this)

        fragmenLayout.conslTriangle.setOnClickListener { navController.navigate(R.id.fragmentTriangle) }
        fragmenLayout.constlRectangle.setOnClickListener { navController.navigate(R.id.fragmentRectangle) }
        fragmenLayout.constlSquare.setOnClickListener { navController.navigate(R.id.fragmentSquare) }
        return fragmenLayout

    }
}