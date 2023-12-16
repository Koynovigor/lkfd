package com.leonikl.lkfd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.leonikl.lkfd.ui.theme.LkfdTheme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LkfdTheme {
                // A surface container using the 'background' color from the theme
                var t by remember {
                    mutableStateOf(14)
                }
                Scaffold(
                    content = {
                        it
                    },
                    topBar = {
                        CenterAlignedTopAppBar(
                            title = {
                                Text(
                                    text = "jfgh",
                                )
                            }
                        )
                    },
                    bottomBar = {
                        CenterAlignedTopAppBar(
                            title = {
                                Text(
                                    text = "jfgh",
                                )
                            }
                        )
                    },
                    floatingActionButton = {
                        Text(text = "djkhf")
                    },
                    floatingActionButtonPosition = FabPosition.Center,
                )
            }
        }
    }
}


