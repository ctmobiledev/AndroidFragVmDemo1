package sss.mvvmdemo1.androidfragvmdemo1.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.main_fragment.*           // dropped in automatically with reference to symbol
import sss.mvvmdemo1.androidfragvmdemo1.databinding.MainFragmentBinding


class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var mainViewModel: MainViewModel
    private lateinit var binding: MainFragmentBinding           // automatically generated name


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        println(">>> onCreateView() fired")

        // Get the viewModel pointer by way of this special method
        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java!!)

        // Set the values in the localStation public property
        mainViewModel.localStation.callsign = "WTTW"
        mainViewModel.localStation.city = "CHICAGO"
        mainViewModel.localStation.channelNum = 11

        // Get the binding object as a result of inflating the UI XML file
        binding = DataBindingUtil.inflate(
            inflater, sss.mvvmdemo1.androidfragvmdemo1.R.layout.main_fragment, container, false)

        /*
        // Plug the viewModel into the binding's 'slot' for the viewModel object. From the UI XML layout file:
        <variable
            name="mainViewModel"
            type="sss.mvvmdemo1.androidfragvmdemo1.ui.main.MainViewModel" />

        */
        binding.mainViewModel = mainViewModel


        //***************************************************************************
        // NOTE:
        // Each 'binding' child is associated with a <data> tag in the UI XML file
        //***************************************************************************

        // Pass the binding object back for viewing, filled with whatever we wanted to show.
        return binding.root

    }


}
