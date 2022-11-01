package com.example.aplikasipercobaan1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aplikasipercobaan1.ui.theme.AplikasiPercobaan1Theme

class Tugas_2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AplikasiPercobaan1Theme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    Column(Modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposableInfoCard(
                title = stringResource(R.string.luffy),
                description = stringResource(R.string.luffychwan),
                backgroundColor = Color(0xFFe0091f),
                image = R.drawable.luffy,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.zoro),
                description = stringResource(R.string.zorochwan),
                backgroundColor = Color(0xFF388518),
                image = R.drawable.zoro,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.sanji),
                description = stringResource(R.string.sanjichwan),
                backgroundColor = Color.Yellow,
                image = R.drawable.sanji,
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            modifier = Modifier.weight(1f)
        ) {
            ComposableInfoCard(
                title = stringResource(R.string.nami),
                description = stringResource(R.string.namichwan),
                backgroundColor = Color(0xfff7521b) ,
                image = R.drawable.nami,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.chopper),
                description = stringResource(R.string.chopperchwan),
                backgroundColor = Color(0xfff57fd4),
                image = R.drawable.chopper,
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.usop),
                description = stringResource(R.string.bakausop),
                backgroundColor = Color(0xfff7bd48),
                image = R.drawable.usop,
                modifier = Modifier.weight(1f)
            )

        }

    }
}

// weight issue : https://stackoverflow.com/questions/64751198/column-weight-distribution-in-compose

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    image:Int,
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = image),
            contentDescription = "luffy",
            modifier = Modifier
                .padding(bottom = 24.dp)
                .clip(RoundedCornerShape(percent = 50))
                .border(4.dp, Color.White, CircleShape)
        )

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp),
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}



@Preview(showBackground = true)
@Composable
fun BirthDayCardPreview() {
    AplikasiPercobaan1Theme() {
        ComposeQuadrantApp()
    }
}