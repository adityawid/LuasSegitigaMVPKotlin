package com.devjurnal.luassegitigamvpkotlin

import android.widget.EditText

/**
 * Created by DevJurnal on 2/17/18.
 */
// TODO (4) tambahkan implement : HitungPresenter
class HitungPresenterImp : HitungPresenter{

    // TODO (5) tambah var MainView
    var modelView : MainView? = null

    // TODO (6) buat constructor
    constructor(modelView: MainView?) {
        this.modelView = modelView
    }

    override fun hitungLuas(nilai1: EditText, nilai2: EditText) {
        var a = nilai1.text.toString()
        var t = nilai2.text.toString()
        if(a.isNotEmpty() || t.isNotEmpty()) {
            // convert nilai ke double
            var alas = a.toDouble()
            var tinggi = t.toDouble()

            // masukkan ke rumus
            var hasil = 0.5 * alas * tinggi

            // TODO (7) hubungkan dengan mainView
            modelView?.Hasil(hasil.toString())
        } else{
            modelView?.kosong()
        }

    }

}