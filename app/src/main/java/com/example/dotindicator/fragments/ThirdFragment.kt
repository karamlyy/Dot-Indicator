package com.example.dotindicator.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dotindicator.R
import com.example.dotindicator.SecondActivity
import com.example.dotindicator.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding ?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThirdBinding.inflate(inflater, container, false)
        binding.getStarted.setOnClickListener {
            val intent = Intent(this@ThirdFragment.requireContext(), SecondActivity::class.java)
            startActivity(intent)
        }

        return binding.root
    }


}