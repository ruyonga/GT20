package com.ruyonga.gadleader.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ruyonga.gadleader.R

class Skillsiq_leader : Fragment() {

    companion object {
        fun newInstance() = Skillsiq_leader()
    }

    private lateinit var viewModel: SkillsiqLeaderViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.skillsiq_leader_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SkillsiqLeaderViewModel::class.java)
        // TODO: Use the ViewModel
    }

}