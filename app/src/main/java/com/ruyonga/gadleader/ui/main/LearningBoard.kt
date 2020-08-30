package com.ruyonga.gadleader.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ruyonga.gadleader.R

class LearningBoard : Fragment() {

    companion object {
        fun newInstance() = LearningBoard()
    }

    private lateinit var viewModel: LearningBoardViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.learning_board_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LearningBoardViewModel::class.java)
        // TODO: Use the ViewModel
    }

}