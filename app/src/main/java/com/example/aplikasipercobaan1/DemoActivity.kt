package com.example.aplikasipercobaan1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplikasipercobaan1.ui.theme.AplikasiPercobaan1Theme

class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val warnaUngu = 0xffc791c7
        setContent {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.chopper   ),
                    contentDescription = "Gambar"
                )

                Surface(
                    color = Color.Yellow,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Tony tony chopper",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                        color = Color(warnaUngu),
                        textAlign = TextAlign.Center
                    )
                }

                Surface(
                    color = Color.Cyan,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Suka Makanan Manis",
                        modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 4.dp),
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}