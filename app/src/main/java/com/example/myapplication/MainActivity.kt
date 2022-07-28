package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : AppCompatActivity() {

    lateinit var nacController : NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.main_container , FirstFragment())
            .commit()

   /*     setContent {
            MyApplicationTheme {
                nacController = rememberNavController()
                SetupNavController(navController = nacController)
            }
        }*/
    }
}

@Preview(showSystemUi = true, device = Devices.PIXEL)
@Composable
fun Hello(x: String = "") {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(
            modifier = Modifier.padding(
                top = 16.dp,
                bottom = 16.dp,
                start = 16.dp
            ), horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = stringResource(id = R.string.app_name),
                Modifier.padding(16.dp)
            )
            Text(
                text = stringResource(id = R.string.app_name),
                Modifier.padding(16.dp)
            )
        }

        MyButton()

    }
}

@Composable
fun MyButton() {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            backgroundColor =
            colorResource(id = R.color.purple_500)
        ),
        border = BorderStroke(
            1.dp,
            color = colorResource(id = R.color.purple_200)
        )
    ) {
        Text(text = "Login")
    }
}

/*
@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}*/
