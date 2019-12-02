package com.tutorialsbuzz.androidoptionmenu

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_item1 -> {
                showMessage(resources.getString(R.string.action_item1) + " clicked")
                true
            }

            R.id.action_item2 -> {
                showMessage(resources.getString(R.string.action_item2) + " clicked")
                true
            }

            R.id.action_item3 -> {
                showMessage(resources.getString(R.string.action_item3) + " clicked")
                true
            }

            R.id.action_item4 -> {
                showMessage(resources.getString(R.string.action_item4) + " clicked")
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun showMessage(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
}
