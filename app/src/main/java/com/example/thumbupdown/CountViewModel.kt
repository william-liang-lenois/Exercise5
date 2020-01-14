package com.example.thumbupdown

import androidx.lifecycle.ViewModel


class CountViewModel : ViewModel() {

    //Module-level variable
    var countLike: Int = 0
    var countDislike: Int = 0

}