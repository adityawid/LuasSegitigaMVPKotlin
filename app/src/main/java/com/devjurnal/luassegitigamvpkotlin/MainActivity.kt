package com.devjurnal.luassegitigamvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    // TODO (8) buat presenter
    lateinit var presenter : HitungPresenterImp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // todo (9) initPresenter
        initPresenter()

        // TODO (10) initView Button
        initView()
    }

    private fun initView() {
        //  TODO (11) tentukan Action pada view
        btnHitung.setOnClickListener {
            presenter.hitungLuas(edtAlas,edtTinggi)
        }
    }

    private fun initPresenter() {
        presenter = HitungPresenterImp(this)
    }

    override fun kosong() {
        Toast.makeText(applicationContext, "Input Kosong", Toast.LENGTH_SHORT).show()
    }

    override fun Hasil(nilai: String) {
        // TODO (12) tampilkan hasil ke layout
        tvHasil.text = nilai
    }
}
