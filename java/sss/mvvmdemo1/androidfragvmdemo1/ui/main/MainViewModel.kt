package sss.mvvmdemo1.androidfragvmdemo1.ui.main

import androidx.databinding.Bindable
import androidx.lifecycle.ViewModel
import sss.mvvmdemo1.androidfragvmdemo1.data.TvStation

class MainViewModel : ViewModel() {

    // public properties
    var localStation: TvStation = TvStation()

    var inputCallsign: String = String()
    var inputCity: String = String()
    var inputChannelNumString = String()

    // 'action' method
    fun changeStation() {
        println(">>> changeStation() fired with args")        // this is firing from the XML/data bound tag
        localStation.callsign = inputCallsign                 // bound with 2-way binding @={}
        localStation.city = inputCity
        localStation.channelNum = inputChannelNumString.toInt()
    }

}


