package com.ruyonga.gadleader.lboard

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.ruyonga.gadleader.R
import com.ruyonga.gadleader.interfaces.LeaderAPI
import com.ruyonga.gadleader.model.TopLearners
import com.ruyonga.gadleader.service.ServiceBuilder
import kotlinx.android.synthetic.main.learning_board_fragment.*
import retrofit2.Call
import retrofit2.Response

class LearningBoard : Fragment() {

    private lateinit var viewModel: LearningBoardViewModel

    override fun onCreateView(inflater: LayoutInflater,container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.learning_board_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LearningBoardViewModel::class.java)
        val request = ServiceBuilder.buildService(LeaderAPI::class.java)
        val call = request.getLearnerLeaders()
        call.enqueue(object : retrofit2.Callback<TopLearners> {
            override fun onResponse(call: Call<TopLearners>, response: Response<TopLearners>) {
                Log.d("response", response.toString())
                if (response.isSuccessful) {
                    Log.d("Learning", response.message())
                    leadersRecyclerView.setHasFixedSize(true)
                    leadersRecyclerView.adapter = LeaderBoardRecyclerViewAdapter(response.body()!!.results)
                }
            }

            override fun onFailure(call: Call<TopLearners>, t: Throwable) {
                t.printStackTrace()
                Toast.makeText(activity, "${t.message}", Toast.LENGTH_SHORT).show()
            }
        })

    }

}