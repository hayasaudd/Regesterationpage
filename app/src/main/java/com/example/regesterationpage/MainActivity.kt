package com.example.regesterationpage

import android.annotation.SuppressLint
import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.regesterationpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // copier it with xml code
        binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)
        binding.button.setOnClickListener { infoUser() }

    }


    @SuppressLint("SetTextI18n")
    fun infoUser (){

        val nameuser = binding.userName.editText.toString()

        val email = binding.editTextTextEmailAddress.editText
        val birthdate = binding.editTextDate.editText.toString()
        val password = binding.editTextNumberPassword.editText.toString()
        val password2 = binding.editTextNumberPassword2.editText.toString()
        val finaltextmasseg = binding.textMassege




        //chek the name, email ,password, and birthday date its wrote or not
        if (nameuser.toString().isEmpty() && email.toString().isEmpty() && birthdate.isEmpty() && password.toString().isEmpty() && password2.toString().isEmpty())
        {
            finaltextmasseg.text = "yor information is not completed tray to fill it again"
        }else if (password==password2){ //check the password similar renter password or not
            // display information
            binding.textMassege.text="your name is $nameuser ......... your mail is $email ........  you last number of password is ${password2.last()}" } else finaltextmasseg.text="not the same password" }
}


















