package sss.mvvmdemo1.androidfragvmdemo1.data

import androidx.databinding.BaseObservable

class TvStation : BaseObservable() {

    // NOTE: Both these setters refer to child properties from tvStation, but since either child change
    // changes the value of the parent tvStation, that's the thing we flag with notifyPropertyChange.

    // It took a proper get and set for each property - with a public and private copy of a variable - to make this
    // work and eliminate the infinite loop I was getting with just a 'set' to the public value.

    // Using notifyChange was enough.

    private var _callsign: String = String()
    var callsign: String
        get() {
            return _callsign
        }
        set(value) {
            this._callsign = value
            notifyChange()
        }

    private var _city: String = String()
    var city: String
        get() {
            return _city
        }
        set(value) {
            this._city = value
            notifyChange()
        }

    private var _channelNum: Int = 0
    var channelNum: Int
        get() {
            return _channelNum
        }
        set(value) {
            this._channelNum = value
            notifyChange()
        }

}

