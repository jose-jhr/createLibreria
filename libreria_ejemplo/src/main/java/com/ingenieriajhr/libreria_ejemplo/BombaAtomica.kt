package com.ingenieriajhr.libreria_ejemplo

import android.content.Context
import android.widget.Toast

class BombaAtomica(val context: Context) {


    fun explotar(){
        val tt = Toast.makeText(context, "EXPLOTANDO", Toast.LENGTH_SHORT)
        tt.show()
    }

}