package com.example.rewards

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.shareButton->{
                shareApp()
            }
        }
        return super.onOptionsItemSelected(item)
    }
     private fun shareApp() {
         val appMsg :String ="Hey!,Check out this app for Share Button:-"+
                 "https://play.google.com/store/apps/details?id=com.example.rewards"

         val intent = Intent()
         intent.action = Intent.ACTION_SEND
         intent.putExtra(Intent.EXTRA_TEXT,appMsg)
         intent.type="text/plain"
         startActivity(intent)
     }

}