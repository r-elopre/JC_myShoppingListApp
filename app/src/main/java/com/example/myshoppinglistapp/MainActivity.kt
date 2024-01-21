package com.example.myshoppinglistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myshoppinglistapp.ui.theme.MyShoppingListAppTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyShoppingListAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var sItems by remember { mutableStateOf(listOf<ShoppingItem>()) }
                    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) 
                    {
                        Button (modifier = Modifier.align(Alignment.CenterHorizontally), onClick = { /*TODO*/ })
                        { Text("Add item") }
                    }
                    LazyColumn( modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)) {

                    }
                }
            }
        }
    }
}

data class shoppingItem ( val id: Int, var name: String, var quantitty: Int, var isEditing: Boolean = false)

