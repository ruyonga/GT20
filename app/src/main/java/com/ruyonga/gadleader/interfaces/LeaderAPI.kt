package com.ruyonga.gadleader.interfaces

import com.ruyonga.gadleader.model.TopLearners
import retrofit2.Call
import retrofit2.http.GET

interface LeaderAPI {

    @GET("hours")
    fun getLearnerLeaders(): Call<TopLearners>

    @GET("skilliq")
    fun getSkillsIQLeader(): Call<TopLearners>
}