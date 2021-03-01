package com.technocopy.weatherapp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class TenDaysWeatherFragment : Fragment() {

    companion object {
        fun newInstance() = TenDaysWeatherFragment()
    }

    private lateinit var viewModel: TenDaysWeatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.ten_days_weather_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TenDaysWeatherViewModel::class.java)
        // TODO: Use the ViewModel
    }

}