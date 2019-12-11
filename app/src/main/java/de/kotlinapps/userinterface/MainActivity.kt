package de.kotlinapps.userinterface

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_activity_content_layout.*
import kotlinx.android.synthetic.main.main_activity_layout.*

/**
 * Einstiegspunkt in die App
 */
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //1. Layout setzen
        setContentView(R.layout.main_activity_layout)

        //2. Actionbar setzen
        setSupportActionBar(mainActivityToolbar)

//        btnShowMonsterOne.setOnClickListener { showImageAsset("monster01.webp") }
//        btnShowMonsterTwo.setOnClickListener { showImageAsset("monster02.webp") }
//        btnShowMonsterThree.setOnClickListener { showImageAsset("monster03.webp") }

        //region 3. ButtonHandling
//        btnClickMe.setOnClickListener{
//            val userName = txtNameInput.text.toString()
//            val password = txtInputPassword.text.toString()
//            val loginMsg = getString(R.string.strUserMsgLoginData,userName,password)
//            //TODO Extract String with place holders
//            Toast.makeText(this,
//                loginMsg,
//                Toast.LENGTH_LONG
//            ).show()
//            Snackbar.make(it, loginMsg,Snackbar.LENGTH_LONG)
//                .setAction(R.string.strDetailsText, ({showAnotherMsgAsToastThisTime()}))
//                .show()
//
//        }
        //endregion
//    }

//    private fun showImageResource(resId: Int) {
//        imgvMonster.setImageResource(resId)
//    }

//    private fun showImageAsset(fileName:String){
//        assets.open(fileName).use{
//            val drawable = Drawable.createFromStream(it,null)
//
//            imgvMonster.setImageDrawable(drawable)
//        }
    }
//
//    private fun showAnotherMsgAsToastThisTime() {
//        Toast.makeText(this,
//            R.string.strUserMsgSnackbarCalledToast,
//            Toast.LENGTH_LONG).show()
//    }


}
