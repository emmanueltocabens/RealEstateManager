package com.polishedgames.realestatemanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.polishedgames.realestatemanager.ui.theme.RealEstateManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RealEstateManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){}
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "login"){
                    composable("home"){ HomeDestination()}
                    composable("add"){ AddEstate()}
                }
            }
        }
    }
}

@Composable
fun HomeDestination(modifier: Modifier? = Modifier){

}

@Composable
fun AddEstate(modifier: Modifier? = Modifier){

}

@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    val navController = rememberNavController()
    Button(onClick = {navController.navigate("")}) {
        Text(
            text = "Login",
            modifier = modifier
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    RealEstateManagerTheme {
        LoginScreen()
    }
}